package com.ciicgat.open.sdk.constant;


import com.ciicgat.open.sdk.util.ParamValidator;

/**
 * 常量
 * Created by xin.hua on 2017/7/18.
 */
public class GATOpenConstant {

    public static final String MOBILE_REGEX = "^1(3|4|5|7|8)[0-9]\\d{8}$";
    public static final String EMAIL_REGEX = "^([a-zA-Z0-9]+[_|\\.|\\-]*)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\\.|\\-]?)*[a-zA-Z0-9]+((\\.[a-zA-Z]{2,5}){1,2})$";

    public static String appId = "";
    public static String appSecret = "";
    public static String base_url = "https://openapi.guanaitong.com";


    public static void init(String appId, String appSecret) {
        ParamValidator.requireNonEmpty(appId, "appid 不可为空");
        ParamValidator.requireNonEmpty(appSecret, "appsecret 不可为空");

        GATOpenConstant.appId = appId;
        GATOpenConstant.appSecret = appSecret;
    }

    public static void init(String appId, String appSecret, String base_url) {
        ParamValidator.requireNonEmpty(appId, "appid 不可为空");
        ParamValidator.requireNonEmpty(appSecret, "appsecret 不可为空");
        ParamValidator.requireNonEmpty(base_url, "base_url 不可为空");

        GATOpenConstant.appId = appId;
        GATOpenConstant.appSecret = appSecret;
        GATOpenConstant.base_url = base_url;
    }
}
