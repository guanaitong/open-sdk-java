/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.enterprise;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;
import com.gat.open.sdk.model.enums.ThirdTypeEnum;

public class FindEnterpriseSettingRequest extends FormRequest<ThirdSyncSettingResponse>
        implements EnterpriseCodeRequest {

    private String enterpriseCode;

    private ThirdTypeEnum thirdType;

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
