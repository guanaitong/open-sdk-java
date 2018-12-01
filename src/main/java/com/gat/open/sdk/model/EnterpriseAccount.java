package com.gat.open.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 *
 * @author xin.hua
 * @date 2017/7/18
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnterpriseAccount {

    /**
     * account_openid : suw7l4W82D7+Eni2T7K+kw==
     * balance : 77540391
     * is_basic : 1
     * name : 基本户
     * status : 1
     * type : 1
     */

    @JsonProperty("account_openid")
    private String accountOpenid;
    private BigDecimal balance;
    @JsonProperty("is_basic")
    private int basic;
    private String name;
    private int status;
    private int type;

    public String getAccountOpenid() {
        return accountOpenid;
    }

    public void setAccountOpenid(String accountOpenid) {
        this.accountOpenid = accountOpenid;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EnterpriseAccount{" +
                "accountOpenid='" + accountOpenid + '\'' +
                ", balance=" + balance +
                ", basic=" + basic +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", type=" + type +
                '}';
    }
}
