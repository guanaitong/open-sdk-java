package com.gat.open.sdk.constant;


import com.gat.open.sdk.util.ParamValidator;

/**
 * 常量
 *
 * @author xin.hua
 * @date 2017/7/18
 */
public class GATOpenConstant {

    private GATOpenConstant() {
        // hide constructor
    }

    public static final String MOBILE_REGEX = "^1\\d{10}$";
    public static final String EMAIL_REGEX = "^([a-zA-Z0-9]+[_|\\.|\\-]*)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\\.|\\-]?)*[a-zA-Z0-9]+((\\.[a-zA-Z]{2,5}){1,2})$";

    private static String appId = "";
    private static String appSecret = "";
    private static String baseUrl = "https://openapi.guanaitong.com";
    private static String loginRequestUrl = baseUrl + "/sso/employee/login";

    public static void init(String appId, String appSecret) {
        ParamValidator.requireNonEmpty(appId, "appid 不可为空");
        ParamValidator.requireNonEmpty(appSecret, "appsecret 不可为空");
        GATOpenConstant.appId = appId;
        GATOpenConstant.appSecret = appSecret;
    }

    public static void init(String appId, String appSecret, String baseUrl) {
        ParamValidator.requireNonEmpty(appId, "appid 不可为空");
        ParamValidator.requireNonEmpty(appSecret, "appsecret 不可为空");
        ParamValidator.requireNonEmpty(baseUrl, "base_url 不可为空");
        GATOpenConstant.appId = appId;
        GATOpenConstant.appSecret = appSecret;
        GATOpenConstant.baseUrl = baseUrl;
        GATOpenConstant.loginRequestUrl = baseUrl + "/sso/employee/login";
    }

    public static String getAppId() {
        return appId;
    }

    public static String getAppSecret() {
        return appSecret;
    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static String getLoginRequestUrl(){
        return loginRequestUrl;
    }

}
