/*
 * Copyright 2007-2021, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.util;


import com.gat.open.sdk.service.GATTokenService;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * retrofit 拦截器
 *
 * @author xin.hua
 * @date 2017/7/20
 */
public class RetrofitInterceptor implements Interceptor {

    private static final String TIMESTAMP = "timestamp";
    private static final String ACCESS_TOKEN = "access_token";
    private static final String POST = "POST";
    private static final String GET = "GET";

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        MediaType formContentType = MediaType.parse("application/x-www-form-urlencoded");
        if (POST.equalsIgnoreCase(request.method()) && formContentType != null && formContentType.equals(request.body().contentType())) {
            FormBody formBody = (FormBody) request.body();
            FormBody.Builder newBuilder = new FormBody.Builder();

            Map<String, Object> paramMap = new HashMap<>(5);
            for (int i = 0; i < formBody.size(); i++) {
                newBuilder.add(formBody.name(i), formBody.value(i));
                paramMap.put(formBody.name(i), formBody.value(i));
            }

            long timestamp = System.currentTimeMillis() / 1000;
            paramMap.put(TIMESTAMP, timestamp + "");


            if (!request.url().toString().contains("token")) {
                String token = GATTokenService.getGatToken();
                paramMap.put(ACCESS_TOKEN, token);
                newBuilder.add(ACCESS_TOKEN, token);
            }

            formBody = newBuilder
                    .add(TIMESTAMP, timestamp + "")
                    .add("sign", SignUtil.sign(paramMap))
                    .build();

            request = request.newBuilder().post(formBody).build();
        }

        if (GET.equalsIgnoreCase(request.method())) {
            Map<String, Object> params = new HashMap<>(5);
            for (int i = 0; i < request.url().querySize(); i++) {
                params.put(request.url().queryParameterName(i), request.url().queryParameterValue(i));
            }
            long timestamp = System.currentTimeMillis() / 1000;

            String token = GATTokenService.getGatToken();
            params.put(TIMESTAMP, timestamp + "");
            params.put(ACCESS_TOKEN, token);

            HttpUrl httpUrl = request.url().newBuilder()
                    .addQueryParameter(TIMESTAMP, timestamp + "")
                    .addQueryParameter(ACCESS_TOKEN, token)
                    .addQueryParameter("sign", SignUtil.sign(params))
                    .build();
            request = request.newBuilder().url(httpUrl).get().build();
        }

        return chain.proceed(request);
    }
}
