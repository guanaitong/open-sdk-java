/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.response;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.math.BigDecimal;

/**
 * @author shuai.zhao@guaniatong.com
 */
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class IncomeTransactionResponse {

    /**
     * 交易发生时间。格式：yyyy-MM-dd HH:mm:ss
     */
    private String timeCreated;
    /**
     * 关爱通订单号。默认是：appId + 供应商订单号。
     */
    private String outerTradeNo;

    /**
     * 交易流水号。
     */
    private String tradeNo;
    /**
     * 交易来源应用。
     */
    private String sourceAppId;
    /**
     * 积分收入。
     */
    private BigDecimal usePoint;
    /**
     * 现金收入。
     */
    private BigDecimal useCash;
    /**
     * 交易备注。
     */
    private String remark;

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getSourceAppId() {
        return sourceAppId;
    }

    public void setSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
    }

    public BigDecimal getUsePoint() {
        return usePoint;
    }

    public void setUsePoint(BigDecimal usePoint) {
        this.usePoint = usePoint;
    }

    public BigDecimal getUseCash() {
        return useCash;
    }

    public void setUseCash(BigDecimal useCash) {
        this.useCash = useCash;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
