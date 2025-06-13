/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.login.GetAuthCodeByEmailRequest;
import com.gat.open.sdk.model.login.SyncUserAndGetAuthCodeRequest;
import org.junit.Test;

public class LoginApiTest {
    private OpenClient openClient = Clients.openClient;

    @Test
    public void loginTest() {
        /*
        GetAuthCodeRequest getAuthCodeRequest = new GetAuthCodeRequest();
        getAuthCodeRequest.setUserId("tom0001");
        String authCode = openClient.loginApi().getAuthCode(getAuthCodeRequest);

        GetAuthCodeByMobileRequest getAuthCodeByMobileRequest = new GetAuthCodeByMobileRequest();
        getAuthCodeByMobileRequest.setMobile("16898989091");
        String authCodeByMobile = openClient.loginApi().getAuthCodeByMobile(getAuthCodeByMobileRequest);
        System.out.println(authCodeByMobile);*/

        GetAuthCodeByEmailRequest getAuthCodeByEmailRequest = new GetAuthCodeByEmailRequest();
        getAuthCodeByEmailRequest.setEmail("li.yan@guanaitong.com");
        String authCodeByEmail = openClient.loginApi().getAuthCodeByEmail(getAuthCodeByEmailRequest);
        System.out.println(authCodeByEmail);
        /*
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setAuthCode(authCode);
        loginRequest.setRedirectCode("20091132");
        String loginUrl = openClient.loginApi().generateLoginUrl(loginRequest);
        System.out.println(loginUrl);*/
    }

    @Test
    public void syncLoginTest() {
        SyncUserAndGetAuthCodeRequest syncUserAndGetAuthCodeRequest = new SyncUserAndGetAuthCodeRequest();
        syncUserAndGetAuthCodeRequest.setCode("tom0816001");
        syncUserAndGetAuthCodeRequest.setUserId("tom081601");
        syncUserAndGetAuthCodeRequest.setMobile("16898989091");
        syncUserAndGetAuthCodeRequest.setName("tom081601");
        syncUserAndGetAuthCodeRequest.setEnterpriseCode("SHANSHAN08");
        String s = openClient.loginApi().syncUserAndGetAuthCode(syncUserAndGetAuthCodeRequest);
        System.out.println(s);
    }
}
