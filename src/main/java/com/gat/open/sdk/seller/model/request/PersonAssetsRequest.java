/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

import com.gat.open.sdk.model.FormField;
import com.gat.open.sdk.model.FormRequest;
import com.gat.open.sdk.seller.model.response.PersonAssetsResponse;

public class PersonAssetsRequest extends FormRequest<PersonAssetsResponse> {
    private String openId;
    private String sellerCode;

    @FormField("openId")
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
    @FormField("sellerCode")
    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }
}
