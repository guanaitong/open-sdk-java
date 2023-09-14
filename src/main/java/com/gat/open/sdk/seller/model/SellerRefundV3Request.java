package com.gat.open.sdk.seller.model;

import com.gat.open.sdk.model.JsonRequest;

import java.math.BigDecimal;


public class SellerRefundV3Request extends JsonRequest<String> {
    public SellerRefundV3Request() {
        noSnake = true;
    }

    private String outerTradeNo;


    private String outerRefundNo;
    private String reason;


    private BigDecimal refundAmount;


    private BigDecimal costAmount;


    private BigDecimal deliveryFee;


    private String notifyUrl;

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public String getOuterRefundNo() {
        return outerRefundNo;
    }

    public void setOuterRefundNo(String outerRefundNo) {
        this.outerRefundNo = outerRefundNo;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(BigDecimal costAmount) {
        this.costAmount = costAmount;
    }

    public BigDecimal getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(BigDecimal deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
}
