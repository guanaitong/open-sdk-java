/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import com.gat.open.sdk.model.FormRequest;

/**
 * 积分：https://open.guanaitong.com/doc/enterprise/single-assign-query/
 * <p>
 * Created by August.Zhou on 2022/6/27 13:54
 */
public class EnterpriseAssetsAssignSingleQueryRequest extends FormRequest<EnterpriseAssetsAssignSingleQueryResp> {

    /**
     * 1:企业微信, 2:钉钉,3:飞书,4, 定制, 5:标准对接,非必填默认5
     */
    private Integer thirdType;
    /**
     * 外部交易号，最小长度2位。
     */
    private String externalCode;

    public Integer getThirdType() {
        return thirdType;
    }

    public void setThirdType(Integer thirdType) {
        this.thirdType = thirdType;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }
}
