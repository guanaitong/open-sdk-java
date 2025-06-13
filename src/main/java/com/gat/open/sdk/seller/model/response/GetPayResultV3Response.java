/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class GetPayResultV3Response {
    @JsonProperty("outerTradeNo")
    private String outerTradeNo;
    @JsonProperty("orderNo")
    private String orderNo;
    @JsonProperty("paySeqNo")
    private String paySeqNo;
    @JsonProperty("payStatus")
    private Integer payStatus;
    @JsonProperty("payTradeNo")
    private String payTradeNo;
    @JsonProperty("payAmount")
    private BigDecimal payAmount;
    @JsonProperty("payTime")
    private Long payTime;

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPaySeqNo() {
        return paySeqNo;
    }

    public void setPaySeqNo(String paySeqNo) {
        this.paySeqNo = paySeqNo;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayTradeNo() {
        return payTradeNo;
    }

    public void setPayTradeNo(String payTradeNo) {
        this.payTradeNo = payTradeNo;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Long getPayTime() {
        return payTime;
    }

    public void setPayTime(Long payTime) {
        this.payTime = payTime;
    }
}
