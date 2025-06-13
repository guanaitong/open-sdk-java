/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import java.math.BigDecimal;
import java.util.List;


public class EnterpriseAssetsLimitGetResp {
    /**
     * 账户的openid
     */
    private String accountOpenid;
    /**
     * 账户名称
     */
    private String name;
    /**
     * 账户余额
     */
    private BigDecimal balance;
    /**
     * 账户状态，1：有效；2：无效
     */
    private Integer status;
    /**
     * 产品类型
     * 福利额度	1
     * 员工午餐	2
     * 员工用车	3
     * 员工通讯	4
     * 关爱额度	12
     */
    private Integer productCategory;

    private List<SubLimit> subLimits;

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

    public Integer getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Integer productCategory) {
        this.productCategory = productCategory;
    }

    public List<SubLimit> getSubLimits() {
        return subLimits;
    }

    public void setSubLimits(List<SubLimit> subLimits) {
        this.subLimits = subLimits;
    }

    public static class SubLimit {
        String name;
        Integer id;
        Integer status;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }
    }
}
