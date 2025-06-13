/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormField;
import com.gat.open.sdk.model.FormRequest;
import com.gat.open.sdk.model.Pagination;

/**
 * https://open.guanaitong.com/doc/enterprise/employee-quota-trade/
 */
public class EmployeeAssetsLimitRecordRequest extends FormRequest<Pagination<EmployeeAssetsLimitRecordResp>> implements EnterpriseCodeRequest {
    /**
     * 员工第三方唯一标识，不会变更
     */
    private String userId;
    /**
     * 如需指定账户查询，先通过员工资产账户查询获取account_openid
     */
    private String accountOpenid;
    /**
     * 流水类型：0.所有类型流水(1-11)，1.交易类(1,2,4,5)，2.发放回收类(6,7)
     */
    private Integer recordType;
    /**
     * 1:企业微信, 2:钉钉,3:飞书,4, 定制, 5:标准对接,非必填默认5
     */
    private Integer thirdType;
    /**
     * 企业编号（集团和运营商必填,企业不填）
     */
    private String enterpriseCode;
    /**
     * 显示行数,默认20，最大支持100条
     */
    private Integer pageSize = 20;
    /**
     * 开始页数,默认1
     */
    private Integer pageIndex = 1;
    /**
     * 流水时间范围，格式yyyy-MM-dd HH:mm:ss
     */
    private String timeStart;
    /**
     * 流水时间范围，格式yyyy-MM-dd HH:mm:ss
     */
    private String timeEnd;

    @FormField("userid")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountOpenid() {
        return accountOpenid;
    }

    public void setAccountOpenid(String accountOpenid) {
        this.accountOpenid = accountOpenid;
    }

    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
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

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }
}
