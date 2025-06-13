/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class EnterpriseAssetsAssignSingleQueryResp {
    /**
     * 员工标识
     */
    private String userId;
    /**
     * 员工名称
     */
    private String username;
    /**
     * 外部发放号
     */
    private String externalCode;
    /**
     * 发放金额
     */
    private BigDecimal amount;
    /**
     * 发放完成时间，格式：yyyy-MM-dd HH:mm:ss
     */
    private String completeTime;
    /**
     * 资产名称
     */
    private String assetName;
    /**
     * 发放原因
     */
    private String reason;
    /**
     * 产品类型
     * 福利额度	1
     * 员工午餐	2
     * 员工用车	3
     * 员工通讯	4
     * 关爱积分	10
     * 关爱额度	12
     * 年节福利	13
     */
    private Integer productCategory;
    /**
     * 企业账户
     */
    private String accountOpenid;

    @JsonProperty("userid")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Integer productCategory) {
        this.productCategory = productCategory;
    }

    public String getAccountOpenid() {
        return accountOpenid;
    }

    public void setAccountOpenid(String accountOpenid) {
        this.accountOpenid = accountOpenid;
    }
}
