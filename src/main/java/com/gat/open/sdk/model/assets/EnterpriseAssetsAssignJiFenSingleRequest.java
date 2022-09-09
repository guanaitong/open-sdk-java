/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormField;
import com.gat.open.sdk.model.FormRequest;

import java.math.BigDecimal;

/**
 * 积分：https://open.guanaitong.com/doc/enterprise/point-assign-single
 * <p>
 * Created by August.Zhou on 2022/6/27 13:54
 */
public class EnterpriseAssetsAssignJiFenSingleRequest extends FormRequest<String> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;

    /**
     * 员工第三方唯一标识，不会变更
     */
    private String userId;

    /**
     * 1:企业微信, 2:钉钉,3:飞书,4, 定制, 5:标准对接,非必填默认5
     */
    private Integer thirdType;
    /**
     * 积分账户的openid,决定扣哪个积分账户的积分
     */
    private String accountOpenid;
    /**
     * 发放金额
     */
    private BigDecimal amount;
    /**
     * 发放原因
     */
    private String reason;
    /**
     * 外部交易号，最小长度2位。
     */
    private String externalCode;

    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
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

    @FormField("thirdType")
    public Integer getThirdType() {
        return thirdType;
    }

    public void setThirdType(Integer thirdType) {
        this.thirdType = thirdType;
    }

    public String getAccountOpenid() {
        return accountOpenid;
    }

    public void setAccountOpenid(String accountOpenid) {
        this.accountOpenid = accountOpenid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }
}
