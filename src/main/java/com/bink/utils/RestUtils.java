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
    public static void postPrintByJson(String url, String cookie, Map<String, Object> paramsMap) {
        Response response = given().
                contentType(ContentType.JSON).
                cookie(cookie).
                log().all().
                params(paramsMap).
                post(url);
        response.prettyPrint();
    }

    public static void postPrintByJson(String url, String cookieName, String cookieValue, Map<String, Object> paramsMap) {
        Response response = given().
                contentType(ContentType.JSON).
                cookie(cookieName, cookieValue).
                log().all().
                params(paramsMap).
                post(url);
        response.prettyPrint();
    }

    /**
     * Post打印调试方法
     *
     * @param url       请求地址
     * @param cookie    cookie
     * @param paramsMap 请求参数
     */
    public static void postPrintByURLENC(String url, String cookie, Map<String, Object> paramsMap) {
        Response response = given().
                contentType(ContentType.URLENC).
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

    /**
     * 获取响应体返回值
     *
     * @param url       请求地址
     * @param cookie    cookie
     * @param paramsMap 请求参数
     * @param jsonPath  目标路径JsonPath表达式
     * @return 返回所需值
     */
    public static String getValueByPath(String url, String cookie, Map<String, Object> paramsMap, String jsonPath) {
        String value = given().
                cookie(cookie).
                params(paramsMap).log().all().
                post(url).
                body().
                path(jsonPath).
                toString();
        System.out.println("所需返回值为：" + value);
        return value;
    }

    /**
     * 获取响应体返回值[登陆专用]
     * 无需Cookie
     *
     * @param url       请求地址
     * @param paramsMap 请求参数
     * @param jsonPath  目标路径JsonPath表达式
     * @return 返回所需值
     */
    public static String getValueByPath(String url, Map<String, Object> paramsMap, String jsonPath) {
        String value = given().
                params(paramsMap).
                post(url).
                body().
                path(jsonPath).
                toString();
        System.out.println("所需返回值为：" + value);
        return value;
    }
}
