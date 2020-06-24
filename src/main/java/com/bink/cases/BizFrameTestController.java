package com.bink.cases;

import com.bink.base.RequestParams;
import com.bink.base.TestBase;
import com.bink.utils.Request;
import com.bink.utils.RequestFactory;
import io.restassured.http.ContentType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.bink.common.ApiPathCommon.*;
import static com.bink.common.RequestCommon.COOKIE_NAME;
import static com.bink.utils.RestUtils.*;

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
        request.requestEqual(requestParams, ContentType.JSON);
        paramsMap.clear();
    }


    @Test
    public void Test()  {

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
        request.requestEqual(requestParams, ContentType.JSON);
    }

    @DataProvider(name = "getGantryInfoList")
    public Object[][] getGantryInfoList() {
//        RequestParams requestParams1 =
//                new RequestParams(COOKIE_NAME, token, GET_GANTRY_INFO_LIST, paramsMap, "return_code", "200");
        paramsMap.put("id", "G000111001000610010");
        paramsMap.put("provinceId", "11");
//        paramsMap.put("name", "北京漷县站-北京郎府站1");
        paramsMap.put("type", 0);
        paramsMap.put("pageNo", 1);
        paramsMap.put("pageSize", 10);
        RequestParams requestParams2 =
                new RequestParams(COOKIE_NAME, token, GET_GANTRY_INFO_LIST, paramsMap, "rows[0].name", "北京漷县站-北京郎府站1");

        requestMethod = getValue("test", "method");

        return new Object[][]{
//                {requestMethod, requestParams1},
                {requestMethod, requestParams2},
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
        request.requestEqual(requestParams, ContentType.URLENC);
    }

    @Test
    public void downloadFileTest()  {
        paramsMap.clear();
        paramsMap.put("provinceId", 11);
        getPrint(ContentType.XML, DOWNLOAD_FILE, COOKIE_NAME, token, paramsMap);
    }
}
