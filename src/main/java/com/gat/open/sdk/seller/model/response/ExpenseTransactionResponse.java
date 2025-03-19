/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
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
public class ExpenseTransactionResponse {


    /**
     * 交易发生时间。格式：yyyy-MM-dd HH:mm:ss
     */
    private String timeCreated;

    /**
     * 关爱通退款单号。
     */
    private String refundOuterTradeNo;

    /**
     * 交易所属应用
     */
    private String sourceAppId;

    /**
     * 交易流水号
     */
    private String tradeNo;

    /**
     * 退款交易号
     */
    private String refundTradeNo;

    /**
     * 关爱通订单号（对应收入项的订单号）。
     */
    private String outerTradeNo;

    /**
     * 积分支出（退积分）
     */
    private BigDecimal usePoint;

    /**
     * 现金支出（退现金）
     */
    private BigDecimal useCash;

    /**
     * 交易备注
     */
    private String remark;

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getRefundOuterTradeNo() {
        return refundOuterTradeNo;
    }

    public void setRefundOuterTradeNo(String refundOuterTradeNo) {
        this.refundOuterTradeNo = refundOuterTradeNo;
    }

    public String getSourceAppId() {
        return sourceAppId;
    }

    public void setSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getRefundTradeNo() {
        return refundTradeNo;
    }

    public void setRefundTradeNo(String refundTradeNo) {
        this.refundTradeNo = refundTradeNo;
    }

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
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
