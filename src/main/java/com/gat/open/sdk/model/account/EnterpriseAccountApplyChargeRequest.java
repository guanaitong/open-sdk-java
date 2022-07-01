/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.account;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;

import java.math.BigDecimal;

/**
 * https://open.guanaitong.com/doc/enterprise/account-enterprise-applyCharge
 */
public class EnterpriseAccountApplyChargeRequest extends FormRequest<EnterpriseAccountApplyChargeResp> implements EnterpriseCodeRequest {
    /**
     * 企业编号（集团和运营商必填,企业不填）
     */
    private String enterpriseCode;
    /**
     * 积分账户的openid
     */
    private String accountOpenid;
    /**
     * 申请金额
     */
    private BigDecimal amount;
    /**
     * 企业人工充值汇款方式 0默认 1银行转账
     */
    private Integer serviceProvider;
    /**
     * 充值申请人姓名
     */
    private String applicantName;
    /**
     * 外部业务号
     */
    private String externalCode;
    /**
     * 纳税人名称（抬头）
     */
    private String taxpayer;
    /**
     * 纳税人识别号
     */
    private String identifier;
    /**
     * 充值备注
     */
    private String remark;
    /**
     * 发票补充备注信息
     */
    private String invoiceExtrRemark;
    /**
     * 发票备注栏
     */
    private String invoiceRemark;

    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getAccountOpenid() {
        return accountOpenid;
    }

    public void setAccountOpenid(String accountOpenid) {
        this.accountOpenid = accountOpenid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(Integer serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public String getTaxpayer() {
        return taxpayer;
    }

    public void setTaxpayer(String taxpayer) {
        this.taxpayer = taxpayer;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getInvoiceExtrRemark() {
        return invoiceExtrRemark;
    }

    public void setInvoiceExtrRemark(String invoiceExtrRemark) {
        this.invoiceExtrRemark = invoiceExtrRemark;
    }

    public String getInvoiceRemark() {
        return invoiceRemark;
    }

    public void setInvoiceRemark(String invoiceRemark) {
        this.invoiceRemark = invoiceRemark;
    }
}
