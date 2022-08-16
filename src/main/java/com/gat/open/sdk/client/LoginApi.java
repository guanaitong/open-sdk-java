/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.login.GetAuthCodeByEmailRequest;
import com.gat.open.sdk.model.login.GetAuthCodeByMobileRequest;
import com.gat.open.sdk.model.login.GetAuthCodeRequest;
import com.gat.open.sdk.model.login.LoginRequest;
import com.gat.open.sdk.model.login.SyncUserAndGetAuthCodeRequest;

/**
 * Created by August.Zhou on 2022/6/27 14:16
 */
public class LoginApi {
    private final OpenClient openClient;

    LoginApi(OpenClient openClient) {
        this.openClient = openClient;
    }


    public String getAuthCode(GetAuthCodeRequest getAuthCodeRequest) {
        return openClient.postFormWithAuth("/sso/employee/getAuthCodeByCorpCode", getAuthCodeRequest);
    }

    public String getAuthCodeByMobile(GetAuthCodeByMobileRequest getAuthCodeByMobileRequest) {
        return openClient.postFormWithAuth("/sso/employee/getAuthCodeByMobile", getAuthCodeByMobileRequest);
    }

    public String getAuthCodeByEmail(GetAuthCodeByEmailRequest getAuthCodeByEmailRequest) {
        return openClient.postFormWithAuth("/sso/employee/getAuthCodeByEmail", getAuthCodeByEmailRequest);
    }

    public String syncUserAndGetAuthCode(SyncUserAndGetAuthCodeRequest syncUserAndGetAuthCodeRequest) {
        return openClient.postFormWithAuth("/sso/employee/syncUserAndGetAuthCode", syncUserAndGetAuthCodeRequest);
    }


    public String generateLoginUrl(LoginRequest loginRequest) {
        return openClient.buildUrl("/sso/employee/login", loginRequest.toRequestParams());
    }
}
