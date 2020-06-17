package com.bink.utils;

/**
 * 请求工厂类
 *
 * @author Bink
 * @date 2020/6/17
 */
public class RequestFactory {
    public static Request getRequestMethod(String requestMethod) throws Exception {
        String classStr = "com.bink.utils." + requestMethod;
        Class<?> cla = Class.forName(classStr);
        Object object = cla.newInstance();
        return (Request) object;
    }
}
