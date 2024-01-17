/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

import com.gat.open.sdk.model.JsonRequest;
import com.gat.open.sdk.seller.model.response.SavePayPhysicalGoodsOrderRes;

import java.math.BigDecimal;
import java.util.List;

/**
 * 实物订单详情推送参数对象
 */
public class PhysicalGoodsPayOrderV3Request extends JsonRequest<SavePayPhysicalGoodsOrderRes> {
    public PhysicalGoodsPayOrderV3Request() {
        noSnake = true;
    }

    /**
     * 合作方订单号
     */
    private String orderNo;

    private String buyerOpenId;
    private String sellerCode;

    private String timeOrdered;

    private BigDecimal totalAmount;

    private BigDecimal payAmount;

    private BigDecimal costAmount;

    private BigDecimal freight;

    private String remark;

    private List<GoodsDetailV3Req> goodsDetails;

    private String provinceCode;

    private String provinceName;

    private String cityCode;

    private String cityName;

    private String locationCode;

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
    private String poiCateCode;
    /**
     * 商家一级品类名称
     */
    private String poiCateDesc;
    /**
     * 商家二级品类code
     */
    private String poi2ndCateDesc;
    /**
     * 商家三级品类code
     */
    private String poi3rdCateCode;
    /**
     * 商家三级品类名称
     */
    private String poi3rdCateDesc;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBuyerOpenId() {
        return buyerOpenId;
    }

    public void setBuyerOpenId(String buyerOpenId) {
        this.buyerOpenId = buyerOpenId;
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
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

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(BigDecimal costAmount) {
        this.costAmount = costAmount;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<GoodsDetailV3Req> getGoodsDetails() {
        return goodsDetails;
    }

    public void setGoodsDetails(List<GoodsDetailV3Req> goodsDetails) {
        this.goodsDetails = goodsDetails;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
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

    public String getPoiCateCode() {
        return poiCateCode;
    }

    public void setPoiCateCode(String poiCateCode) {
        this.poiCateCode = poiCateCode;
    }

    public String getPoiCateDesc() {
        return poiCateDesc;
    }

    public void setPoiCateDesc(String poiCateDesc) {
        this.poiCateDesc = poiCateDesc;
    }

    public String getPoi2ndCateDesc() {
        return poi2ndCateDesc;
    }

    public void setPoi2ndCateDesc(String poi2ndCateDesc) {
        this.poi2ndCateDesc = poi2ndCateDesc;
    }

    public String getPoi3rdCateCode() {
        return poi3rdCateCode;
    }

    public void setPoi3rdCateCode(String poi3rdCateCode) {
        this.poi3rdCateCode = poi3rdCateCode;
    }

    public String getPoi3rdCateDesc() {
        return poi3rdCateDesc;
    }

    public void setPoi3rdCateDesc(String poi3rdCateDesc) {
        this.poi3rdCateDesc = poi3rdCateDesc;
    }
}
