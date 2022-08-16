/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.login;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;

/**
 * Created by August.Zhou on 2022/6/27 15:47
 */
public class GetAuthCodeByMobileRequest extends FormRequest<String> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;

    /**
     * 员工绑定手机号
     */
    private String mobile;
    /**
     * 手机号区号
     */
    private String mobileArea;


    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileArea() {
        return mobileArea;
    }

    public void setMobileArea(String mobileArea) {
        this.mobileArea = mobileArea;
    }
}
