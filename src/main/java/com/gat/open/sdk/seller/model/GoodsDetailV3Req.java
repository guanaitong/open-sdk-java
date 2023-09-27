/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model;

import java.math.BigDecimal;

public class GoodsDetailV3Req {
    /**
     * 商品id
     */
    private String skuCode;
    /**
     * 商品名称
     */
    private String skuName;
    /**
     * 商品一级品类code
     */
    private Long skuCateCode;
    /**
     * 商品一级品类名称
     */
    private String skuCateDesc;
    /**
     * 商品二级品类code
     */
    private Long sku2ndCateCode;
    /**
     * 商品二级品类名称
     */
    private String sku2ndCateDesc;
    /**
     * 商品三级品类code
     */
    private Long sku3rdCateCode;
    /**
     * 商品三级品类名称
     */
    private String sku3rdCateDesc;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 商品价格：元
     */
    private BigDecimal price;
    /**
     * 原始金额：元
     */
    private BigDecimal amount;
    /**
     * 关爱通资产支付金额：元
     */
    private BigDecimal gatAmount;
    /**
     * 关爱通结算价：元
     */
    private BigDecimal costAmount;
    /**
     * 税率
     */
    private BigDecimal taxRate;
    /**
     * 税务编码
     */
    private String taxCode;
    /**
     * 开票单位
     */
    private String taxUnit;
    /**
     * 发票类型 0 无 1 普票（纸质） 2 专票 3 电子普通发票
     */
    private Integer invoiceType;
    /**
     * 运费：元（平摊后的运费）
     */
    private BigDecimal freight;

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Long getSkuCateCode() {
        return skuCateCode;
    }

    public void setSkuCateCode(Long skuCateCode) {
        this.skuCateCode = skuCateCode;
    }

    public String getSkuCateDesc() {
        return skuCateDesc;
    }

    public void setSkuCateDesc(String skuCateDesc) {
        this.skuCateDesc = skuCateDesc;
    }

    public Long getSku2ndCateCode() {
        return sku2ndCateCode;
    }

    public void setSku2ndCateCode(Long sku2ndCateCode) {
        this.sku2ndCateCode = sku2ndCateCode;
    }

    public String getSku2ndCateDesc() {
        return sku2ndCateDesc;
    }

    public void setSku2ndCateDesc(String sku2ndCateDesc) {
        this.sku2ndCateDesc = sku2ndCateDesc;
    }

    public Long getSku3rdCateCode() {
        return sku3rdCateCode;
    }

    public void setSku3rdCateCode(Long sku3rdCateCode) {
        this.sku3rdCateCode = sku3rdCateCode;
    }

    public String getSku3rdCateDesc() {
        return sku3rdCateDesc;
    }

    public void setSku3rdCateDesc(String sku3rdCateDesc) {
        this.sku3rdCateDesc = sku3rdCateDesc;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getGatAmount() {
        return gatAmount;
    }

    public void setGatAmount(BigDecimal gatAmount) {
        this.gatAmount = gatAmount;
    }

    public BigDecimal getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(BigDecimal costAmount) {
        this.costAmount = costAmount;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getTaxUnit() {
        return taxUnit;
    }

    public void setTaxUnit(String taxUnit) {
        this.taxUnit = taxUnit;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }
}
