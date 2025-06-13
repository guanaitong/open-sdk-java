/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.enums;

/**
 * 登录绑定的方式;为了支持未开启自动同步的企业
 */
public enum LoginCodeEnum implements KeyValueEnum<Integer, String> {

    USERID_AS_CODE(1, "第三方userId作为工号"),

    @Deprecated
    THIRD_AS_CODE(2, "第三方userId和员工绑定关系的模式"),

    @Deprecated
    THIRD_USERID_AS_CODE(3, "第三方userId作为工号以及和员工绑定关系模式"),

    EXTENSION_AS_CODE(4, "第三方扩展属性作为工号"),

    THIRD_CODE_AS_CODE(5, "第三方工号作为工号"),

    MOBILE_AS_CODE(6, "手机号作为工号"),;

    private int    code;

    private String desc;

    LoginCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

}
