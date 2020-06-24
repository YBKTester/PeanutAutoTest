package com.bink.utils;

import com.bink.base.RequestParams;
import io.restassured.http.ContentType;

import java.util.Map;

/**
 * 请求接口
 *
 * @author Bink
 * @date 2020/6/17
 */
public interface Request {

    /**
     * 发起Http请求
     *
     * @param params      请求参数
     * @param contentType 参数传递方式JSON/URLENC
     */
    void requestEqual(RequestParams params, ContentType contentType);
}
