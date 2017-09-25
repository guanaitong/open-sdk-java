package com.gat.open.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by xin.hua on 2017/7/19.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {
    private String dept_name;
    private String corp_code;
    private String name;
    private int gender;
    private int card_type;
    private String card_no;
    private String email;
    private String mobile;
    private String remark;
    private String birth_day;
    private String entry_day;
    private String time_created;
    private String time_active;

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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getCard_type() {
        return card_type;
    }

    public void setCard_type(int card_type) {
        this.card_type = card_type;
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

    public String getTime_created() {
        return time_created;
    }

    public void setTime_created(String time_created) {
        this.time_created = time_created;
    }

    public String getTime_active() {
        return time_active;
    }

    public void setTime_active(String time_active) {
        this.time_active = time_active;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept_name='" + dept_name + '\'' +
                ", corp_code='" + corp_code + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", card_type=" + card_type +
                ", card_no='" + card_no + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", remark='" + remark + '\'' +
                ", birth_day='" + birth_day + '\'' +
                ", entry_day='" + entry_day + '\'' +
                ", time_created='" + time_created + '\'' +
                ", time_active='" + time_active + '\'' +
                '}';
    }
}
