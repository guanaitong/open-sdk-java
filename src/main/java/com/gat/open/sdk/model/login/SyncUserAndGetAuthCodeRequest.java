/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.login;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormField;
import com.gat.open.sdk.model.FormRequest;

/**
 * Created by August.Zhou on 2022/6/27 15:47
 */
public class SyncUserAndGetAuthCodeRequest extends FormRequest<String> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;
    /**
     * 员工第三方唯一标识，不会变更
     */
    private String userId;
    /**
     * 员工工号
     */
    private String code;
    /**
     * 员工绑定手机号
     */
    private String mobile;
    /**
     * 手机号区号
     */
    private String mobileArea;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private Integer gender;

    /**
     * 备注
     */
    private String remark;

    /**
     * 扩展属性数组（需管理员提前开通扩展字段）
     * 示例：[{"attributeCode":"customInformationOne","attributeValue":"工龄值"},{"attributeCode":"customInformationTwo","attributeValue":"基准岗位值"},{"attributeCode":"customInformationThree","attributeValue":"部门值"},{"attributeCode":"customInformationFour","attributeValue":"司龄值"}]
     */
    private String employeeAttribute;

    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileArea() {
        return mobileArea;
    }

    public void setMobileArea(String mobileArea) {
        this.mobileArea = mobileArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getEmployeeAttribute() {
        return employeeAttribute;
    }

    public void setEmployeeAttribute(String employeeAttribute) {
        this.employeeAttribute = employeeAttribute;
    }
}
