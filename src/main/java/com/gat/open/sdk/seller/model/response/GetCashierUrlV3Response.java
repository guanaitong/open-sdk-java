/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetCashierUrlV3Response {
    @JsonProperty("cashierUrl")
    private String cashierUrl;
    @JsonProperty("cashierUrlExpiredTime")
    private String cashierUrlExpiredTime;
    @JsonProperty("outerTradeNo")
    private String outerTradeNo;

    public String getCashierUrl() {
        return this.cashierUrl;
    }

    public void setCashierUrl(String cashierUrl) {
        this.cashierUrl = cashierUrl;
    }

    public String getCashierUrlExpiredTime() {
        return this.cashierUrlExpiredTime;
    }

    public void setCashierUrlExpiredTime(String cashierUrlExpiredTime) {
        this.cashierUrlExpiredTime = cashierUrlExpiredTime;
    }

    public String getOuterTradeNo() {
        return this.outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }
}
