package com.bink.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 用例参数表
 *
 * @author Bink
 * @date 2020/6/24
 */
@Data
@Component
public class Params {

    /**
     * 用例编号
     */
    private Integer id;
    /**
     * 用例名称
     */
    private String caseName;
    /**
     * 请求方式
     */
    private String requestMethod;
    /**
     * 消息头名称
     */
    private String headerName;
    /**
     * 消息头值
     */
    private String headerValue;
    /**
     * cookie名称
     */
    private String cookieName;
    /**
     * cookie值
     */
    private String cookieValue;
    /**
     * 请求地址
     */
    private String url;
    /**
     * 请求参数集
     */
    private String paramsMap;
    /**
     * 备注信息
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public String getCaseName() {
        return caseName;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public String getHeaderName() {
        return headerName;
    }

    public String getHeaderValue() {
        return headerValue;
    }

    public String getCookieName() {
        return cookieName;
    }

    public String getCookieValue() {
        return cookieValue;
    }

    public String getUrl() {
        return url;
    }

    public String getParamsMap() {
        return paramsMap;
    }

    public String getRemark() {
        return remark;
    }
}
