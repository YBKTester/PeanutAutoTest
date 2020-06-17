package com.bink.cases;


import java.util.HashMap;

import com.bink.base.TestBase;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static com.bink.common.RequestCommon.STATUS_CODE_201;


/**
 * @author Bink
 * @date 2020/6/17
 */
public class CreateTest extends TestBase {

    @Test
    public void test01Create() {
        logger.info("BaseURI: " + RestAssured.baseURI);
        logger.info("BasePath: " + RestAssured.basePath);

        res = req.param("name", "anthony@163.com")
                .param("job", "tester")
                .header("Content-Type", "text/html")
                .when().post("/api/users");
        testUtils.checkStatusCode(res, STATUS_CODE_201);
        testUtils.printResponseBody(res);
    }

    @Test
    public void test02Create() {
        logger.info("BaseURI: " + RestAssured.baseURI);
        logger.info("BasePath: " + RestAssured.basePath);
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "anthony12@126.com");
        map.put("job", "dev");
        res = req.formParams(map)
                .header("Content-Type", "text/html")
                .when().post("/users");
        testUtils.checkStatusCode(res, 201);
        testUtils.printResponseBody(res);

    }

}
