/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.employee;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormField;
import com.gat.open.sdk.model.FormRequest;

import java.util.List;

/**
 * https://open.guanaitong.com/doc/enterprise/employee-update
 * Created by August.Zhou on 2022/6/27 15:55
 */
public class EmployeeUpdateRequest extends FormRequest<String> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;
    private String userId;
    private String code;
    private String name;
    private Integer gender;
    private String email;
    private String mobileArea;
    private String mobile;
    private String remark;
    private String deptCode;
    private String level;
    private List<String> category;
    private String birthDay;
    private String entryDay;
    private Integer cardType;
    private String cardNo;
    private List<ThirdUser> extattr;
    private List<EmployeeAttribute> employeeAttribute;
    private Integer costCenterId;


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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileArea() {
        return mobileArea;
    }

    public void setMobileArea(String mobileArea) {
        this.mobileArea = mobileArea;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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

    @FormField(converter = FormField.TextConverter.JOIN)
    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    @FormField(converter = FormField.TextConverter.JSON)
    public List<ThirdUser> getExtattr() {
        return extattr;
    }

    public void setExtattr(List<ThirdUser> extattr) {
        this.extattr = extattr;
    }

    @FormField(converter = FormField.TextConverter.JSON)
    public List<EmployeeAttribute> getEmployeeAttribute() {
        return employeeAttribute;
    }

    public void setEmployeeAttribute(List<EmployeeAttribute> employeeAttribute) {
        this.employeeAttribute = employeeAttribute;
    }

    public Integer getCostCenterId() {
        return costCenterId;
    }

    public void setCostCenterId(Integer costCenterId) {
        this.costCenterId = costCenterId;
    }

}
