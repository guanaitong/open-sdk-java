/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.invoice;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;

/**
 * https://open.guanaitong.com/doc/enterprise/cost-center-add/
 */
public class InvoiceAddCostCenterRequest extends FormRequest<Integer> implements EnterpriseCodeRequest {
    /**
     * 企业编号（集团和运营商必填,企业不填）
     */
    private String enterpriseCode;
    /**
     * 成本中心编号
     */
    private String costCenterCode;
    /**
     * 成本中心名称
     */
    private String costCenterName;

    /**
     * 成本中心标签，多个标签用 $#$ 符号连接例如codea$#$codeb
     */
    private String costCenterTags;

    /**
     * 成本中心描述
     */
    private String costCenterDesc;

    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getCostCenterCode() {
        return costCenterCode;
    }

    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }

    public String getCostCenterName() {
        return costCenterName;
    }

    public void setCostCenterName(String costCenterName) {
        this.costCenterName = costCenterName;
    }

    public String getCostCenterTags() {
        return costCenterTags;
    }

    public void setCostCenterTags(String costCenterTags) {
        this.costCenterTags = costCenterTags;
    }

    public String getCostCenterDesc() {
        return costCenterDesc;
    }

    public void setCostCenterDesc(String costCenterDesc) {
        this.costCenterDesc = costCenterDesc;
    }
}
