package com.bink.utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * 工具类
 *
 * @author Bink
 * @date 2020/6/16
 */
public class RestUtils {

    /**
     * Post打印调试方法
     *
     * @param url       请求地址
     * @param cookie    cookie
     * @param paramsMap 请求参数
     */
    public static void postPrint(String url, String cookie, Map<String, Object> paramsMap) {
        Response response = given().
                contentType(ContentType.JSON).
                cookie(cookie).
                log().all().
                params(paramsMap).
                post(url);
        response.prettyPrint();
    }

    /**
     * Get打印调试方法
     *
     * @param url       请求地址
     * @param cookie    cookie
     * @param paramsMap 请求参数
     */
    public static void getPrint(String url, String cookie, Map<String, Object> paramsMap) {
        Response response = given().contentType(ContentType.JSON).cookie(cookie).log().all().params(paramsMap).get(url);
        response.prettyPrint();
    }
}
