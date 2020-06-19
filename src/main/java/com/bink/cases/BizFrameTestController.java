package com.bink.cases;

import com.bink.base.RequestParams;
import com.bink.base.TestBase;
import com.bink.utils.Request;
import com.bink.utils.RequestFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.bink.common.ApiPathCommon.*;
import static com.bink.common.RequestCommon.COOKIE_NAME;
import static com.bink.utils.RestUtils.postPrintByJson;

/**
 * 测试运行
 *
 * @author Bink
 * @date 2020/6/18
 */
public class BizFrameTestController extends TestBase {


    String requestMethod;
    //        postPrintByJson(GET_CURR_USER_INFO, COOKIE_NAME, token, paramsMap);

    @DataProvider(name = "test")
    public Object[][] getInfo() {
        RequestParams requestParams = new RequestParams();
        requestParams.setCookieName(COOKIE_NAME);
        requestParams.setCookieValue(token);
        requestParams.setExceptedValue("系统管理员");
        requestParams.setJsonPath("userInfo.userName");
        requestParams.setParasMap(paramsMap);
        requestParams.setUrl(GET_CURR_USER_INFO);
        requestMethod = getValue("test", "method");

        return new Object[][]{
                {requestMethod, requestParams}
        };
    }

    /**
     * 测试获取当前用户信息
     *
     * @param requestMethod 请求方式
     * @param requestParams 请求参数
     * @throws Exception 异常类
     */
    @Test(dataProvider = "test")
    public void getCurrUserInfoTest(String requestMethod, RequestParams requestParams) throws Exception {
        Request request = RequestFactory.getRequestMethod(requestMethod);
        request.requestEqual(requestParams);
        paramsMap.clear();
    }


    @Test
    public void Test() throws Exception {

    }

    @DataProvider(name = "getProvince")
    public Object[][] getProvince() {
        RequestParams requestParams = new RequestParams(COOKIE_NAME, token, GET_PROVINCE, paramsMap, "total", 29);
        requestMethod = getValue("test", "method");

        return new Object[][]{
                {requestMethod, requestParams}
        };
    }

    /**
     * 获取省份列表
     *
     * @param requestMethod 请求方式
     * @param requestParams 请求参数
     * @throws Exception 异常类
     */
    @Test(dataProvider = "getProvince")
    public void getProvinceTest(String requestMethod, RequestParams requestParams) throws Exception {
        Request request = RequestFactory.getRequestMethod(requestMethod);
        request.requestEqual(requestParams);
    }

    @DataProvider(name = "getGantryInfoList")
    public Object[][] getGantryInfoList() {
        RequestParams requestParams =
                new RequestParams(COOKIE_NAME, token, GET_GANTRY_INFO_LIST, paramsMap, "return_code", "200");
        requestMethod = getValue("test", "method");

        return new Object[][]{
                {requestMethod, requestParams}
        };
    }

    /**
     * 获取省份列表
     *
     * @param requestMethod 请求方式
     * @param requestParams 请求参数
     * @throws Exception 异常类
     */
    @Test(dataProvider = "getGantryInfoList")
    public void getGantryInfoListTest(String requestMethod, RequestParams requestParams) throws Exception {
        Request request = RequestFactory.getRequestMethod(requestMethod);
        request.requestEqual(requestParams);
    }


}
