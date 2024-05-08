/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.admin;

import com.gat.open.sdk.model.FormRequest;
import com.gat.open.sdk.model.employee.EmployeeGetResp;

/**
 * 管理员信任登录跳转请求参数
 */
public class LoginRequest extends FormRequest<EmployeeGetResp> {

    //授权码，只能使用一次，并且有效期为1分钟（正式），失效请重新获取
    private String authCode;

    //场景编码：暂时不需要传递
    private String sceneCode;

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getSceneCode() {
        return sceneCode;
    }

    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
    }
}
