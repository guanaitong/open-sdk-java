/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormField;
import com.gat.open.sdk.model.FormRequest;

import java.util.List;

/**
 * https://open.guanaitong.com/doc/enterprise/account-employee-get/
 * <p>
 * Created by August.Zhou on 2022/6/27 13:54
 */
public class EmployeeAssetsAccountGetRequest extends FormRequest<List<EmployeeAssetsAccountGetResp>> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;

    /**
     * 员工第三方唯一标识，不会变更
     */
    private String userId;

    /**
     * 1:企业微信, 2:钉钉,3:飞书,4, 定制, 5:标准对接,非必填默认5
     */
    private Integer thirdType;

    @FormField("userid")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    @FormField("thirdType")
    public Integer getThirdType() {
        return thirdType;
    }

    public void setThirdType(Integer thirdType) {
        this.thirdType = thirdType;
    }
}
