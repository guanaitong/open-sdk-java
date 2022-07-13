/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.notify;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.math.BigDecimal;

public class NotifyEnterpriseCharge extends NotifyBase {

    @JsonProperty("account_openid")
    String accountOpenid;

    @JsonProperty("charge_amount")
    BigDecimal chargeAmount;

    BigDecimal balance;

    String chargeTime;

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

    @JsonGetter("total_amount")
    public BigDecimal getBalance() {
        return balance;
    }

    @JsonSetter("balance")
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @JsonGetter("charge_at")
    public String getChargeTime() {
        return chargeTime;
    }

    @JsonSetter("charge_time")
    public void setChargeTime(String chargeTime) {
        this.chargeTime = chargeTime;
    }
}
