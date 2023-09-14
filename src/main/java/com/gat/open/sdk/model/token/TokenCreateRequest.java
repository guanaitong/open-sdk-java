/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.token;

import com.gat.open.sdk.model.FormRequest;

/**
 * Created by August.Zhou on 2022/6/27 12:33
 */
public class TokenCreateRequest extends FormRequest<TokenCreateResp> {
    private String grantType = "client_credential";

    //    @JsonProperty("grant_type")
    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }
}
