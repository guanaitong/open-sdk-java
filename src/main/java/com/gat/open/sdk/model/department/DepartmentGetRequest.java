/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.department;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;

/**
 * Created by August.Zhou on 2022/6/27 14:39
 */
public class DepartmentGetRequest extends FormRequest<DepartmentResp> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;

    private String deptCode;


    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
}
