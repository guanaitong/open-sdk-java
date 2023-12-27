/*
 * Copyright 2007-2020, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.Response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;


public class CombinaAsset {
    /**
     * 资产中文名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 资产类型
     */
    @JsonProperty("assetCode")
    private String assetCode;
    /**
     * 资产对外 openId
     */
    @JsonProperty("assetOpenId")
    private String assetOpenId;
    /**
     * 资产支付金额
     */
    @JsonProperty("payAmount")
    private BigDecimal payAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public String getAssetOpenId() {
        return assetOpenId;
    }

    public void setAssetOpenId(String assetOpenId) {
        this.assetOpenId = assetOpenId;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }
}
