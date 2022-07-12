/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.employee;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormField;
import com.gat.open.sdk.model.FormRequest;

/**
 * https://open.guanaitong.com/doc/enterprise/employee-transfer
 * Created by August.Zhou on 2022/6/27 15:55
 */
public class EmployeeTransferRequest extends FormRequest<String> implements EnterpriseCodeRequest {
    private String userId;
    /**
     * 企业编号(上线前,由第三方给关爱通进行绑定)
     */
    private String enterpriseCode;
    /**
     * 要跳转的企业编号
     */
    private String newEnterpriseCode;

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    @FormField("userid")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNewEnterpriseCode() {
        return newEnterpriseCode;
    }

    public void setNewEnterpriseCode(String newEnterpriseCode) {
        this.newEnterpriseCode = newEnterpriseCode;
    }
}
