/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.admin.GetAuthCodeRequest;
import com.gat.open.sdk.model.admin.LoginRequest;

/**
 * 管理员信任登录
 */
public class AdminLoginApi {
    private final OpenClient openClient;

    AdminLoginApi(OpenClient openClient) {
        this.openClient = openClient;
    }

    public String getAuthCode(GetAuthCodeRequest getAuthCodeRequest) {
        return openClient.postFormWithAuth("/sso/enterprise/getAuthCode", getAuthCodeRequest);
    }

    public String generateLoginUrl(LoginRequest loginRequest) {
        return openClient.buildUrl("/sso/enterprise/login", loginRequest.toRequestParams(openClient.getHttpMessageConverter()));
    }
}
