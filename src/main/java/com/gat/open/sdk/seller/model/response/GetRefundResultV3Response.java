/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class GetRefundResultV3Response {
    @JsonProperty("refundOuterTradeNo")
    private String refundOuterTradeNo;
    @JsonProperty("refundOrderNo")
    private String refundOrderNo;
    @JsonProperty("refundSeqNo")
    private String refundSeqNo;
    @JsonProperty("orderNo")
    private String orderNo;
    @JsonProperty("outerTradeNo")
    private String outerTradeNo;
    @JsonProperty("refundStatus")
    private Integer refundStatus;
    @JsonProperty("refundTradeNo")
    private String refundTradeNo;
    @JsonProperty("refundAmount")
    private BigDecimal refundAmount;
    @JsonProperty("refundTime")
    private Long refundTime;

    public String getRefundOuterTradeNo() {
        return refundOuterTradeNo;
    }

    public void setRefundOuterTradeNo(String refundOuterTradeNo) {
        this.refundOuterTradeNo = refundOuterTradeNo;
    }

    public String getRefundOrderNo() {
        return refundOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

    public String getRefundSeqNo() {
        return refundSeqNo;
    }

    public void setRefundSeqNo(String refundSeqNo) {
        this.refundSeqNo = refundSeqNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundTradeNo() {
        return refundTradeNo;
    }

    public void setRefundTradeNo(String refundTradeNo) {
        this.refundTradeNo = refundTradeNo;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Long getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Long refundTime) {
        this.refundTime = refundTime;
    }
}
