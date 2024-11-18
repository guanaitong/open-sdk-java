/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.enterprise;

import java.util.List;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;

public class AppSubscribeRequest extends FormRequest<String> implements EnterpriseCodeRequest {

    private String        enterpriseCode;

    private List<Integer> productCategorys;

    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public List<Integer> getProductCategorys() {
        return productCategorys;
    }

    public void setProductCategorys(List<Integer> productCategorys) {
        this.productCategorys = productCategorys;
    }
}
