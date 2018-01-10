package com.ciicgat.open.sdk.util;

import java.lang.reflect.Proxy;

/**
 * 代理工厂类
 *
 * @author xin.hua
 * @date 2017/7/19
 */
public class ProxyFactory {


    /**
     * 获取 retrofitApi 实现类的动态代理
     * 实现参数校验
     * @param <T> retrofitApi
     * @return
     */
    @SuppressWarnings("unchecked")
    public static  <T> T getProxy(T retrofitApi){
        return (T) Proxy.newProxyInstance(retrofitApi.getClass().getClassLoader(),
                retrofitApi.getClass().getInterfaces(),new RetrofitInvocationHandler(retrofitApi));
    }


}
