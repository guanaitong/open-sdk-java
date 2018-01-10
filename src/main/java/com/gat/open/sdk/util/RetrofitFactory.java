package com.gat.open.sdk.util;


import com.gat.open.sdk.constant.GATOpenConstant;
import com.gat.open.sdk.exception.GATException;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * retrofit 工厂类
 *
 * @author xin.hua
 * @date 2017/7/17
 */
public class RetrofitFactory {

    public static RetrofitFactory getInstance() {
        return Instance.retrofitFactory;
    }

    private OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder().addInterceptor(new RetrofitIntercepter());
    private Retrofit retrofit;

    private Map<Class<?>, Object> apiMap = new HashMap<Class<?>, Object>();

    private RetrofitFactory() {
        okHttpBuilder.connectTimeout(8, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS);
        init();
    }

    private void init() {
        retrofit = new Retrofit.Builder()
                .baseUrl(GATOpenConstant.base_url)
                .client(okHttpBuilder.build())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    /**
     * 获取api接口，TokenApi等
     *
     * @param apiClazz
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T> T getApi(Class<T> apiClazz) {
        if (apiClazz == null) {
            throw new GATException("apiClass 不可为null");
        }
        T api = (T) apiMap.get(apiClazz);
        if (api == null) {
            api = ProxyFactory.getProxy(retrofit.create(apiClazz));
            apiMap.put(apiClazz, api);
        }
        return api;
    }

    /**
     * @param connectTimeOut :s
     * @param readTimeOut    :s
     * @param writeTimeOut   :s
     * @return
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
        private static final RetrofitFactory retrofitFactory = new RetrofitFactory();
    }
}
