/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.http;

import com.gat.open.sdk.util.JSON;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by August.Zhou on 2022/6/27 10:33
 */
public class HttpClientTest {

    @Test
    public void doGet() throws IOException {
        HttpClient httpClient = new HttpClient();
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.setMethod("GET");
        httpRequest.setUrl("https://httpbin.org/get?h1=1&h2=2");
        HttpResponse httpResponse = httpClient.doReq(httpRequest);
        assertEquals(200, httpResponse.getCode());
        System.out.println(new String(httpResponse.getBody()));
        HttpBinResp httpBinResp = JSON.parse(httpResponse.getBody(), HttpBinResp.class);
        assertEquals(httpBinResp.getArgs().get("h1"), "1");
        assertEquals(httpBinResp.getArgs().get("h2"), "2");
    }


    @Test
    public void doPostForm() throws IOException {
        HttpClient httpClient = new HttpClient();
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.setMethod("POST");
        httpRequest.setUrl("https://httpbin.org/post?h1=1&h2=2");
        httpRequest.setContentType("application/x-www-form-urlencoded");
        httpRequest.setBody("a=123&b=456");
        HttpResponse httpResponse = httpClient.doReq(httpRequest);
        assertEquals(200, httpResponse.getCode());
        System.out.println(new String(httpResponse.getBody()));
        HttpBinResp httpBinResp = JSON.parse(httpResponse.getBody(), HttpBinResp.class);
        assertEquals(httpBinResp.getUrl(), "https://httpbin.org/post?h1=1&h2=2");
        assertEquals(httpBinResp.getArgs().get("h1"), "1");
        assertEquals(httpBinResp.getArgs().get("h2"), "2");
        assertEquals(httpBinResp.getForm().get("a"), "123");
        assertEquals(httpBinResp.getForm().get("b"), "456");
    }

    @Test
    public void doPostJson() throws IOException {
        HttpClient httpClient = new HttpClient();
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.setMethod("POST");
        httpRequest.setUrl("https://httpbin.org/post?h1=1&h2=2");
        httpRequest.setContentType("application/json");
        httpRequest.setBody("{\n" + "\t\"a\": 1,\n" + "\t\"b\": \"2\",\n" + "\t\"c\": [\"xxx\"]\n" + "}");
        HttpResponse httpResponse = httpClient.doReq(httpRequest);
        assertEquals(200, httpResponse.getCode());
        System.out.println(new String(httpResponse.getBody()));
        HttpBinResp httpBinResp = JSON.parse(httpResponse.getBody(), HttpBinResp.class);
        assertEquals(httpBinResp.getUrl(), "https://httpbin.org/post?h1=1&h2=2");
        assertEquals(httpBinResp.getArgs().get("h1"), "1");
        assertEquals(httpBinResp.getArgs().get("h2"), "2");
        assertEquals(httpBinResp.getJson().get("a"), 1);
        assertEquals(httpBinResp.getJson().get("b"), "2");
        assertTrue(httpBinResp.getJson().containsKey("c"));
    }

}