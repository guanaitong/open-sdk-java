package com.gat.open.sdk;

import com.gat.open.sdk.model.ApiResponse;
import com.gat.open.sdk.service.GATTokenService;
import com.gat.open.sdk.util.SignUtil;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Stanley Shen
 * @version 1.0.0
 * @date 2017/12/25 10:11
 */
public class Test {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // 这个appid和appsecret是一个测试应用的示例,要根据实际情况切换
        // gatOpen对象最好用单例,推荐用spring管理
        // 如果第三方公司用分布式部署项目,请事先通知关爱通相关技术
        GATOpen gatOpen = new GATOpen("20091181", "f915972094db1d42581eb805ca228b23", "https://openapi.guanaitong.com");


        ApiResponse<String> response = gatOpen.loginByCorpCode("013602");
        String authCode = response.getData();
        System.out.println("authCode = " + authCode);

        String loginUrl = "https://openapi.guanaitong.com/sso/employee/login";
        String accessToken = GATTokenService.getGatToken();
        Long timestamp = System.currentTimeMillis() / 1000;

        // 有则添加到url中无则不需要添加
        // url记得urlEncode
        String redirectUrl = "https://mobile.guanaitong.com/index.php?wxA=Enterprise.home";

        Map<String, Object> params = new HashMap<String, Object>(4);
        params.put("access_token", accessToken);
        params.put("auth_code", authCode);
        params.put("timestamp", timestamp);
        params.put("redirect_url", redirectUrl);
        params.put("sign", SignUtil.sign(params));
        params.remove("appsecret");

        String url = build(loginUrl, params);
        System.out.println(url);
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
                stringBuilder.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8")).append("");
                stringBuilder.append("&");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

}
