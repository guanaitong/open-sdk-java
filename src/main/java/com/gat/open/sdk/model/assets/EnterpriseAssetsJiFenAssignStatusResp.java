/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;


public class EnterpriseAssetsJiFenAssignStatusResp {
    /**
     * 员工工号
     */
    private String corpCode;
    /**
     * 发放积分金额
     */
    private BigDecimal amount;
    /**
     * 外部交易号
     */
    private String externalCode;
    /**
     * 发放状态。1：失败；2：完成；3：取消；4：延时
     */
    private Integer status;
    /**
     * 积分发放时间，格式：yyyy-MM-dd
     */
    private String timeAssign;

    public String getCorpCode() {
        return corpCode;
    }

    public void setCorpCode(String corpCode) {
        this.corpCode = corpCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @JsonProperty("externalCode")
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

    public String getTimeAssign() {
        return timeAssign;
    }

    public void setTimeAssign(String timeAssign) {
        this.timeAssign = timeAssign;
    }
}
