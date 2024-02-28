/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model;

import com.gat.open.sdk.util.Constants;

public enum EnvEnum {

    LOCAL("local", "http://localhost"),
    TEST("test", Constants.BASE_URL_TEST),
    PRODUCT("product", Constants.BASE_URL_PRODUCT);

    private String env;

    private String baseUrl;

    EnvEnum(String env, String baseUrl) {
        this.env = env;
        this.baseUrl = baseUrl;
    }

    public String getEnv() {
        return env;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public static EnvEnum of(String env) {
        for (EnvEnum value : EnvEnum.values()) {
            if (value.env.equals(env))
                return value;
        }
        return EnvEnum.TEST;
    }

    public String getCode() {
        return env;
    }

    public String getDesc() {
        return baseUrl;
    }
}
