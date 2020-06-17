package com.bink.cases;


import com.bink.base.TestBase;
import com.bink.utils.Request;
import com.bink.utils.RequestFactory;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.bink.common.UrlCommon.BAIDU_URL;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.bink.common.UrlCommon.TEST_URL;
import static com.bink.utils.RestUtils.getPrint;
import static com.bink.utils.RestUtils.postPrint;
import static io.restassured.RestAssured.given;

/**
 * 测试类
 *
 * @author Bink
 * @date 2020/6/16
 */
public class TestDemo extends TestBase {

    String apiPath = "posts/3";
    private final String cookie = "";
    private final Map<String, Object> paramsMap = new HashMap<>();


    /**
     * 简单检查响应状态码
     */
    @Test
    public void testOne() {
        String url = TEST_URL + apiPath;
        getPrint(url, cookie, paramsMap);
        given().
                contentType(ContentType.JSON).
                get(url).
                then().
                body("id", equalTo(3));
    }

    /**
     * 简单检查响应状态码
     */
    @Test
    public void testTwo() {
        String url = TEST_URL + apiPath;
        getPrint(url, cookie, paramsMap);
        given().
                contentType(ContentType.JSON).
                get(url).
                then().
                body("id", equalTo(3), "title", equalTo("ea molestias quasi exercitationem repellat qui ipsa sit aut"));
    }

    @Test
    public void testMethod() {

    }
}












