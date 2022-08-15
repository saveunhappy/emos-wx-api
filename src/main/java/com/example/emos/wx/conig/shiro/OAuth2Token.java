package com.example.emos.wx.conig.shiro;

import org.apache.shiro.authc.AuthenticationToken;

public class OAuth2Token implements AuthenticationToken {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    public OAuth2Token(String token) {
        this.token = token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
