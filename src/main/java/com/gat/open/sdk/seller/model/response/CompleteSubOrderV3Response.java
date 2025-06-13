/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CompleteSubOrderV3Response {

    /**
     * 订单号
     */
    @JsonProperty("outerTradeNo")
    private String outerTradeNo;

    /**
     * 子订单号
     */
    @JsonProperty("subOrderNo")
    private String subOrderNo;

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public String getSubOrderNo() {
        return subOrderNo;
    }

    public void setSubOrderNo(String subOrderNo) {
        this.subOrderNo = subOrderNo;
    }
}
