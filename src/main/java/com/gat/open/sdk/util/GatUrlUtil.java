/*
 * Copyright 2007-2021, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.util;

import com.gat.open.sdk.constant.GATOpenConstant;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * @author Stanley Shen
 * @version 1.0.0
 * date 2018/11/22 17:50
 */
public class GatUrlUtil {

    private GatUrlUtil() {
        // hide constructor
    }

    public static String build(Map<String, Object> params) throws UnsupportedEncodingException {
        return build(GATOpenConstant.getLoginRequestUrl(), params);
    }

    public static String build(String url, Map<String, Object> params) throws UnsupportedEncodingException {
        if (params == null || params.isEmpty()) {
            return url;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(url);
        stringBuilder.append("?");
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            if (StringUtils.isNoneEmpty(entry.getValue().toString())) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append("=");
                stringBuilder.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
                stringBuilder.append("&");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

}
