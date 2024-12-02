/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.enums;

import java.util.Arrays;
import java.util.Objects;

/**
 * 签名方式
 */
public enum OpenSignType {

    SHA1(0),
    SHA256(2),
    SHA512(3);

    private final Integer type;

    OpenSignType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public static OpenSignType getSignType(Integer type) {
        if (Objects.isNull(type)) {
            return OpenSignType.SHA1;
        }
        return Arrays.stream(OpenSignType.values()).filter(x -> x.getType().equals(type)).findAny().orElse(OpenSignType.SHA1);
    }
}
