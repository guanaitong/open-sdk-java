/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.department;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.JsonArrayRequest;

import java.util.List;

/**
 * Created by August.Zhou on 2022/6/27 14:40
 */
public class DepartmentBatchSynchronizeRequest extends JsonArrayRequest<String> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;

    public DepartmentBatchSynchronizeRequest(List<DepartmentBatchSynchronizeBody> array) {
        super(array);
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

}
