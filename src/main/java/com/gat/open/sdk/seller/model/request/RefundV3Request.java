/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

import com.gat.open.sdk.model.JsonRequest;
import com.gat.open.sdk.seller.model.Response.RefundV3Response;

import java.math.BigDecimal;

public class RefundV3Request extends JsonRequest<RefundV3Response> {
    public RefundV3Request() {
        noSnake = true;
    }
    private String refundSeqNo;
    private String refundOrderNo;
    private String orderNo;
    private String outerTradeNo;
    private BigDecimal totalRefundAmount;
    private BigDecimal goodsAmount;
    private BigDecimal guaranteeAmount;
    private BigDecimal thirdServiceFee;
    private BigDecimal costAmount;
    private String remark;
    private String notifyUrl;

    public String getRefundSeqNo() {
        return this.refundSeqNo;
    }

    public void setRefundSeqNo(String refundSeqNo) {
        this.refundSeqNo = refundSeqNo;
    }

    public String getRefundOrderNo() {
        return this.refundOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOuterTradeNo() {
        return this.outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public BigDecimal getTotalRefundAmount() {
        return this.totalRefundAmount;
    }

    public void setTotalRefundAmount(BigDecimal totalRefundAmount) {
        this.totalRefundAmount = totalRefundAmount;
    }

    public BigDecimal getGoodsAmount() {
        return this.goodsAmount;
    }

    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public BigDecimal getGuaranteeAmount() {
        return this.guaranteeAmount;
    }

    public void setGuaranteeAmount(BigDecimal guaranteeAmount) {
        this.guaranteeAmount = guaranteeAmount;
    }

    public BigDecimal getThirdServiceFee() {
        return this.thirdServiceFee;
    }

    public void setThirdServiceFee(BigDecimal thirdServiceFee) {
        this.thirdServiceFee = thirdServiceFee;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public BigDecimal getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(BigDecimal costAmount) {
        this.costAmount = costAmount;
    }
}
