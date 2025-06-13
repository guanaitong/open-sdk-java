/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SaveRefundPhysicalGoodsOrderRes {
    @JsonProperty("outerTradeNo")
    private String outerTradeNo;

    @JsonProperty("orderNo")
    private String orderNo;

    @JsonProperty("refundOrderNo")
    private String refundOrderNo;

    @JsonProperty("refundOuterTradeNo")
    private String refundOuterTradeNo;

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

    public String getRefundOrderNo() {
        return refundOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

    public String getRefundOuterTradeNo() {
        return refundOuterTradeNo;
    }

    public void setRefundOuterTradeNo(String refundOuterTradeNo) {
        this.refundOuterTradeNo = refundOuterTradeNo;
    }
}
