/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

public class EnterpriseAssetsLimitAssignStatusResp {
    /**
     * 外部交易号
     */
    private String externalCode;
    /**
     * 发放状态。1 发放中 2 发放成功 6 回收成功，不存在或失败则返回 code 不为0
     */
    private Integer status;

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
