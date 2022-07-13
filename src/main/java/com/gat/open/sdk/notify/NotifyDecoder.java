/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.notify;

import com.gat.open.sdk.exception.OpenSdkException;
import com.gat.open.sdk.model.notify.BaseMsg;
import com.gat.open.sdk.model.notify.NotifyBase;
import com.gat.open.sdk.model.notify.NotifyEmployeeBalance;
import com.gat.open.sdk.model.notify.NotifyEmployeeSync;
import com.gat.open.sdk.model.notify.NotifyEnterpriseCharge;
import com.gat.open.sdk.model.notify.NotifyEnterpriseOpen;
import com.gat.open.sdk.tool.AESCrypt;
import com.gat.open.sdk.util.JSON;
import com.gat.open.sdk.util.SignUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 通知解密信息工具类
 */
public class NotifyDecoder {
    private String token;
    private String aesKey;

    public NotifyDecoder(String token, String aesKey) {
        this.token = token;
        this.aesKey = aesKey;
    }

    private <T> T parse(BaseMsg baseMsg, Class<T> clazz) {
        Map<String, Object> signMap = new HashMap<>();
        signMap.put("timestamp", baseMsg.getTimestamp());
        signMap.put("nonce", baseMsg.getNonce());
        signMap.put("msg_encrypt", baseMsg.getMsgEncrypt());
        //检查签名
        String sign = SignUtils.calculate(signMap, token);
        if (!Objects.equals(sign, baseMsg.getMsgSignature())) {
            throw new OpenSdkException("notify signature check fail");
        }

        return JSON.parse(AESCrypt.decode(aesKey, baseMsg.getMsgEncrypt()), clazz);
    }

    /**
     * 拿到统一类，可以进行以下判断获取对应返回值，代码如下：
     * if (NotifyConstants.NOTIFY_KEY_ENTERPRISE_OPEN_RESULT.equals(notifyBase.getNotifyKey())) {
     * return getEnterpriseOpenData(baseMsg);
     * } else if (NotifyConstants.NOTIFY_KEY_EMPLOYEE_SYNC_RESULT.equals(notifyBase.getNotifyKey())) {
     * return getEmployeeSyncData(baseMsg);
     * } else if (NotifyConstants.NOTIFY_KEY_EMPLOYEE_BALANCE_CHANGE.equals(notifyBase.getNotifyKey())) {
     * return getEmployeeBalanceData(baseMsg);
     * } else if (NotifyConstants.NOTIFY_KEY_ENTERPRISE_ACCOUNT_CHARGE.equals(notifyBase.getNotifyKey())) {
     * return getEnterpriseChargeData(baseMsg);
     * }
     *
     * @param baseMsg
     * @return
     */
    public NotifyBase unityToData(BaseMsg baseMsg) {
        return parse(baseMsg, NotifyBase.class);
    }

    public NotifyEnterpriseOpen getEnterpriseOpenData(BaseMsg baseMsg) {
        return parse(baseMsg, NotifyEnterpriseOpen.class);
    }

    public NotifyEmployeeSync getEmployeeSyncData(BaseMsg baseMsg) {
        return parse(baseMsg, NotifyEmployeeSync.class);
    }

    public NotifyEmployeeBalance getEmployeeBalanceData(BaseMsg baseMsg) {
        return parse(baseMsg, NotifyEmployeeBalance.class);
    }

    public NotifyEnterpriseCharge getEnterpriseChargeData(BaseMsg baseMsg) {
        return parse(baseMsg, NotifyEnterpriseCharge.class);
    }
}
