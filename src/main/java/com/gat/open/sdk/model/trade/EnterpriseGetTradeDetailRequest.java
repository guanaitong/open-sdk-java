/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.trade;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;

/**
 * https://open.guanaitong.com/doc/enterprise/trade-detai
 */
public class EnterpriseGetTradeDetailRequest extends FormRequest<EnterpriseGetTradeDetailResp> implements EnterpriseCodeRequest {
    /**
     * 企业编号（集团和运营商必填,企业不填）
     */
    private String enterpriseCode;
    /**
     * 关爱通的支付单号
     */
    private String tradeNo;


    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
