package com.bink.base;

import com.bink.utils.TestUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.ResourceBundle;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import io.restassured.RestAssured;

import static com.bink.common.RequestCommon.PORT_80;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * 测试基准类
 *
 * @author Bink
 * @date 2020/6/17
 */
public class TestBase {
    public static RequestSpecification httpRequest;
    public static Response response;
    public Logger logger;

    public static String serverHost;
    public static String port;
    public Response res = null;
    public JsonPath jp = null;
    public RequestSpecification req;

    public static TestUtils testUtils = new TestUtils();

    static {
        ResourceBundle rb = ResourceBundle.getBundle("config");
        serverHost = rb.getString("Host");
        port = rb.getString("Port");
    }

    /**
     *
     */
    @BeforeClass
    public void setUp() {
        logger = Logger.getLogger(this.getClass().getName());
        PropertyConfigurator.configure("log4j.properties");
        logger.setLevel(Level.DEBUG);
        logger.info(">>>>>>>>>>>>>>测试开始，准备环境<<<<<<<<<<<<<<");
        setBaseUri();
        setBasePath("");
        setContentType(ContentType.JSON);
    }

    @AfterClass
    public void tearDown() {
        logger.info("测试完成，准备恢复环境！");
        resetBaseUri();
        resetBasePath();
    }

    /**
     * 从指定文件读取指定字段
     *
     * @param fileName 文件名
     * @param keyword  字段名
     * @return 字段对应值
     */
    public static String getValue(String fileName, String keyword) {
        ResourceBundle rb = ResourceBundle.getBundle(fileName);
        return rb.getString(keyword);
    }


    /**
     * 设置 base URI
     */
    public static void setBaseUri() {
        if (PORT_80.equals(port)) {
            RestAssured.baseURI = serverHost;
        } else {
            RestAssured.baseURI = serverHost + ":" + port;
        }
        System.out.println(RestAssured.baseURI);
    }

    /**
     * 设置base path
     *
     * @param basePath 接口Controller地址
     */
    public static void setBasePath(String basePath) {
        RestAssured.basePath = basePath;
    }

    /**
     * 执行完测试后重置 Base URI
     */
    public static void resetBaseUri() {
        RestAssured.baseURI = null;
    }

    /**
     * 执行完测试后重置 base path
     */
    public static void resetBasePath() {
        RestAssured.basePath = null;
    }

    /**
     * 设置请求 ContentType
     *
     * @param type 请求类型
     */
    public static void setContentType(ContentType type) {
        given().contentType(type);
    }

    /**
     * 返回指定请求path的 response内容
     *
     * @param path
     * @return
     */
    public static Response getResponsebyPath(String path) {
        return get(path);
    }

    /**
     * 返回响应内容
     *
     * @return
     */
    public static Response getResponse() {
        return get();
    }

    /**
     * 返回 JsonPath对象
     *
     * @param res
     * @return
     */
    public static JsonPath getJsonPath(Response res) {
        String json = res.asString();
        //System.out.print("returned json: " + json +"\n");
        return new JsonPath(json);
    }

}
