package com.gat.open.sdk.model.enterprise;

import java.util.Date;

import com.gat.open.sdk.model.enums.LoginCodeEnum;
import com.gat.open.sdk.model.enums.RuleTypeEnum;
import com.gat.open.sdk.model.enums.ThirdTypeEnum;

/**
 * 企业配置表
 */
public class ThirdSyncSettingResponse {

    private Integer       id;
    private ThirdTypeEnum thirdType;             //对接类型 1、企业微信 2、钉钉 3、飞书
    private String        thirdEnterpriseId;     //第三方企业ID
    private String        thirdOpenEnterpriseId; //第三方开放企业ID
    private RuleTypeEnum  ruleType;              // 同步规则类型 0 按企业区分 1 按部门区分 2 按扩展属性区分
    private Integer       mustHaveMobile;        //必填手机，1 只同步手机 2 手机邮箱必填之一 3 手机和邮箱都不同步 4 只同步邮箱， 默认 3
    private Integer       mustHaveCode;          //必填工号，1 是 0 否 2 userid当工号， 默认0
    private Integer       mustHaveBirthDay;      //必填生日， 1 同步且必填 0 同步且不必填 2 不同步， 默认 0
    private Integer       mustHaveEntryDay;      //必填入职日期， 1 同步且必填 0 同步且不必填 2 不同步， 默认 0
    private Integer       isAllowSync;           //上述未填写是否允许同步，1 是 0 否 默认 0
    private Integer       needSyncDept;          //是否同步部门，1是0否
    private String        statusMapping;         //企业微信员工状态:1已激活,2已禁用,4未激活,5退出企业;关爱通员工状态：1在职,0离职
    private String        mobileAreas;           //手机区号，例如泰国+66，土耳其+90，多个用英文逗号隔开
    private String        contactEmail;          //默认联系人邮箱
    /**
     * 登录绑定的方式;为了支持未开启自动同步的企业 | 1 | 第三方userId作为工号 | | 2 | 第三方userId和员工绑定关系的模式 | | 3
     * | 第三方userId作为工号以及和员工绑定关系模式 | | 4 | 第三方扩展属性作为工号 | | 5 | 第三方工号作为工号 | | 6 |
     * 手机号作为工号
     */
    private LoginCodeEnum loginCode;
    private String        loginContent;          //loginCode为4时,loginContent为第三方的扩展字段名称
    private String        additionalInformation;
    //是否是ISV 0 否 1 是
    private Integer       isIsv;
    private Integer       isvId;                 //开放平台Isv的ID
    // 是否允许通知 0 否 1 是 默认 1
    private Integer       isAllowNotify;
    // 使用过期时间，只有代开发模式的企业才有值
    private Date          trialExpirationTime;
    // 授权时间，只有代开发模式的企业才有值
    private Date          authTime;
    //备注
    private String        remark;
    //是否开通员工授权功能 0 否 1 是 ，开通后，员工授权即可获取员工敏感信息
    private Integer       isOpenEmployeeAuth;
    private Date          timeCreated;           //创建时间
    private Date          timeModified;          //修改时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ThirdTypeEnum getThirdType() {
        return thirdType;
    }

    public void setThirdType(ThirdTypeEnum thirdType) {
        this.thirdType = thirdType;
    }

    public String getThirdEnterpriseId() {
        return thirdEnterpriseId;
    }

    public void setThirdEnterpriseId(String thirdEnterpriseId) {
        this.thirdEnterpriseId = thirdEnterpriseId;
    }

    public String getThirdOpenEnterpriseId() {
        return thirdOpenEnterpriseId;
    }

    public void setThirdOpenEnterpriseId(String thirdOpenEnterpriseId) {
        this.thirdOpenEnterpriseId = thirdOpenEnterpriseId;
    }

    public RuleTypeEnum getRuleType() {
        return ruleType;
    }

    public void setRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
    }

    public Integer getMustHaveMobile() {
        return mustHaveMobile;
    }

    public void setMustHaveMobile(Integer mustHaveMobile) {
        this.mustHaveMobile = mustHaveMobile;
    }

    public Integer getMustHaveCode() {
        return mustHaveCode;
    }

    public void setMustHaveCode(Integer mustHaveCode) {
        this.mustHaveCode = mustHaveCode;
    }

    public Integer getMustHaveBirthDay() {
        return mustHaveBirthDay;
    }

    public void setMustHaveBirthDay(Integer mustHaveBirthDay) {
        this.mustHaveBirthDay = mustHaveBirthDay;
    }

    public Integer getMustHaveEntryDay() {
        return mustHaveEntryDay;
    }

    public void setMustHaveEntryDay(Integer mustHaveEntryDay) {
        this.mustHaveEntryDay = mustHaveEntryDay;
    }

    public Integer getIsAllowSync() {
        return isAllowSync;
    }

    public void setIsAllowSync(Integer isAllowSync) {
        this.isAllowSync = isAllowSync;
    }

    public Integer getNeedSyncDept() {
        return needSyncDept;
    }

    public void setNeedSyncDept(Integer needSyncDept) {
        this.needSyncDept = needSyncDept;
    }

    public String getStatusMapping() {
        return statusMapping;
    }

    public void setStatusMapping(String statusMapping) {
        this.statusMapping = statusMapping;
    }

    public String getMobileAreas() {
        return mobileAreas;
    }

    public void setMobileAreas(String mobileAreas) {
        this.mobileAreas = mobileAreas;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public LoginCodeEnum getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(LoginCodeEnum loginCode) {
        this.loginCode = loginCode;
    }

    public String getLoginContent() {
        return loginContent;
    }

    public void setLoginContent(String loginContent) {
        this.loginContent = loginContent;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public Integer getIsIsv() {
        return isIsv;
    }

    public void setIsIsv(Integer isIsv) {
        this.isIsv = isIsv;
    }

    public Integer getIsvId() {
        return isvId;
    }

    public void setIsvId(Integer isvId) {
        this.isvId = isvId;
    }

    public Integer getIsAllowNotify() {
        return isAllowNotify;
    }

    public void setIsAllowNotify(Integer isAllowNotify) {
        this.isAllowNotify = isAllowNotify;
    }

    public Date getTrialExpirationTime() {
        return trialExpirationTime;
    }

    public void setTrialExpirationTime(Date trialExpirationTime) {
        this.trialExpirationTime = trialExpirationTime;
    }

    public Date getAuthTime() {
        return authTime;
    }

    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsOpenEmployeeAuth() {
        return isOpenEmployeeAuth;
    }

    public void setIsOpenEmployeeAuth(Integer isOpenEmployeeAuth) {
        this.isOpenEmployeeAuth = isOpenEmployeeAuth;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getTimeModified() {
        return timeModified;
    }

    public void setTimeModified(Date timeModified) {
        this.timeModified = timeModified;
    }
}
