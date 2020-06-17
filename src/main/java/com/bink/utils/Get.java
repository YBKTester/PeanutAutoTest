package com.bink.utils;

import io.restassured.http.ContentType;

import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * Get请求
 *
 * @author Bink
 * @date 2020/6/17
 */
public class Get implements Request {
    /**
     * 发起Get请求
     *
     * @param cookie   请求Cookie
     * @param url      请求地址
     * @param parasMap 请求参数
     */
    @Override
    public void request(String cookie, String url, Map<String, Object> parasMap) {
        given().
                contentType(ContentType.JSON).
                cookie(cookie).
                params(parasMap).
                log().all().
                get(url);
    }
}
