/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.invoice;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormField;
import com.gat.open.sdk.model.FormRequest;

/**
 * https://open.guanaitong.com/doc/enterprise/cost-center-add-or-update-rel/
 */
public class InvoiceAddOrUpdateCostCenterRelRequest extends FormRequest<Integer> implements EnterpriseCodeRequest {
    /**
     * 企业编号（集团和运营商必填,企业不填）
     */
    private String enterpriseCode;
    /**
     * 成本中心id
     */
    private Integer costCenterId;
    /**
     * 员工第三方唯一标识
     */
    private String userId;

    /**
     * 成本中心编号
     */
    private String costCenterCode;

    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public Integer getCostCenterId() {
        return costCenterId;
    }

    public void setCostCenterId(Integer costCenterId) {
        this.costCenterId = costCenterId;
    }

    @FormField("userid")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCostCenterCode() {
        return costCenterCode;
    }

    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }
}
