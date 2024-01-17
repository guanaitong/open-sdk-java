/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

import com.gat.open.sdk.model.JsonRequest;
import com.gat.open.sdk.seller.model.response.GetPayResultV3Response;

public class GetPayResultV3Request extends JsonRequest<GetPayResultV3Response> {
    public GetPayResultV3Request() {
        noSnake = true;
    }

    private String orderNo;
    private String paySeqNo;
    private String outerTradeNo;
    private String sellerCode;

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

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }
}
