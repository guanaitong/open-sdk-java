package com.gat.open.sdk.model;

import java.math.BigDecimal;

/**
 * @author Stanley Shen
 * @version 1.0.0
 * @date 2017/12/18 20:07
 */
public class Limit {
    private String limitOpenid;
    private String corpCode;
    private BigDecimal amount;
    private String remark;
    private String comment;
    private String externalCode;

    public Limit() {
    }

    public String getLimitOpenid() {
        return this.limitOpenid;
    }

    public void setLimitOpenid(String limitOpenid) {
        this.limitOpenid = limitOpenid;
    }

    public String getCorpCode() {
        return this.corpCode;
    }

    public void setCorpCode(String corpCode) {
        this.corpCode = corpCode;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getExternalCode() {
        return this.externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }
}
