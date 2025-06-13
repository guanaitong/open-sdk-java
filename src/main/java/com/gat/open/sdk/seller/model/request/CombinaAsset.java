/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

import java.math.BigDecimal;

public class CombinaAsset {
    /**
     * 资产中文名称
     */
    private String name;
    /**
     * 资产类型
     */
    private String assetCode;
    /**
     * 资产对外 openId
     */
    private String assetOpenId;
    /**
     * 资产支付金额
     */
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
