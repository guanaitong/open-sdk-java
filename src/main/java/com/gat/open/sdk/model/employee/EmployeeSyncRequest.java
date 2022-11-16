/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.employee;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormField;
import com.gat.open.sdk.model.FormRequest;

import java.util.List;

public class EmployeeSyncRequest extends FormRequest<String> implements EnterpriseCodeRequest {
    private String code;
    private String userId;
    private Integer thirdType;
    private String enterpriseCode;
    private String name;
    private Integer gender = 3;
    private Integer status;
    private String email;
    private Integer mobileArea;
    private String mobile;
    private String deptCode;
    private String birthDay;
    private String entryDay;
    private Integer cardType;
    private String cardNo;
    private List<EmployeeAttribute> employeeAttribute;
    private String level; // 员工级别
    private List<String> category; //员工分类
    private String remark;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    @FormField("userid")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getThirdType() {
        return thirdType;
    }

    public void setThirdType(Integer thirdType) {
        this.thirdType = thirdType;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobileArea() {
        return mobileArea;
    }

    public void setMobileArea(Integer mobileArea) {
        this.mobileArea = mobileArea;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getEntryDay() {
        return entryDay;
    }

    public void setEntryDay(String entryDay) {
        this.entryDay = entryDay;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
    @FormField(converter = FormField.TextConverter.JSON)
    public List<EmployeeAttribute> getEmployeeAttribute() {
        return employeeAttribute;
    }

    public void setEmployeeAttribute(List<EmployeeAttribute> employeeAttribute) {
        this.employeeAttribute = employeeAttribute;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    @FormField(converter = FormField.TextConverter.JOIN)
    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
