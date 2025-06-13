/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.notify;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class NotifyEnterpriseCharge extends NotifyBase {

    @JsonProperty("account_openid")
    private String accountOpenid;

    @JsonProperty("charge_amount")
    private BigDecimal chargeAmount;
    @JsonProperty("balance")
    private BigDecimal balance;
    @JsonProperty("charge_time")
    private String chargeTime;

    public String getAccountOpenid() {
        return accountOpenid;
    }

    public void setAccountOpenid(String accountOpenid) {
        this.accountOpenid = accountOpenid;
    }

    public BigDecimal getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(BigDecimal chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(String chargeTime) {
        this.chargeTime = chargeTime;
    }
}
