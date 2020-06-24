package com.bink.utils;

import com.bink.base.RequestParams;
import io.restassured.http.ContentType;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Post请求
 *
 * @author Bink
 * @date 2020/6/17
 */
public class Post implements Request {


    /**
     * 发起Post请求
     *
     * @param params 请求参数
     */
    @Override
    public void requestEqual(RequestParams params,ContentType contentType) {
        given().
                contentType(contentType).
                cookie(params.getCookieName(), params.getCookieValue()).
                params(params.getParasMap()).log().all().
                post(params.getUrl()).
                then().log().all().
                body(params.getJsonPath(), equalTo(params.getExceptedValue()));
    }
}
