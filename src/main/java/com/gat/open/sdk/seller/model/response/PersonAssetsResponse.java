/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PersonAssetsResponse {
    @JsonProperty("assetsList")
    private List<Assets> assetsList;
}
