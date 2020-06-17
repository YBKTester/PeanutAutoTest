package com.bink.cases;

import com.bink.base.TestBase;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

/**
 * 测试
 *
 * @author Bink
 * @date 2020/6/17
 */
public class TestBink extends TestBase {
    @Test
    public void test() {
        logger.info("测试中");
        logger.info(RestAssured.basePath);
        logger.info(RestAssured.baseURI);
    }
}
