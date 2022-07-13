/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.notify;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.math.BigDecimal;


public class NotifyEmployeeBalance extends NotifyBase {

    @JsonProperty("product_category")
    Integer productCategory;

    @JsonProperty("product_name")
    String productName;

    String userid;

    //1消费，2退款
    Integer type;

    String enterpriseCode;

    String dateTime;

    BigDecimal feeAmount = BigDecimal.ZERO;

    BigDecimal amount;

    BigDecimal balance;

    public Integer getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Integer productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JsonGetter("user_id")
    public String getUserid() {
        return userid;
    }

    @JsonSetter("userid")
    public void setUserid(String userid) {
        this.userid = userid;
    }

    @JsonGetter("change_type")
    public Integer getType() {
        return type;
    }

    @JsonSetter("type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonGetter("subsidiary_code")
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @JsonSetter("enterprise_code")
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    @JsonGetter("change_at")
    public String getDateTime() {
        return dateTime;
    }

    @JsonSetter("date_time")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonGetter("service_amount")
    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    @JsonSetter("fee_amount")
    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    @JsonGetter("change_amount")
    public BigDecimal getAmount() {
        return amount;
    }

    @JsonSetter("amount")
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @JsonGetter("total_amount")
    public BigDecimal getBalance() {
        return balance;
    }

    @JsonSetter("balance")
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
