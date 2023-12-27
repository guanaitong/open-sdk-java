/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RefundV3Response {
    @JsonProperty("refundOuterTradeNo")
    private String refundOuterTradeNo;
    @JsonProperty("outerTradeNo")
    private String outerTradeNo;
    @JsonProperty("refundOrderNo")
    private String refundOrderNo;
    @JsonProperty("orderNo")
    private String orderNo;
    @JsonProperty("refundSeqNo")
    private String refundSeqNo;

    public String getRefundOuterTradeNo() {
        return refundOuterTradeNo;
    }

    public void setRefundOuterTradeNo(String refundOuterTradeNo) {
        this.refundOuterTradeNo = refundOuterTradeNo;
    }

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public String getRefundOrderNo() {
        return refundOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getRefundSeqNo() {
        return refundSeqNo;
    }

    public void setRefundSeqNo(String refundSeqNo) {
        this.refundSeqNo = refundSeqNo;
    }
}
