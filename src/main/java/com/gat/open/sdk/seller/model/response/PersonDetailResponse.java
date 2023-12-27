/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonDetailResponse  {
    @JsonProperty("openId")
    private String openId;
    @JsonProperty("groupOpenId")
    private String groupOpenId;
    @JsonProperty("enterpriseOpenId")
    private String enterpriseOpenId;

    /** 以下是员工信息 */
    /** 员工姓名 */
    @JsonProperty("name")
    private String name;
    /** 头像 */
    @JsonProperty("portrait")
    private String portrait;
    /** 性别 */
    @JsonProperty("sex")
    private Integer sex;
    /** 手机区号 */
    @JsonProperty("mobileArea")
    private Integer mobileArea;
    /** 手机号码 */
    @JsonProperty("mobile")
    private String mobile;
    /** 生日 */
    @JsonProperty("birthDay")
    private String birthDay;
    /** 邮箱 */
    @JsonProperty("email")
    private String email;
    /** 收货地址 */
    @JsonProperty("address")
    private String address;

    /** 以下是员工所属的企业信息 */
    /** 公司名称 */
    @JsonProperty("enterpriseName")
    private String enterpriseName;
    /** 工号 */
    @JsonProperty("code")
    private String code;
    /** 部门 */
    @JsonProperty("department")
    private String department;
    /** 座机 */
    @JsonProperty("fixedPhone")
    private String fixedPhone;
    /** 入职日期 */
    @JsonProperty("joinDate")
    private String joinDate;
    /** 公司编号 */
    @JsonProperty("enterpriseId")
    private Integer enterpriseId;
    /** 证件信息 */
    @JsonProperty("idInfo")
    private String idInfo;
    /** 员工分类 */
    @JsonProperty("category")
    private String category;
    /** 员工级别 */
    @JsonProperty("level")
    private String level;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getGroupOpenId() {
        return groupOpenId;
    }

    public void setGroupOpenId(String groupOpenId) {
        this.groupOpenId = groupOpenId;
    }

    public String getEnterpriseOpenId() {
        return enterpriseOpenId;
    }

    public void setEnterpriseOpenId(String enterpriseOpenId) {
        this.enterpriseOpenId = enterpriseOpenId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIdInfo() {
        return idInfo;
    }

    public void setIdInfo(String idInfo) {
        this.idInfo = idInfo;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getMobileArea() {
        return mobileArea;
    }

    public void setMobileArea(Integer mobileArea) {
        this.mobileArea = mobileArea;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFixedPhone() {
        return fixedPhone;
    }

    public void setFixedPhone(String fixedPhone) {
        this.fixedPhone = fixedPhone;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
}
