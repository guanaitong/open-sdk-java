/*
 * Copyright 2007-2021, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.bo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author wenbin
 * @date 2017/12/8
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeBO {

    private String corp_code;
    private String name;
    private Integer gender;
    private Integer card_type;
    private Integer send_invite;
    private String card_no;
    private String email;
    private String mobile;
    private String remark;
    private String dept_code;
    private String level;
    private String category;
    private String birth_day;
    private String entry_day;

    public String getCorp_code() {
        return corp_code;
    }

    public void setCorp_code(String corp_code) {
        this.corp_code = corp_code;
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

    public Integer getCard_type() {
        return card_type;
    }

    public void setCard_type(Integer card_type) {
        this.card_type = card_type;
    }

    public Integer getSend_invite() {
        return send_invite;
    }

    public void setSend_invite(Integer send_invite) {
        this.send_invite = send_invite;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
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

    public String getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(String birth_day) {
        this.birth_day = birth_day;
    }

    public String getEntry_day() {
        return entry_day;
    }

    public void setEntry_day(String entry_day) {
        this.entry_day = entry_day;
    }
}
