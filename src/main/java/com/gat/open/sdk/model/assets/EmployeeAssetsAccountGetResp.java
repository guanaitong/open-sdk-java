/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import java.math.BigDecimal;


public class EmployeeAssetsAccountGetResp {
    /**
     * 账户的openid
     */
    private String accountOpenid;
    /**
     * 账户名称
     */
    private String name;
    /**
     * 账户类型，1：积分账户；4：额度账户
     */
    private Integer type;
    /**
     * 账户余额
     */
    private BigDecimal balance;
    /**
     * 账户状态，1：有效；2：无效
     */
    private Integer status;

    public String getAccountOpenid() {
        return accountOpenid;
    }

    public void setAccountOpenid(String accountOpenid) {
        this.accountOpenid = accountOpenid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
