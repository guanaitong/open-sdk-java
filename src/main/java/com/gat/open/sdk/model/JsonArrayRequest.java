/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gat.open.sdk.http.HttpMessageConverter;

import static com.gat.open.sdk.util.Constants.JSON_BODY_KEY;
import static com.gat.open.sdk.util.Constants.VERSION_KEY;
import static com.gat.open.sdk.util.Constants.GRANT_TYPE_KEY;

//3个老接口使用此形势，新接口建议使用JsonRequest里面加list的传参数形式，统一将业务参数放在json-body中
public class JsonArrayRequest<T> extends ApiRequest<T> {
    private List<?> array;

    public JsonArrayRequest(List<? extends Object> array) {
        this.array = array;
    }

    @Override
    public final Map<String, String> toRequestParams(HttpMessageConverter httpMessageConverter) {
        String jsonBody = httpMessageConverter.writeToString(array);
        Map<String, String> params = new HashMap<>();
        params.put(JSON_BODY_KEY, jsonBody);
        params.put(VERSION_KEY, version);
        params.put(GRANT_TYPE_KEY, grantType);
        return params;
    }

}