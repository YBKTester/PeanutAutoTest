package com.bink.utils;

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
     * @param cookie   请求Cookie
     * @param url      请求地址
     * @param parasMap 请求参数
     */
    void request(String cookie, String url, Map<String, Object> parasMap);
}
