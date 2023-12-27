/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

import com.gat.open.sdk.model.FormField;
import com.gat.open.sdk.model.FormRequest;
import com.gat.open.sdk.seller.model.response.PersonAssetsResponse;

public class PersonAssetsRequest extends FormRequest<PersonAssetsResponse> {
    private String openId;

    @FormField("openId")
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}
