/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model;

import com.gat.open.sdk.util.JSON;

import java.util.HashMap;
import java.util.Map;

import static com.gat.open.sdk.util.Constants.JSON_BODY_KEY;

/**
 * Created by August.Zhou on 2022/6/27 12:25
 */
public abstract class JsonRequest<T> extends ApiRequest<T> {
    @Override
    public final Map<String, String> toRequestParams() {
        String jsonBody = JSON.toJSONString(this);
        Map<String, String> params = new HashMap<>(2);
        params.put(JSON_BODY_KEY, jsonBody);
        return params;
    }

}
