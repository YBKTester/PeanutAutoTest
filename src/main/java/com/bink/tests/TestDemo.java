package com.bink.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static com.bink.common.UrlCommon.BAIDU_URL;
import static com.bink.utils.RestUtils.postPrint;
import static io.restassured.RestAssured.*;

/**
 * 测试类
 *
 * @author Bink
 * @date 2020/6/16
 */
public class TestDemo {

    String apiPath = "posts/3";
    private final String cookie = "";
    private final Map<String, Object> paramsMap = new HashMap<>();


    @BeforeClass
    public void setUp() {
        System.out.println("测试准备。。。");
    }

    /**
     * 简单检查响应状态码
     */
    @Test
    public void testOne() {
        postPrint(BAIDU_URL, cookie, paramsMap);
    }
}












