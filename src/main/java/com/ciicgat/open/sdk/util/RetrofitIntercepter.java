package com.ciicgat.open.sdk.util;


import com.ciicgat.open.sdk.service.GATTokenService;
import okhttp3.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * retrofit 拦截器
 * Created by xin.hua on 2017/7/20.
 */
public class RetrofitIntercepter implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        MediaType formContentType = MediaType.parse("application/x-www-form-urlencoded");
        if (request.method().equalsIgnoreCase("POST") && formContentType != null && formContentType.equals(request.body().contentType())) {
            FormBody formBody = (FormBody) request.body();
            FormBody.Builder newBuilder = new FormBody.Builder();

            Map<String, Object> paramMap = new HashMap<String, Object>();
            for (int i = 0; i < formBody.size(); i++) {
                newBuilder.add(formBody.name(i), formBody.value(i));
                paramMap.put(formBody.name(i), formBody.value(i));
            }

            long timestamp = System.currentTimeMillis() / 1000;
            paramMap.put("timestamp", timestamp + "");


            if (!request.url().toString().contains("token")) {
                String token = GATTokenService.getGatToken();
                paramMap.put("access_token", token);
                newBuilder.add("access_token", token);
            }

            formBody = newBuilder
                    .add("timestamp", timestamp + "")
                    .add("sign", SignUtil.sign(paramMap))
                    .build();

            request = request.newBuilder().post(formBody).build();
        }

        if (request.method().equalsIgnoreCase("GET")) {
            Map<String, Object> params = new HashMap<String, Object>();
            for (int i = 0; i < request.url().querySize(); i++) {
                params.put(request.url().queryParameterName(i), request.url().queryParameterValue(i));
            }
            long timestamp = System.currentTimeMillis() / 1000;

            String token = GATTokenService.getGatToken();
            params.put("timestamp", timestamp + "");
            params.put("access_token", token);

            HttpUrl httpUrl = request.url().newBuilder()
                    .addQueryParameter("timestamp", timestamp + "")
                    .addQueryParameter("access_token", token)
                    .addQueryParameter("sign", SignUtil.sign(params))
                    .build();
            request = request.newBuilder().url(httpUrl).get().build();
        }

        return chain.proceed(request);
    }
}
