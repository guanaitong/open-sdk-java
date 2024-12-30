/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class PersonAvailableBalanceResp {
    @JsonProperty("availableBalance")
    private BigDecimal availableBalance;

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }
}
