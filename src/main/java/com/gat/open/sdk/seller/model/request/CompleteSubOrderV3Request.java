/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

import com.gat.open.sdk.model.JsonRequest;
import com.gat.open.sdk.seller.model.response.CompleteSubOrderV3Response;

public class CompleteSubOrderV3Request extends JsonRequest<CompleteSubOrderV3Response> {
    public CompleteSubOrderV3Request() {
        noSnake = true;
    }
    /**
     * 订单号
     */
    private String subOrderNo;

    /**
     * 订单完成时间
     */
    private String completeTime;

    private String sellerCode;

    public String getSubOrderNo() {
        return subOrderNo;
    }

    public void setSubOrderNo(String subOrderNo) {
        this.subOrderNo = subOrderNo;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }
}
