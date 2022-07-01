/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import java.math.BigDecimal;


public class EnterpriseAssetsAccountGetResp {
    /**
     * 账户的openid
     */
    private String accountOpenid;
    /**
     * 账户名称
     */
    private String name;
    /**
     * 账户类型 1 积分账户 3 费用积分账户
     */
    private Integer type;
    /**
     * 是否是主账户，1：主账户；2：子账户
     */
    private Integer isBasic;
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
     * 关爱积分	10
     * 关爱额度	12
     * 年节福利	13
     */
    private Integer productCategory;

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

    public Integer getIsBasic() {
        return isBasic;
    }

    public void setIsBasic(Integer isBasic) {
        this.isBasic = isBasic;
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
}
