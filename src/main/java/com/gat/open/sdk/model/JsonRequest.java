/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model;

import static com.gat.open.sdk.util.Constants.JSON_BODY_KEY;

import java.util.HashMap;
import java.util.Map;

import com.gat.open.sdk.http.HttpMessageConverter;

/**
 * Created by August.Zhou on 2022/6/27 12:25
 */
public abstract class JsonRequest<T> extends ApiRequest<T> {
    protected boolean noSnake;

    @Override
    public final Map<String, String> toRequestParams(HttpMessageConverter httpMessageConverter) {
        String jsonBody = httpMessageConverter.writeToString(this);
        Map<String, String> params = new HashMap<>(2);
        params.put(JSON_BODY_KEY, jsonBody);
        return params;
    }

    public boolean isNoSnake() {
        return noSnake;
    }
}
