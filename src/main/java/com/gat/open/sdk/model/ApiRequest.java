/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model;

import com.gat.open.sdk.http.HttpMessageConverter;

import java.util.Map;

/**
 * Created by August.Zhou on 2022/6/27 12:25
 */
public abstract class ApiRequest<T> {
    protected String version="1.0.0";

    public abstract Map<String, String> toRequestParams(HttpMessageConverter httpMessageConverter);

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
