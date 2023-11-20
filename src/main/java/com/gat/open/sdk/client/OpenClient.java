/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import static com.gat.open.sdk.util.Constants.JSON_BODY_KEY;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import org.apache.commons.codec.digest.DigestUtils;

import com.gat.open.sdk.exception.OpenSdkException;
import com.gat.open.sdk.http.HttpClient;
import com.gat.open.sdk.http.HttpMessageConverter;
import com.gat.open.sdk.http.HttpRequest;
import com.gat.open.sdk.http.HttpResponse;
import com.gat.open.sdk.http.JacksonHttpMessageConverter;
import com.gat.open.sdk.model.ApiRequest;
import com.gat.open.sdk.model.ApiResponse;
import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;
import com.gat.open.sdk.model.JsonArrayRequest;
import com.gat.open.sdk.model.JsonRequest;
import com.gat.open.sdk.model.token.Token;
import com.gat.open.sdk.model.token.TokenCreateRequest;
import com.gat.open.sdk.model.token.TokenCreateResp;
import com.gat.open.sdk.seller.client.SellerPayApi;
import com.gat.open.sdk.seller.client.SellerTradeOrderApi;

/**
 * Created by August.Zhou on 2022/6/27 12:27
 */
public class OpenClient {

    private final String               baseUrl;
    private final String               appId;
    private final String               appSecret;

    private final HttpClient           httpClient;

    private final HttpMessageConverter httpMessageConverter;

    private volatile Token             token;

    /**
     * @param baseUrl
     * @param appId
     * @param appSecret
     */
    public OpenClient(String baseUrl, String appId, String appSecret) {
        this(baseUrl, appId, appSecret, new JacksonHttpMessageConverter());
    }

    /**
     * @param baseUrl
     * @param appId
     * @param appSecret
     */
    public OpenClient(String baseUrl, String appId, String appSecret, HttpMessageConverter httpMessageConverter) {
        this.baseUrl = Objects.requireNonNull(baseUrl);
        this.appId = Objects.requireNonNull(appId);
        this.appSecret = Objects.requireNonNull(appSecret);
        this.httpClient = new HttpClient();
        this.httpMessageConverter = httpMessageConverter;
    }

    /**
     * 设置网络连接读取超时时间。单位毫秒
     *
     * @param connectTimeOut
     * @param readTimeout
     */
    public OpenClient timeout(int connectTimeOut, int readTimeout) {
        this.httpClient.config(connectTimeOut, readTimeout);
        return this;
    }

    public EmployeeApi employeeApi() {
        return new EmployeeApi(this);
    }

    public LoginApi loginApi() {
        return new LoginApi(this);
    }

    public DepartmentApi departmentApi() {
        return new DepartmentApi(this);
    }

    public AssetsApi assetsApi() {
        return new AssetsApi(this);
    }

    public ActivityApi activityApi() {
        return new ActivityApi(this);
    }

    public AccountApi accountApi() {
        return new AccountApi(this);
    }

    public InvoiceApi invoiceApi() {
        return new InvoiceApi(this);
    }

    public ConsumeApi tradeApi() {
        return new ConsumeApi(this);
    }

    public ExpenseApi expenseApi() {
        return new ExpenseApi(this);
    }

    public SellerPayApi sellerPayApi() {
        return new SellerPayApi(this);
    }

    public SellerTradeOrderApi sellerTradeOrderApi() {
        return new SellerTradeOrderApi(this);
    }

    private Token getToken() {
        if (token == null || token.needRefresh()) {
            synchronized (this) {
                if (token == null || token.needRefresh()) {
                    try {
                        token = new Token(createToken());
                    } catch (RuntimeException e) {
                        if (token == null || token.isExpired()) {
                            throw e;
                        }
                    }
                }
            }
        }
        return token;
    }

    public <T> T postFormWithAuth(String path, FormRequest<T> apiRequest) {
        return request(true, path, apiRequest);
    }

    public <T> T postJsonWithAuth(String path, JsonRequest<T> apiRequest) {
        return request(true, path, apiRequest);
    }

    public <T> T postJsonWithAuth(String path, JsonArrayRequest<T> apiRequest) {
        return request(true, path, apiRequest);
    }

    private TokenCreateResp createToken() {
        return request(false, "/token/create", new TokenCreateRequest());
    }

    private void refreshToken() {
        token = null;
        token = getToken();
    }

    public <T> T request(boolean auth, String path, ApiRequest<T> apiRequest) {
        return request0(auth, path, apiRequest);
    }

    private <T> T request0(boolean auth, String path, ApiRequest<T> apiRequest) {
        Map<String, String> commonParams = new HashMap<>();
        commonParams.put("appid", this.appId);
        commonParams.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        commonParams.put("version", "1.0.0");
        if (auth) {
            commonParams.put("access_token", this.getToken().getAccessToken());
        }

        Map<String, String> params = apiRequest.toRequestParams(httpMessageConverter);

        //implements EnterpriseCodeRequest 代表queryString参数，JsonRequest和 不建议实现
        if (apiRequest instanceof EnterpriseCodeRequest) {
            String enterpriseCode = ((EnterpriseCodeRequest) apiRequest).getEnterpriseCode();
            //避免form和queryString重复设置
            if (!params.containsKey("enterprise_code") && !params.containsKey("enterpriseCode")
                    && Objects.nonNull(enterpriseCode)) {
                commonParams.put("enterprise_code", enterpriseCode);
            }
        }

        String sign = sign(commonParams, params);
        commonParams.put("sign", sign);
        HttpRequest httpRequest = new HttpRequest();
        httpRequest.setMethod("POST");
        httpRequest.setUrl(buildUrl(path, commonParams));
        if (apiRequest instanceof FormRequest) {
            httpRequest.setContentType("application/x-www-form-urlencoded");
            httpRequest.setBody(buildQuery(params));
        } else {
            httpRequest.setContentType("application/json");
            String body = params.get(JSON_BODY_KEY);
            httpRequest.setBody(body);
        }
        HttpResponse httpResponse = httpClient.doReq(httpRequest);
        if (httpResponse.getCode() != 200) {
            throw new OpenSdkException("status_code is " + httpResponse.getCode());
        }
        Type type = ((ParameterizedType) apiRequest.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        ApiResponse<T> apiResponse = httpMessageConverter.read(httpResponse.getBody(), type);
        if (apiResponse.getCode() == 0) {
            return apiResponse.getData();
        } else if (apiResponse.getCode() == 1000210004) {
            //如果HTTP请求后，token 已失效，默认清空，重新生成新的token
            refreshToken();
            return request0(auth, path, apiRequest);
        }

        throw new OpenSdkException(apiResponse.getCode(), apiResponse.getMsg());
    }

    private String sign(Map<String, String> commonParams, Map<String, String> params) {
        TreeMap<String, String> toSignMaps = new TreeMap<>(params);
        toSignMaps.put("appsecret", this.appSecret);
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
        return DigestUtils.sha1Hex(stringBuilder.toString());
    }

    public String buildUrl(String path, Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.baseUrl);
        stringBuilder.append(path);
        if (!params.isEmpty()) {
            stringBuilder.append("?");
            stringBuilder.append(buildQuery(params));
        }
        return stringBuilder.toString();
    }

    private String buildQuery(Map<String, String> params) {
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


    public HttpMessageConverter getHttpMessageConverter() {
        return httpMessageConverter;
    }
}
