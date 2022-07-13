/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.notify;

import com.gat.open.sdk.model.notify.BaseMsg;
import com.gat.open.sdk.model.notify.NotifyEnterpriseCharge;
import com.gat.open.sdk.util.JSON;
import org.junit.Test;

public class NotifyDecoderTest {
    private static NotifyDecoder notifyDecoder = new NotifyDecoder("iNqxftHhZ1KE6", "lIBgOcDhzOwJoLxc");

    @Test
    public void getEnterpriseChargeDataTest() {
        BaseMsg baseMsg = new BaseMsg();
        baseMsg.setMsgEncrypt("qz1EVHjG1SJjD+75ng7L3a2yvbSACz0fnxrUEZt7ZIoQ+dYxhNgut0Xbok63QsHkmBymfREaXAdHzIG0OPKiryGYgDzYtGO/PIyl0lBTdJa6YhfyW6PQcQH4fQ1oj8VVQQQWbGYbBLGmt+M0Lc3kCXa8G2vFFYBwW6ylrd+V5RSinTovHQYOhdSmjQJjkN9PlMr7gmVVBNAoJbmv6RLKE7+QX3yxLS6ix+IWQNrrnlnqQMGGRp8lJ5u8p6rMGtxmIwbWXb51sbvXYYBSd847eMP44jODsyTuf7xau8VsPL4UwOv47e3dRGq4NgqVgc2+xCRRJH0iexwJZpbhdjIMxYdi2gGEhDWjT7QPcsGCpOnpvEDIw3fFJfuMXBJY9C+Uq/M0ywur/5kfZv57NegN4A==");
        baseMsg.setMsgSignature("e3620896a1c7daa20aefc8cc1382f95a36e92f33");
        baseMsg.setNonce("pap8sz");
        baseMsg.setTimestamp("1657696557");
        NotifyEnterpriseCharge enterpriseChargeData = notifyDecoder.getEnterpriseChargeData(baseMsg);
        System.out.println(JSON.toJSONString(enterpriseChargeData));
    }
}
