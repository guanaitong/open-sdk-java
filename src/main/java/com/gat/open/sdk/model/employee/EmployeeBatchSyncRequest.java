/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.employee;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.JsonRequest;

import java.util.List;

/**
 * https://open.guanaitong.com/doc/enterprise/employee-get
 * <p>
 * Created by August.Zhou on 2022/6/27 13:54
 */
public class EmployeeBatchSyncRequest extends JsonRequest<String> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;

    private List<EmployeeInfo> employeeList;


    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public List<EmployeeInfo> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<EmployeeInfo> employeeList) {
        this.employeeList = employeeList;
    }
}
