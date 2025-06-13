/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.department;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;

/**
 * Created by August.Zhou on 2022/6/27 14:40
 */
public class DepartmentTransferEmployeeRequest extends FormRequest<Boolean> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;
    /**
     * 原部门编码
     */
    private String sourceDeptCode;
    /**
     * 目标部门编码
     */
    private String targetDeptCode;

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getSourceDeptCode() {
        return sourceDeptCode;
    }

    public void setSourceDeptCode(String sourceDeptCode) {
        this.sourceDeptCode = sourceDeptCode;
    }

    public String getTargetDeptCode() {
        return targetDeptCode;
    }

    public void setTargetDeptCode(String targetDeptCode) {
        this.targetDeptCode = targetDeptCode;
    }
}
