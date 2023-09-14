/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormField;
import com.gat.open.sdk.model.FormRequest;

import java.math.BigDecimal;

/**
 * 额度：https://open.guanaitong.com/doc/enterprise/quota-assign-single/
 * <p>
 * Created by August.Zhou on 2022/6/27 13:54
 */
public class EnterpriseAssetsAssignLimitSingleRequest extends FormRequest<String> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;

    /**
     * 员工第三方唯一标识，不会变更
     */
    private String userId;

    /**
     * 兼容老的发放场景使用工号定位员工
     */
    private String corpCode;

    /**
     * 1:企业微信, 2:钉钉,3:飞书,4, 定制, 5:标准对接,非必填默认5
     */
    private Integer thirdType;
    /**
     * 额度唯一标识，后台添加额度之后，线下把limit的openid给企业。
     */
    private String limitOpenid;
    /**
     * 发放金额
     */
    private BigDecimal amount;
    /**
     * 发放原因
     */
    private String remark;
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

    public String getCorpCode() {
        return corpCode;
    }

    public void setCorpCode(String corpCode) {
        this.corpCode = corpCode;
    }

    @FormField("thirdType")
    public Integer getThirdType() {
        return thirdType;
    }

    public void setThirdType(Integer thirdType) {
        this.thirdType = thirdType;
    }

    public String getLimitOpenid() {
        return limitOpenid;
    }

    public void setLimitOpenid(String limitOpenid) {
        this.limitOpenid = limitOpenid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }
}
