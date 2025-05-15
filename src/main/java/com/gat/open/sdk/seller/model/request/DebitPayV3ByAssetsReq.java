/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

import com.gat.open.sdk.model.JsonRequest;
import com.gat.open.sdk.seller.model.response.DebitPayV3Response;

import java.math.BigDecimal;


public class DebitPayV3ByAssetsReq extends JsonRequest<DebitPayV3Response> {
    public DebitPayV3ByAssetsReq() {
        noSnake = true;
    }

    private String paySeqNo;
    private String buyerOpenId;
    private String sellerCode;
    private String assetOpenId;
    private String orderNo;
    private String timeOrdered;
    private BigDecimal totalAmount;
    private BigDecimal goodsAmount;
    private BigDecimal guaranteeAmount;
    private BigDecimal thirdServiceFee;
    private BigDecimal costAmount;
    private String reason;
    private String attach;
    private String notifyUrl;

    public String getPaySeqNo() {
        return paySeqNo;
    }

    public void setPaySeqNo(String paySeqNo) {
        this.paySeqNo = paySeqNo;
    }

    public String getBuyerOpenId() {
        return buyerOpenId;
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    public void setBuyerOpenId(String buyerOpenId) {
        this.buyerOpenId = buyerOpenId;
    }

    public String getAssetOpenId() {
        return assetOpenId;
    }

    public void setAssetOpenId(String assetOpenId) {
        this.assetOpenId = assetOpenId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTimeOrdered() {
        return timeOrdered;
    }

    public void setTimeOrdered(String timeOrdered) {
        this.timeOrdered = timeOrdered;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public BigDecimal getGuaranteeAmount() {
        return guaranteeAmount;
    }

    public void setGuaranteeAmount(BigDecimal guaranteeAmount) {
        this.guaranteeAmount = guaranteeAmount;
    }

    public BigDecimal getThirdServiceFee() {
        return thirdServiceFee;
    }

    public void setThirdServiceFee(BigDecimal thirdServiceFee) {
        this.thirdServiceFee = thirdServiceFee;
    }

    public BigDecimal getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(BigDecimal costAmount) {
        this.costAmount = costAmount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
}
