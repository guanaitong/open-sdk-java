/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.enums;

public enum ThirdTypeEnum implements KeyValueEnum<Integer, String> {
    WEI_XIN_WORK(1, "企业微信", 1),
    DING_DING(2, "钉钉", 2),
    FEI_SHU(3, "飞书", 6),
    CUSTOMIZED_DEV(4, "定制对接开发", 3),
    STANDARD_DOCKING(5, "标准对接", 3),
    BEI_SEN(6, "北森对接", 7);

    ThirdTypeEnum(Integer type, String name, Integer userdoorThirdType) {
        this.type = type;
        this.name = name;
        this.userdoorThirdType = userdoorThirdType;
    }

    private final Integer type;

    private final String  name;

    private final Integer userdoorThirdType;

    public Integer getUserdoorThirdType() {
        return userdoorThirdType;
    }

    @Override
    public Integer getCode() {
        return type;
    }

    @Override
    public String getDesc() {
        return name;
    }
}
