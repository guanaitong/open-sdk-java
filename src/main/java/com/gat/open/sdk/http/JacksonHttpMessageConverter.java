/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.http;

import java.lang.reflect.Type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.gat.open.sdk.model.ApiResponse;
import com.gat.open.sdk.model.JsonRequest;
import com.gat.open.sdk.util.JSON;

public class JacksonHttpMessageConverter implements HttpMessageConverter {

    @Override
    public <T> ApiResponse<T> read(byte[] body, Type type) {
        TypeFactory typeFactory = JSON.getTypeFactory();
        JavaType javaType = typeFactory.constructParametricType(ApiResponse.class, typeFactory.constructType(type));
        return JSON.parse(body, javaType);
    }

    @Override
    public <I, O> O write(I i, Class<O> oClass) {
        if (!String.class.equals(oClass)) {
            throw new UnsupportedOperationException("Unsupported");
        }
        if (i instanceof JsonRequest && ((JsonRequest) i).isNoSnake()) {
            return (O) JSON.toJSONString(i, true);
        }
        return (O) JSON.toJSONString(i);
    }
}
