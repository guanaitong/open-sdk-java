/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

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

    private RefundInfoV3Request tradeInfo;

    private Long provinceCode;

    private String provinceName;

    private Long cityCode;

    private String cityName;

    private Long locationCode;

    private String locationName;

    private String shopName;

    private String shopAddress;
    /**
     * 商家电话
     */
    private String shopPhone;
    /**
     * 收货人姓名
     */
    private String recipientName;
    /**
     * 收货人电话
     */
    private String recipientPhone;
    /**
     * 收货人地址
     */
    private String recipientAddress;
    /**
     * 商家一级品类code
     */
    private Long poiCateCode;
    /**
     * 商家一级品类名称
     */
    private String poiCateDesc;
    /**
     * 商家二级品类code
     */
    private Long poi2ndCateCode;
    /**
     * 商家二级品类名称
     */
    private String poi2ndCateDesc;
    /**
     * 商家三级品类code
     */
    private Long poi3rdCateCode;
    /**
     * 商家三级品类名称
     */
    private String poi3rdCateDesc;

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

    public RefundInfoV3Request getTradeInfo() {
        return tradeInfo;
    }

    public void setTradeInfo(RefundInfoV3Request tradeInfo) {
        this.tradeInfo = tradeInfo;
    }

    public Long getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Long provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Long getCityCode() {
        return cityCode;
    }

    public void setCityCode(Long cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Long getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(Long locationCode) {
        this.locationCode = locationCode;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientPhone() {
        return recipientPhone;
    }

    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public Long getPoiCateCode() {
        return poiCateCode;
    }

    public void setPoiCateCode(Long poiCateCode) {
        this.poiCateCode = poiCateCode;
    }

    public String getPoiCateDesc() {
        return poiCateDesc;
    }

    public void setPoiCateDesc(String poiCateDesc) {
        this.poiCateDesc = poiCateDesc;
    }

    public Long getPoi2ndCateCode() {
        return poi2ndCateCode;
    }

    public void setPoi2ndCateCode(Long poi2ndCateCode) {
        this.poi2ndCateCode = poi2ndCateCode;
    }

    public String getPoi2ndCateDesc() {
        return poi2ndCateDesc;
    }

    public void setPoi2ndCateDesc(String poi2ndCateDesc) {
        this.poi2ndCateDesc = poi2ndCateDesc;
    }

    public Long getPoi3rdCateCode() {
        return poi3rdCateCode;
    }

    public void setPoi3rdCateCode(Long poi3rdCateCode) {
        this.poi3rdCateCode = poi3rdCateCode;
    }

    public String getPoi3rdCateDesc() {
        return poi3rdCateDesc;
    }

    public void setPoi3rdCateDesc(String poi3rdCateDesc) {
        this.poi3rdCateDesc = poi3rdCateDesc;
    }
}
