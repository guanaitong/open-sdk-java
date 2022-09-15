/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.activity;

import com.gat.open.sdk.model.FormField;
import com.gat.open.sdk.model.FormRequest;

import java.math.BigDecimal;
import java.util.List;

/**
 * https://open.guanaitong.com/doc/enterprise/activity-assign/
 */
public class EnterpriseActivityAssignRequest extends FormRequest<String> {
    /**
     * 活动id
     */
    private Long activityId;
    /**
     * 外部发放号
     */
    private String externalCode;
    /**
     * 用户唯一标识，多个用英文逗号隔开，最大限制50人
     */
    private List<String> userIds;
    /**
     * 指定的活动中asset_type为[point,coupon]时，需要指定此字段
     */
    private String accountOpenId;
    /**
     * 发放原因
     */
    private String reason;
    /**
     * 支持3种发放模式：birthday（按生日）；entryDay（按入职）；immediate（立即发放）
     */
    private String mode;
    /**
     * 发放金额或发放数量；当asset_type为[point,quota]时，请填金额字段；asset_type为[coupon]时，请填整数，代表兑换券张数
     */
    private BigDecimal amount;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    @FormField(value = "user_ids", converter = FormField.TextConverter.JOIN)
    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    @FormField("account_openid")
    public String getAccountOpenId() {
        return accountOpenId;
    }

    public void setAccountOpenId(String accountOpenId) {
        this.accountOpenId = accountOpenId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
