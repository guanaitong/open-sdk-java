/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.login;

import com.gat.open.sdk.model.FormRequest;
import com.gat.open.sdk.model.employee.EmployeeGetResp;

/**
 * Created by August.Zhou on 2022/6/27 15:44
 */
public class LoginRequest extends FormRequest<EmployeeGetResp> {
    private String authCode;
    private String redirectUrl;
    private String redirectCode;
    private String sceneCode;

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getRedirectCode() {
        return redirectCode;
    }

    public void setRedirectCode(String redirectCode) {
        this.redirectCode = redirectCode;
    }

    public String getSceneCode() {
        return sceneCode;
    }

    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
    }
}
