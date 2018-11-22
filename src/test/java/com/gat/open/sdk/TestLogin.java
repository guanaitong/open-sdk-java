package com.gat.open.sdk;

import com.gat.open.sdk.model.ApiResponse;
import com.gat.open.sdk.service.GATTokenService;
import com.gat.open.sdk.util.GatUrlUtil;
import com.gat.open.sdk.util.SignUtil;
import junit.framework.TestCase;
import org.junit.Assert;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Stanley Shen
 * @version 1.0.0
 * @date 2017/12/25 10:11
 */
public class TestLogin extends TestCase {

    private GATOpen gatOpen;

    protected void setUp() {
        gatOpen = new GATOpen("20110748", "2441c671a89a680bd6b548b59e82a1f4", "https://openapi.guanaitong.cc");
    }

    public void testLogin() throws UnsupportedEncodingException {
        // 获取授权码
        // 工号需要确实存在
        ApiResponse<String> result = gatOpen.loginByCorpCode("aC66");
        System.out.println(result);
        Assert.assertNotNull(result);

        // 拼接URL跳转页面
        // 重定向的关爱通URL,如果是PC端员工首页,该字段不用填写
        String redirectUrl = "https://mobile.guanaitong.cc/index.php?wxA=Enterprise.home";

        Map<String, Object> params = new HashMap<>(5);
        params.put("access_token", GATTokenService.getGatToken());
        params.put("auth_code", result.getData());
        params.put("timestamp", System.currentTimeMillis() / 1000);
        params.put("redirect_url", redirectUrl);
        params.put("sign", SignUtil.sign(params));
        params.remove("appsecret");

        String url = GatUrlUtil.build(params);
        System.out.println(url);
        Assert.assertNotNull(url);
    }

}
