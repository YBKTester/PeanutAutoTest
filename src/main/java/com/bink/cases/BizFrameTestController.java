package com.bink.cases;

import com.bink.base.TestBase;
import org.testng.annotations.Test;

import static com.bink.common.ApiPathCommon.GET_CURR_USER_INFO;
import static com.bink.common.RequestCommon.COOKIE_NAME;
import static com.bink.utils.RestUtils.postPrintByJson;

/**
 * 测试运行
 * @author Bink
 * @date 2020/6/18
 */
public class BizFrameTestController extends TestBase {

    @Test
    public void getCurrUserInfoTest() {
        postPrintByJson(GET_CURR_USER_INFO, COOKIE_NAME, token, paramsMap);
    }


}
