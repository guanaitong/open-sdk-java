/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;


public class EmployeeAssetsLimitRecordResp {
    /**
     * 流水发生时间
     */
    private String time;
    /**
     * 流水金额，入账是正数，出账是负数
     */
    private BigDecimal amount;
    /**
     * 员工剩余金额
     */
    private BigDecimal balance;
    /**
     * 外部流水号
     */
    @JsonProperty("outer_trade_no")
    @JsonAlias({"outer_tradeno", "outer_trade_no"})
    private String outerTradeNo;
    /**
     * 员工唯一标识
     */
    @JsonProperty("userid")
    private String userId;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 发生流水的账户名称
     */
    private String accountName;
    /**
     * 流水备注
     */
    private String remark;
    /**
     * 流水类型
     */
    private String tradeType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
}
