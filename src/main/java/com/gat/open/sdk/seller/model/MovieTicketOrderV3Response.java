package com.gat.open.sdk.seller.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieTicketOrderV3Response {
    @JsonProperty("outerTradeNo")
    private String outerTradeNo;

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }
}
