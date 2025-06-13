/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.consume;

import java.math.BigDecimal;


public class ConsumeListResp {
    private String tradeNo; //关爱通的支付单号
    private String outerTradeNo; //关爱通的业务单号
    private String userid; //支付人第三方唯一标识
    private String payerName; // 支付人
    private String subject; //商品描述或交易描述
    private BigDecimal totalAmount; //交易总金额
    private BigDecimal payAmount; //实际支付金额
    private BigDecimal refundAmount; //退款金额
    private Integer status; //交易状态。 1、待支付；2、支付中；3、支付完成； 4、待退款；5、退款中；6、退款；7、已冲正
    private String createTime; //交易创建时间，格式yyyy-MM-dd HH:mm:ss
    private String payTime; //交易支付时间，格式yyyy-MM-dd HH:mm:ss
    private String refundTime; //退款时间，格式yyyy-MM-dd HH:mm:ss
    private String assetCode; //使用资产

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(String refundTime) {
        this.refundTime = refundTime;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }
}
