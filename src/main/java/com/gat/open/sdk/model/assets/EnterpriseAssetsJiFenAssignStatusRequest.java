/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import com.gat.open.sdk.model.FormRequest;

/**
 * 积分：https://open.guanaitong.com/doc/enterprise/point-assign-status/
 * <p>
 * Created by August.Zhou on 2022/6/27 13:54
 */
public class EnterpriseAssetsJiFenAssignStatusRequest extends FormRequest<EnterpriseAssetsJiFenAssignStatusResp> {
    /**
     * 外部交易号，最小长度2位。
     */
    private String externalCode;

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }
}
