/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.util;

/**
 * Created by August.Zhou on 2022/6/27 17:21
 */
public class Constants {

    public static String BASE_URL_TEST = "https://openapi.guanaitong.tech";
    public static String BASE_URL_PRODUCT = "https://openapi.guanaitong.com";

    public static String JSON_BODY_KEY = "_body";
    public static String VERSION_KEY = "version";
    public static String TIMESTAMP_KEY = "timestamp";
    public static String SIGN_KEY = "sign";
    public static String GRANT_TYPE_KEY = "grant_type";
    public static String APPID_KEY = "appid";

    //token.create 接口不存在此参数
    public static String ACCESS_KEY = "access_token";

    public static String VERSION = "2025.06.13";

    public static String USER_AGENT = "GatOpenSdk/" + VERSION + " " + System.getProperty("java.version");
}
