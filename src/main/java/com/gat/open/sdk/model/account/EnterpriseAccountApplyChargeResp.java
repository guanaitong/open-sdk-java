/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.account;

public class EnterpriseAccountApplyChargeResp {
    /**
     * 业务号
     */
    private String externalCode;
    /**
     * 充值申请对应的openid
     */
    private String applyChargeOpenid;

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public String getApplyChargeOpenid() {
        return applyChargeOpenid;
    }

    public void setApplyChargeOpenid(String applyChargeOpenid) {
        this.applyChargeOpenid = applyChargeOpenid;
    }
}
