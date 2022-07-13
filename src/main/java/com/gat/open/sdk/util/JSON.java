/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.gat.open.sdk.exception.OpenSdkException;

import java.nio.charset.StandardCharsets;


/**
 * Created by August.Zhou on 2022/6/27 11:42
 */
public class JSON {

    private static final ObjectMapper OBJECT_MAPPER;

    static {
        OBJECT_MAPPER = new ObjectMapper();
        OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true)
                .configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true)
                .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
    }


    /**
     * 将对象输出为json字符串
     *
     * @param object       对象
     * @return
     */
    public static String toJSONString(Object object) {
        try {
            return OBJECT_MAPPER.writeValueAsString(object);
        } catch (Throwable e) {
            throw new OpenSdkException("json format error", e);
        }
    }

    /**
     * 解析为指定类
     *
     * @param data
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T parse(byte[] data, Class<T> clazz) {
        try {
            return OBJECT_MAPPER.readValue(data, clazz);
        } catch (Throwable e) {
            throw new OpenSdkException("json parse error for text:" + new String(data, StandardCharsets.UTF_8), e);
        }
    }

    /**
     * 解析为指定类
     *
     * @param text
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T parse(String text, Class<T> clazz) {
        if (text == null || text.isEmpty()) {
            return null;
        }
        try {
            return OBJECT_MAPPER.readValue(text, clazz);
        } catch (Throwable e) {
            throw new OpenSdkException("json parse error for text:" + text, e);
        }
    }

    /**
     * 用于处理带泛型嵌套的类
     *
     * @param data
     * @param javaType
     * @param <T>
     * @return
     */
    public static <T> T parse(byte[] data, JavaType javaType) {
        try {
            return OBJECT_MAPPER.readValue(data, javaType);
        } catch (Throwable e) {
            throw new OpenSdkException("json error", e);
        }
    }


    /**
     * Accessor for getting currently configured {@link TypeFactory} instance.
     */
    public static TypeFactory getTypeFactory() {
        return OBJECT_MAPPER.getTypeFactory();
    }


}
