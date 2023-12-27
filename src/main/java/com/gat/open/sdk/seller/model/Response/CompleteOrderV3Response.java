/*
 * Copyright 2007-2020, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.Response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompleteOrderV3Response {

    /**
     * 订单号
     */
    @JsonProperty("outerTradeNo")
    private String outerTradeNo;

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }
}
