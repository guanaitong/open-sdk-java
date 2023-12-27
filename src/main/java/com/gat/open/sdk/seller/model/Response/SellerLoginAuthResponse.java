/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.Response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SellerLoginAuthResponse {

    @JsonProperty("openId")
    private String openId;
    @JsonProperty("groupOpenId")
    private String groupOpenId;
    @JsonProperty("enterpriseOpenId")
    private String enterpriseOpenId;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getEnterpriseOpenId() {
        return enterpriseOpenId;
    }

    public void setEnterpriseOpenId(String enterpriseOpenId) {
        this.enterpriseOpenId = enterpriseOpenId;
    }

    public String getGroupOpenId() {
        return groupOpenId;
    }

    public void setGroupOpenId(String groupOpenId) {
        this.groupOpenId = groupOpenId;
    }
}
