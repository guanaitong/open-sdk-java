/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.exception.OpenSdkException;
import com.gat.open.sdk.model.enums.OpenSignType;
import com.gat.open.sdk.seller.client.SellerTestOpenClient;
import com.gat.open.sdk.seller.model.request.BindNotifyRequest;
import com.gat.open.sdk.seller.model.request.PersonAssetsRequest;
import com.gat.open.sdk.seller.model.request.PersonDetailRequest;
import com.gat.open.sdk.seller.model.request.SellerLoginAuthRequest;
import com.gat.open.sdk.seller.model.response.BindNotifyRes;
import com.gat.open.sdk.seller.model.response.PersonAssetsResponse;
import com.gat.open.sdk.seller.model.response.PersonDetailResponse;
import com.gat.open.sdk.seller.model.response.SellerLoginAuthResponse;
import com.gat.open.sdk.util.AESCrypt;
import com.gat.open.sdk.util.JSON;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static com.gat.open.sdk.util.Constants.JSON_BODY_KEY;

public class SellerLoginApiTest {
//        private SellerOpenClient openClient = new SellerOpenClient("http://127.0.0.1:19090", "http://127.0.0.1:18888", "", "");
    private SellerTestOpenClient sellerTestOpenClient = new SellerTestOpenClient("https://openapi.guanaitong.tech", "http://127.0.0.1:18888", "", "");
//    private OpenClient openClient = new OpenClient("https://openapi.guanaitong.tech", "", "");


    @Test
    public void auth() {

        SellerLoginAuthRequest sellerLoginAuthRequest = new SellerLoginAuthRequest();
        sellerLoginAuthRequest.setAuthCode("11111");
        SellerLoginAuthResponse authCode = sellerTestOpenClient.sellerLoginApi().getByAuthCode(sellerLoginAuthRequest);
        System.out.println(JSON.toJSONString(authCode));
    }

    @Test
    public void detail() {

        PersonDetailRequest personDetailRequest = new PersonDetailRequest();
        personDetailRequest.setOpenId("52f838b668524ffb06cd6fce95b91632");
        PersonDetailResponse detail = sellerTestOpenClient.sellerLoginApi().getDetailByOpenId(personDetailRequest);
        System.out.println(JSON.toJSONString(detail));
    }

    @Test
    public void assets() {

        PersonAssetsRequest personAssetsRequest = new PersonAssetsRequest();
        personAssetsRequest.setOpenId("52f838b668524ffb06cd6fce95b91632");
        PersonAssetsResponse personAssets = sellerTestOpenClient.sellerLoginApi().getPersonAssets(personAssetsRequest);
        System.out.println(JSON.toJSONString(personAssets));
    }

    @Test
    public void bindNotify() {
        BindNotifyRequest bindNotifyRequest = new BindNotifyRequest();
        bindNotifyRequest.setOpenId("52f838b668524ffb06cd6fce95b91632");
        bindNotifyRequest.setThirdUserId("12345");
        bindNotifyRequest.setBindTime("2025-05-27 12:00:00");
        BindNotifyRes bindNotifyRes = sellerTestOpenClient.sellerLoginApi().bindNotify(bindNotifyRequest);
        System.out.println(JSON.toJSONString(bindNotifyRes));
    }

    @Test
    public void testAuth() {
        String mobile = "13564307640";
        Long thirdUserId = 1L;

        String eMobile = AESCrypt.encode("", mobile);
        String eThirdUserId = AESCrypt.encode("", thirdUserId + "");
        String loadingUrl = "https://www.test.com?1=1";

        Map<String, String> params = new HashMap<>();
        params.put("mobile", eMobile);
        params.put("thirdUserId", eThirdUserId);
        params.put("loadingUrl", loadingUrl);

        Map<String, String> commonParams = new HashMap<>();
        commonParams.put("appid", "15004367");
        commonParams.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        commonParams.put("version", "1.0.0");
        commonParams.put("access_token", "");
        String sign = sign(commonParams, params, OpenSignType.SHA256);
        commonParams.put("sign", sign);

        commonParams.putAll(params);

        String s = buildUrl("/seller/person/elm/auth", false, commonParams);
        System.out.println(s);
    }

    public String sign(Map<String, String> commonParams, Map<String, String> params, OpenSignType signType) {
        TreeMap<String, String> toSignMaps = new TreeMap<>(params);
        toSignMaps.put("appsecret", "");
        toSignMaps.putAll(commonParams);
        toSignMaps.remove("sign");
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : toSignMaps.entrySet()) {
            String textKey = entry.getKey();
            String textValue = entry.getValue();
            stringBuilder.append(textKey);
            stringBuilder.append("=");
            stringBuilder.append(textValue);
            stringBuilder.append("&");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        if (signType == null || OpenSignType.SHA1 == signType) {
            return DigestUtils.sha1Hex(stringBuilder.toString());
        } else if (OpenSignType.SHA256 == signType) {
            return DigestUtils.sha256Hex(stringBuilder.toString());
        } else if (OpenSignType.SHA512 == signType) {
            return DigestUtils.sha512Hex(stringBuilder.toString());
        } else {
            throw new OpenSdkException("not support sign type");
        }
    }


    public String buildUrl(String path, boolean useBase, Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(useBase ? "https://openapi.guanaitong.tech" : "http://127.0.0.1:18888");
        stringBuilder.append(path);
        if (!params.isEmpty()) {
            stringBuilder.append("?");
            stringBuilder.append(buildQuery(params));
        }
        return stringBuilder.toString();
    }

    public String buildQuery(Map<String, String> params) {
        if (params.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (JSON_BODY_KEY.equals(key)) {
                    continue;
                }
                stringBuilder.append(entry.getKey());
                stringBuilder.append("=");
                stringBuilder.append(URLEncoder.encode(value, "UTF-8"));
                stringBuilder.append("&");
            }
        } catch (UnsupportedEncodingException e) {
            throw new OpenSdkException(e);
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
