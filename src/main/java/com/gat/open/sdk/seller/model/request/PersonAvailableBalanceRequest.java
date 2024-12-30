/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

import com.gat.open.sdk.model.FormField;
import com.gat.open.sdk.model.FormRequest;
import com.gat.open.sdk.seller.model.response.PersonAvailableBalanceResp;

public class PersonAvailableBalanceRequest extends FormRequest<PersonAvailableBalanceResp> {
    private String openUserId;
    private String sellerCode;

    @FormField("openUserId")
    public String getOpenUserId() {
        return openUserId;
    }

    public void setOpenUserId(String openUserId) {
        this.openUserId = openUserId;
    }

    @FormField("sellerCode")
    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }
}
