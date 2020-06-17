package com.bink.cases;


import com.bink.base.TestBase;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static com.bink.common.RequestCommon.STATUS_CODE_200;

/**
 * @author Bink
 * @date 2020/6/17
 */
public class ListUsersTest extends TestBase {
    @Test
    public void test01ListUsers() {
        logger.info(RestAssured.basePath);
        logger.info(RestAssured.baseURI);
        res = req.get("/users?page=2");
        jp = getJsonPath(res);
        testUtils.checkStatusCode(res, STATUS_CODE_200);
        testUtils.printAllResponseText(res);
    }

}

