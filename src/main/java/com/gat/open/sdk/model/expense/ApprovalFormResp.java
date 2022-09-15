/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.expense;

import java.math.BigDecimal;

/**
 * 审批单信息
 */
public class ApprovalFormResp {
    /**
     * 员工唯一标识
     */
    private String userid;

    /**
     * 外部系统审批单号
     */
    private String approveExtNo;
    /**
     * 关爱通审批单号
     */
    private String approveNo;

    /**
     * 审批金额
     */
    private BigDecimal approveAmount;

    /**
     * 审批人
     */
    private String approveOperator;

    /**
     * 审批时间
     */
    private String approveTime;

    /**
     * 审批结果 1通过 2驳回
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
     * 生效开始时间
     */
    private String effectiveStart;

    /**
     * 生效结束时间
     */
    private String effectiveEnd;

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

    public String getApproveNo() {
        return approveNo;
    }

    public void setApproveNo(String approveNo) {
        this.approveNo = approveNo;
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
