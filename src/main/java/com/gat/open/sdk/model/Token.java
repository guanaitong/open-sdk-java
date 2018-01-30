package com.gat.open.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by xin.hua on 2017/7/18.
 */
public class Token {

    /**
     * access_token : cde2c369fab499c0bf0643bb1844e70c
     * expires_in : 3600
     */

    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("expires_in")
    private int expiresIn;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }
}
