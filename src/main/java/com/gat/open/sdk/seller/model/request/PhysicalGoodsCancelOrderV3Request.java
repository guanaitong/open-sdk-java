package com.gat.open.sdk.seller.model.request;

import com.gat.open.sdk.model.JsonRequest;
import com.gat.open.sdk.seller.model.Response.CancelPhysicalGoodsOrderRes;

public class PhysicalGoodsCancelOrderV3Request extends JsonRequest<CancelPhysicalGoodsOrderRes> {
    public PhysicalGoodsCancelOrderV3Request() {
        noSnake = true;
    }
    private String orderNo;

    private String outerTradeNo;

    private String notifyUrl;

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
}
