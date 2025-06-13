/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

public class Assets {

    /**
     * 资产中文名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 余额
     */
    @JsonProperty("balance")
    private BigDecimal balance;
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
    @JsonProperty("combinableAssets")
    private List<CombinaAsset> combinableAssets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
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

    public List<CombinaAsset> getCombinableAssets() {
        return combinableAssets;
    }

    public void setCombinableAssets(List<CombinaAsset> combinableAssets) {
        this.combinableAssets = combinableAssets;
    }
}
