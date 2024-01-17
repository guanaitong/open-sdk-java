/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

import com.gat.open.sdk.model.JsonRequest;
import com.gat.open.sdk.seller.model.response.GetPayResultV3Response;
import com.gat.open.sdk.seller.model.response.GetRefundResultV3Response;

public class GetRefundResultV3Request extends JsonRequest<GetRefundResultV3Response> {
    public GetRefundResultV3Request() {
        noSnake = true;
    }

    private String refundOrderNo;
    private String refundSeqNo;
    private String refundOuterTradeNo;
    private String sellerCode;

    public String getRefundOrderNo() {
        return refundOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

    public String getRefundSeqNo() {
        return refundSeqNo;
    }

    public void setRefundSeqNo(String refundSeqNo) {
        this.refundSeqNo = refundSeqNo;
    }

    public String getRefundOuterTradeNo() {
        return refundOuterTradeNo;
    }

    public void setRefundOuterTradeNo(String refundOuterTradeNo) {
        this.refundOuterTradeNo = refundOuterTradeNo;
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }
}
