/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by August.Zhou on 2022/6/27 18:00
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FormField {
    String value() default "";

    TextConverter converter() default TextConverter.ToString;

    enum TextConverter {
        /**
         * 直接调用Object.toString方法
         */
        ToString,
        /**
         * 转化为json
         */
        JSON,
        /**
         * 逗号拼接的数组
         */
        JOIN,

    }
}
