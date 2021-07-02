/*
 * Copyright 2007-2021, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.util;


import com.gat.open.sdk.constant.GATOpenConstant;
import com.gat.open.sdk.exception.GATException;

/**
 * 参数校验工具类
 *
 * @author xin.hua
 * @date 2017/7/18
 */
public class ParamValidator {

    private ParamValidator() {
        // hide constructor
    }

    public static <T> T requireNonNull(T obj, String message) {
        if (obj == null) {
            throw new GATException(message);
        }
        return obj;
    }

    public static String requireNonEmpty(String obj, String message) {
        if (obj == null || obj.isEmpty() || obj.trim().isEmpty()) {
            throw new GATException(message);
        }
        return obj;
    }

    public static String requireMobile(String mobile) {
        if (!checkMobile(mobile)) {
            throw new GATException("手机号格式不匹配");
        }
        return mobile;
    }

    public static boolean contains(int[] intValues, int val) {
        if (intValues == null || intValues.length <= 0) {
            return false;
        }
        for (int intVal : intValues) {
            if (intVal == val) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkMobile(String mobile) {
        if (mobile == null || mobile.isEmpty() || mobile.trim().isEmpty()) {
            return false;
        }
        if (mobile.length() > 11) {
            return false;
        }
        return mobile.matches(GATOpenConstant.MOBILE_REGEX);
    }

}
