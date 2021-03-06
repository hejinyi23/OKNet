package ricky.oknet.utils;

import java.lang.reflect.Proxy;

import ricky.oknet.retrofit.ApiProxyHandler;


@SuppressWarnings("all")
public class ApiHelper {
    /**
     * @param c
     * @param callback 拦截json请求类的回调
     * @param <T>      Api接口类
     * @param <F>      如请求方式为Json时，需要拦截json请求类
     * @return
     */
    public static <T, F> T get(Class<T> c, ApiProxyHandler.ICustomerJsonBean<F>... callback) {
        return (T) Proxy.newProxyInstance(
                c.getClassLoader(),
                new Class[]{c},
                new ApiProxyHandler<F>(callback != null && callback.length > 0 ? callback[0] : null));
    }
}
