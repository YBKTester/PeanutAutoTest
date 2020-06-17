package com.bink.tests;

import com.bink.utils.Request;
import com.bink.utils.RequestFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

import static com.bink.common.UrlCommon.BAIDU_URL;

/**
 * 测试工厂类
 *
 * @author Bink
 * @date 2020/6/17
 */
public class TestMain {
    public static void main(String[] args) throws Exception {
        String resourceFile = "test";
        ResourceBundle rb = ResourceBundle.getBundle(resourceFile);
        System.out.println(rb.getString("URL"));
        String url = rb.getString("URL");
        String cookie = rb.getString("cookie");

        Map<String, Object> paramsMap = new HashMap<>();
        paramsMap.put("user", rb.getString("user"));
        paramsMap.put("password", rb.getString("password"));
        System.out.println(paramsMap.values());

        String requestMethod = rb.getString("method");
        Request request = RequestFactory.getRequestMethod(requestMethod);

        request.request(cookie, url, paramsMap);



    }

}
