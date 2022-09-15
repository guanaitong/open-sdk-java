/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.employee;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;
import com.gat.open.sdk.model.Pagination2;

/**
 * https://open.guanaitong.com/doc/enterprise/employee-batch-get/
 * <p>
 * Created by August.Zhou on 2022/6/27 13:54
 */
public class EmployeeBatchGetRequest extends FormRequest<Pagination2<EmployeeBatchGetResp>> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;

    /**
     * 页码(默认为1)
     */
    private int pageIndex = 1;

    /**
     * 每页记录数，默认为10，建议最多为50
     */
    private int pageSize = 10;

    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
