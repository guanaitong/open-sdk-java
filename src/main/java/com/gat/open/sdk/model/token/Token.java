/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.token;

/**
 * Created by August.Zhou on 2022/6/27 13:17
 */
public class Token {
    private final String accessToken;
    private final int expiresIn;
    private final long createAt;
    private final long expiresAt;

    public Token(TokenCreateResp tokenCreateResp) {
        this.accessToken = tokenCreateResp.getAccessToken();
        this.expiresIn = tokenCreateResp.getExpiresIn();
        this.createAt = System.currentTimeMillis();
        this.expiresAt = this.createAt + this.expiresIn * 1000L;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public boolean isExpired() {
        return System.currentTimeMillis() < this.expiresAt;
    }

    public boolean needRefresh() {
        //超过3/5的有效期时，认为需要刷新
        return (System.currentTimeMillis() - this.createAt) > 0.8 * this.expiresIn * 1000;
    }
}
