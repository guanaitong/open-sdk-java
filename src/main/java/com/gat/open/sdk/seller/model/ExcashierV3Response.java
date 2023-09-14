package com.gat.open.sdk.seller.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExcashierV3Response {
    @JsonProperty("outerTradeNo")
    private String outerTradeNo;
    @JsonProperty("redirectUrl")
    private String redirectUrl;

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
}
