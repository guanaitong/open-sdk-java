/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model;

import java.util.HashMap;
import java.util.Map;

import com.gat.open.sdk.http.HttpMessageConverter;

import static com.gat.open.sdk.util.Constants.*;

/**
 * Created by August.Zhou on 2022/6/27 12:25
 */
public abstract class JsonRequest<T> extends ApiRequest<T> {
    protected boolean noSnake;

    @Override
    public final Map<String, String> toRequestParams(HttpMessageConverter httpMessageConverter) {
        String jsonBody = httpMessageConverter.writeToString(this);
        Map<String, String> params = new HashMap<>();
        params.put(JSON_BODY_KEY, jsonBody);
        params.put(VERSION_KEY, version);
        params.put(GRANT_TYPE_KEY, grantType);
        return params;
    }

    public boolean isNoSnake() {
        return noSnake;
    }
}
