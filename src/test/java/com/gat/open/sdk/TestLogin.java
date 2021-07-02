/*
 * Copyright 2007-2021, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

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
 * date 2017/12/25 10:11
 */
public class TestLogin extends TestCase {

    private GATOpen gatOpen;

    protected void setUp() {
//        gatOpen = new GATOpen("您的APPID", "您的密钥", "https://openapi.guanaitong.tech");
    }

    public void testLogin() throws UnsupportedEncodingException {
        // 获取授权码
        // 工号需要确实存在
        ApiResponse<String> result = gatOpen.loginByCorpCode("aC66");
        System.out.println(result);
        Assert.assertNotNull(result);

        // 拼接URL跳转页面
        // 重定向的关爱通URL,如果是PC端员工首页,该字段不用填写
        String redirectUrl = "https://mobile.guanaitong.tech/index.php?wxA=Enterprise.home";

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

    public void testSyncUserAndGetAuthCode() {

        ApiResponse<String> result = gatOpen.syncUserAndGetAuthCode("HB533",
                null,
                null,
                "13818252513",
                "孙长浩",
                1);

        System.out.println(result);
        Assert.assertNotNull(result);

//        // 拼接URL跳转页面
//        // 重定向的关爱通URL,如果是PC端员工首页,该字段不用填写
        String redirectUrl = "https://m.igeidao.com/home/index";
        Map<String, Object> params = new HashMap<>(5);
        params.put("access_token", GATTokenService.getGatToken());
        params.put("auth_code", result.getData());
        params.put("timestamp", System.currentTimeMillis() / 1000);
        params.put("redirect_url", redirectUrl);
        params.put("sign", SignUtil.sign(params));
        params.remove("appsecret");

        String url;
        try {
            url = GatUrlUtil.build(params);
            System.out.println(url);
            Assert.assertNotNull(url);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }



}
