package com.gat.open.sdk.util;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gat.open.sdk.constant.GATOpenConstant;
import com.gat.open.sdk.exception.GATException;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * retrofit 工厂类
 *
 * @author xin.hua
 * @date 2017/7/17
 */
public class RetrofitFactory {

    public static RetrofitFactory getInstance() {
        return Instance.RETROFIT_FACTORY;
    }

    private OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder().addInterceptor(new RetrofitInterceptor());
    private Retrofit retrofit;

    private Map<Class<?>, Object> apiMap = new ConcurrentHashMap<>();

    private RetrofitFactory() {
        okHttpBuilder.connectTimeout(8, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .sslSocketFactory(SSL.sslSocketFactory, SSL.x509TrustManager)
                .hostnameVerifier(SSL.hostnameVerifier);
        init();
    }

    private void init() {
        retrofit = new Retrofit.Builder()
                .baseUrl(GATOpenConstant.getBaseUrl())
                .client(okHttpBuilder.build())
                .addConverterFactory(JacksonConverterFactory.create(new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)))
                .build();
    }

    /**
     * 获取api接口，TokenApi等
     *
     * @param apiClazz apiClazz
     * @param <T>      T
     * @return 代理类, 封装了http请求
     */
    @SuppressWarnings("unchecked")
    public <T> T getApi(Class<T> apiClazz) {
        if (apiClazz == null) {
            throw new GATException("apiClass 不可为null");
        }
        return (T) apiMap.computeIfAbsent(apiClazz, k -> ProxyFactory.getProxy(retrofit.create(apiClazz)));
    }

    /**
     * @param connectTimeOut s
     * @param readTimeOut    s
     * @param writeTimeOut   s
     * @param debugHttpLog   是否打印debug级别日志
     */
    public void config(long connectTimeOut, long readTimeOut, long writeTimeOut, boolean debugHttpLog) {
        okHttpBuilder.connectTimeout(connectTimeOut, TimeUnit.SECONDS)
                .readTimeout(readTimeOut, TimeUnit.SECONDS)
                .writeTimeout(writeTimeOut, TimeUnit.SECONDS);
        if (debugHttpLog) {
            okHttpBuilder.addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY));
        }

        init();

        for (Map.Entry<Class<?>, Object> apiEntry : apiMap.entrySet()) {
            apiEntry.setValue(ProxyFactory.getProxy(retrofit.create(apiEntry.getKey())));
        }
    }


    private static class Instance {
        private static final RetrofitFactory RETROFIT_FACTORY = new RetrofitFactory();
    }
}
