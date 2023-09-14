/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.employee;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Created by August.Zhou on 2022/6/27 16:58
 */
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class ThirdUser {
    /**
     * 第三方类型，目前仅支持 1.企业微信 2.钉钉
     */
    private Integer thirdType;
    /**
     * 第三方中的userId
     */
    private String userId;

    public Integer getThirdType() {
        return thirdType;
    }

    public void setThirdType(Integer thirdType) {
        this.thirdType = thirdType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
