/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.consume;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;
import com.gat.open.sdk.model.Pagination;

public class ConsumeListRequest extends FormRequest<Pagination<ConsumeListResp>> implements EnterpriseCodeRequest {
    // 企业编号（集团和运营商必填,企业不填）
    private String enterpriseCode;
    private Integer pageSize;
    private Integer pageIndex;
    private String timeStart;
    private String timeEnd;
    private Integer containFeeTrade;

    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Integer getContainFeeTrade() {
        return containFeeTrade;
    }

    public void setContainFeeTrade(Integer containFeeTrade) {
        this.containFeeTrade = containFeeTrade;
    }
}
