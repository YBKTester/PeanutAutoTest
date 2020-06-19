package com.bink.base;

import java.util.Map;

/**
 * 请求参数类
 *
 * @author Bink
 * @date 2020/6/18
 */
public class RequestParams {
    private String cookieName;
    private String cookieValue;
    private String url;
    private Map<String, Object> parasMap;
    private String jsonPath;
    private Object exceptedValue;

    public RequestParams() {
    }

    public RequestParams(String cookieName, String cookieValue, String url, Map<String, Object> parasMap, String jsonPath, Object exceptedValue) {
        this.cookieName = cookieName;
        this.cookieValue = cookieValue;
        this.url = url;
        this.parasMap = parasMap;
        this.jsonPath = jsonPath;
        this.exceptedValue = exceptedValue;
    }

    public String getCookieName() {
        return cookieName;
    }

    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    public String getCookieValue() {
        return cookieValue;
    }

    public void setCookieValue(String cookieValue) {
        this.cookieValue = cookieValue;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, Object> getParasMap() {
        return parasMap;
    }

    public void setParasMap(Map<String, Object> parasMap) {
        this.parasMap = parasMap;
    }

    public String getJsonPath() {
        return jsonPath;
    }

    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    public Object getExceptedValue() {
        return exceptedValue;
    }

    public void setExceptedValue(String exceptedValue) {
        this.exceptedValue = exceptedValue;
    }
}
