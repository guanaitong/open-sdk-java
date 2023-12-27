/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.response;


import com.fasterxml.jackson.annotation.JsonProperty;

public class DebitPayV3Response {
    @JsonProperty("outerTradeNo")
    private String outerTradeNo;
    @JsonProperty("tradeNo")
    private String tradeNo;
    @JsonProperty("orderNo")
    private String orderNo;
    @JsonProperty("paySeqNo")
    private String paySeqNo;

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
}
