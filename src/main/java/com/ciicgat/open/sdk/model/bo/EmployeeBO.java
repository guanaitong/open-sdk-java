package com.ciicgat.open.sdk.model.bo;

/**
 * @author wenbin
 * @date 2017/12/8
 */
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
    private String birth_day;
    private String entry_day;

    public EmployeeBO() {
    }

    public String getCorp_code() {
        return this.corp_code;
    }

    public void setCorp_code(String corp_code) {
        this.corp_code = corp_code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getCard_type() {
        return this.card_type;
    }

    public void setCard_type(Integer card_type) {
        this.card_type = card_type;
    }

    public String getCard_no() {
        return this.card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDept_code() {
        return this.dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getBirth_day() {
        return this.birth_day;
    }

    public void setBirth_day(String birth_day) {
        this.birth_day = birth_day;
    }

    public String getEntry_day() {
        return this.entry_day;
    }

    public void setEntry_day(String entry_day) {
        this.entry_day = entry_day;
    }

    public Integer getSend_invite() {
        return this.send_invite;
    }

    public void setSend_invite(Integer send_invite) {
        this.send_invite = send_invite;
    }

    @Override
    public String toString() {
        return "EmployeeBO{" +
                "corp_code='" + corp_code + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", card_type=" + card_type +
                ", send_invite=" + send_invite +
                ", card_no='" + card_no + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", remark='" + remark + '\'' +
                ", dept_code='" + dept_code + '\'' +
                ", level='" + level + '\'' +
                ", birth_day='" + birth_day + '\'' +
                ", entry_day='" + entry_day + '\'' +
                '}';
    }
}
