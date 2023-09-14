/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.expense;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;

/**
 * https://open.guanaitong.tech/doc/enterprise/expense/approval-form-revoke/
 */
public class RevokeApprovalFormRequest extends FormRequest<Boolean> implements EnterpriseCodeRequest {
    /**
     * 企业编号（集团和运营商必填,企业不填）
     */
    private String enterpriseCode;

    /**
     * 外部系统审批单号
     */
    private String approveExtNo;

    /**
     * 关爱通审批单号
     */
    private String approveNo;

    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getApproveExtNo() {
        return approveExtNo;
    }

    public void setApproveExtNo(String approveExtNo) {
        this.approveExtNo = approveExtNo;
    }

    public String getApproveNo() {
        return approveNo;
    }

    public void setApproveNo(String approveNo) {
        this.approveNo = approveNo;
    }
}
