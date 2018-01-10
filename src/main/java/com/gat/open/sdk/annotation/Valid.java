package com.gat.open.sdk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 参数验证注解
 * Created by xin.hua on 2017/7/18.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Valid {

    int index() default -1;

    String field() default "";

    String regStr() default "";

    boolean required() default false;

    boolean notEmpty() default false;

    int length() default -1;

    int minLen() default -1;

    int maxLen() default -1;

    int[] intVals() default {};

    int scale() default -1;

    double decMax() default -1.0;

    double decMin() default -1.0;
}
