package com.bink.utils;

import com.bink.base.RequestParams;
import io.restassured.http.ContentType;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

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
     * @param params 请求参数
     */
    @Override
    public void requestEqual(RequestParams params,ContentType contentType) {
        given().
                contentType(contentType).
                cookie(params.getCookieName(), params.getCookieValue()).
                params(params.getParasMap()).
                get(params.getUrl()).then().body(params.getJsonPath(), equalTo(params.getExceptedValue()));
    }
}
