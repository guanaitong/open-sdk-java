/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model;

/**
 * 标识一个请求是否可以适用于服务商
 * Created by August.Zhou on 2022/6/27 15:35
 */
public interface EnterpriseCodeRequest {

    String getEnterpriseCode();

    void setEnterpriseCode(String enterpriseCode);

}
