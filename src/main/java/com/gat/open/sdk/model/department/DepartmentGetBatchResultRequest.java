/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.department;

import com.gat.open.sdk.model.FormRequest;

/**
 * Created by August.Zhou on 2022/6/27 14:39
 */
public class DepartmentGetBatchResultRequest extends FormRequest<DepartmentGetBatchResultResp> {

    private String batchNum;

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }
}
