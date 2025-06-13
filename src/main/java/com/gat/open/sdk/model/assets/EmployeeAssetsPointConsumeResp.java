/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class EmployeeAssetsPointConsumeResp {
    /**
     * 消费时间
     */
    private String timeCreated;
    /**
     * 商户订单号
     */
    @JsonProperty("outer_tradeno")
    private String outerTradeNo;
    /**
     * 主交易号
     */
    @JsonProperty("tradeno")
    private String tradeNo;
    /**
     * 消费还是退款1(消费),2(退款)
     */
    private Integer type;
    /**
     * 员工工号
     */
    private String code;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 现金金额
     */
    private BigDecimal cash;
    /**
     * 积分金额
     */
    private BigDecimal point;
    /**
     * 消费总额：积分金额+现金金额
     */
    private BigDecimal total;
    /**
     * 备注
     */
    private String remark;
    /**
     * 服务费金额
     */
    private BigDecimal feeAmt;

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public BigDecimal getPoint() {
        return point;
    }

    public void setPoint(BigDecimal point) {
        this.point = point;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(BigDecimal feeAmt) {
        this.feeAmt = feeAmt;
    }
}
