/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.enterprise;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;
import com.gat.open.sdk.model.enums.ThirdTypeEnum;

public class AppSubscribeQueryRequest extends FormRequest<AppSubscribeResponse> implements EnterpriseCodeRequest {

    private ThirdTypeEnum thirdType;

    private String        enterpriseCode;

    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public ThirdTypeEnum getThirdType() {
        return thirdType;
    }

    public void setThirdType(ThirdTypeEnum thirdType) {
        this.thirdType = thirdType;
    }
}
