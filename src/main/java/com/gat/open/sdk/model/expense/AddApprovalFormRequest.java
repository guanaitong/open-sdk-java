/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.expense;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;

import java.math.BigDecimal;

/**
 * https://open.guanaitong.tech/doc/enterprise/expense/approval-form-add/
 */
public class AddApprovalFormRequest extends FormRequest<String> implements EnterpriseCodeRequest {

    /**
     * 企业编号（集团和运营商必填,企业不填）
     */
    private String enterpriseCode;

    /**
     * 审批单对应的员工唯一标识
     */
    private String userid;

    /**
     * 外部系统审批单号
     */
    private String approveExtNo;

    /**
     * 审批金额
     */
    private BigDecimal approveAmount;

    /**
     * 审批人名称，用于在关爱通显示客户系统内审批操作人
     */
    private String approveOperator;

    /**
     * 审批时间，yyyy-MM-dd HH:mm:ss，默认取当前时间
     */
    private String approveTime;

    /**
     * 审批结果，1:通过 2:驳回
     */
    private Integer approveResult;

    /**
     * 审批事由
     */
    private String approveItem;

    /**
     * 审批原因
     */
    private String approveReason;

    /**
     * 生效开始时间 格式：yyyy-MM-dd HH:mm:ss
     */
    private String effectiveStart;

    /**
     * 生效结束时间 格式：yyyy-MM-dd HH:mm:ss
     */
    private String effectiveEnd;

    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getApproveExtNo() {
        return approveExtNo;
    }

    public void setApproveExtNo(String approveExtNo) {
        this.approveExtNo = approveExtNo;
    }

    public BigDecimal getApproveAmount() {
        return approveAmount;
    }

    public void setApproveAmount(BigDecimal approveAmount) {
        this.approveAmount = approveAmount;
    }

    public String getApproveOperator() {
        return approveOperator;
    }

    public void setApproveOperator(String approveOperator) {
        this.approveOperator = approveOperator;
    }

    public String getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(String approveTime) {
        this.approveTime = approveTime;
    }

    public Integer getApproveResult() {
        return approveResult;
    }

    public void setApproveResult(Integer approveResult) {
        this.approveResult = approveResult;
    }

    public String getApproveItem() {
        return approveItem;
    }

    public void setApproveItem(String approveItem) {
        this.approveItem = approveItem;
    }

    public String getApproveReason() {
        return approveReason;
    }

    public void setApproveReason(String approveReason) {
        this.approveReason = approveReason;
    }

    public String getEffectiveStart() {
        return effectiveStart;
    }

    public void setEffectiveStart(String effectiveStart) {
        this.effectiveStart = effectiveStart;
    }

    public String getEffectiveEnd() {
        return effectiveEnd;
    }

    public void setEffectiveEnd(String effectiveEnd) {
        this.effectiveEnd = effectiveEnd;
    }
}
