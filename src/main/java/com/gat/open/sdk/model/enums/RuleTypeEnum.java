/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.enums;

/**
 * 同步规则类型
 */
public enum RuleTypeEnum implements KeyValueEnum<Integer, String> {

    BY_ENTERPRISE(0, "按企业同步"),

    BY_DEPARTMENT(1, "按部门同步"),

    BY_EXTENSION(2, "按扩展属性同步"),

    BY_CUSTOM(3, "自定义规则同步"),;

    private int code;

    private String desc;

    RuleTypeEnum(int code, String desc) {
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
