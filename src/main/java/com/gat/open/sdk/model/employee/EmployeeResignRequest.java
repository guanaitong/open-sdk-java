/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.employee;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormField;
import com.gat.open.sdk.model.FormRequest;

/**
 * https://open.guanaitong.com/doc/enterprise/employee-resign/
 * Created by August.Zhou on 2022/6/27 15:55
 */
public class EmployeeResignRequest extends FormRequest<String> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;
    private String userId;
    /**
     * 预约离职时间，格式必须为：yyyy-MM-dd HH:mm:ss
     */
    private String resignTime;

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

    public String getResignTime() {
        return resignTime;
    }

    public void setResignTime(String resignTime) {
        this.resignTime = resignTime;
    }
}
