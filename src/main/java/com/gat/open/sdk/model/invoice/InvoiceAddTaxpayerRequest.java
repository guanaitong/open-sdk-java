/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.invoice;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;

/**
 * https://open.guanaitong.com/doc/enterprise/taxpayer-add/
 */
public class InvoiceAddTaxpayerRequest extends FormRequest<Integer> implements EnterpriseCodeRequest {
    /**
     * 企业编号（集团和运营商必填,企业不填）
     */
    private String enterpriseCode;
    /**
     * 纳税人名称（抬头）
     */
    private String taxpayerName;
    /**
     * 纳税人识别号
     */
    private String identifier;
    /**
     * 纳税人性质
     */
    private Integer taxpayerNature = 2;
    /**
     * 默认通知邮箱
     */
    private String email;
    /**
     * 注册地址
     */
    private String registeredAddress;
    /**
     * 注册电话
     */
    private String registeredPhone;
    /**
     * 开户银行
     */
    private String depositBank;
    /**
     * 银行账号
     */
    private String bankAccount;

    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getTaxpayerName() {
        return taxpayerName;
    }

    public void setTaxpayerName(String taxpayerName) {
        this.taxpayerName = taxpayerName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Integer getTaxpayerNature() {
        return taxpayerNature;
    }

    public void setTaxpayerNature(Integer taxpayerNature) {
        this.taxpayerNature = taxpayerNature;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public String getRegisteredPhone() {
        return registeredPhone;
    }

    public void setRegisteredPhone(String registeredPhone) {
        this.registeredPhone = registeredPhone;
    }

    public String getDepositBank() {
        return depositBank;
    }

    public void setDepositBank(String depositBank) {
        this.depositBank = depositBank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}
