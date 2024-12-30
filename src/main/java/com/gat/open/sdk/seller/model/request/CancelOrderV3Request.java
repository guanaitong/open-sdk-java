/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

import com.gat.open.sdk.model.JsonRequest;
import com.gat.open.sdk.seller.model.response.CancelOrderV3Res;


public class CancelOrderV3Request extends JsonRequest<CancelOrderV3Res> {
    public CancelOrderV3Request() {
        noSnake = true;
    }
    /**
     * 第三方订单号
     */
    private String orderNo;

    private String outerTradeNo;

    private String notifyUrl;

    private String sellerCode;

    private String reason;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
