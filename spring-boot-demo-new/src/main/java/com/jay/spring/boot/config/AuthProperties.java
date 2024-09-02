package com.jay.spring.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xiang.wei
 * @create 2018/4/4 10:59
 */
@ConfigurationProperties("auth")
public class AuthProperties {
    private String cookie;
    private String token;

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
}
