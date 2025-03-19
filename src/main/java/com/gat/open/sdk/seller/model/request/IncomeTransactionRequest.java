/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

import com.gat.open.sdk.model.JsonRequest;
import com.gat.open.sdk.model.Pagination2;
import com.gat.open.sdk.seller.model.response.IncomeTransactionResponse;

/**
 * @author shuai.zhao@guaniatong.com
 */


public class IncomeTransactionRequest extends JsonRequest<Pagination2<IncomeTransactionResponse>> {

    public IncomeTransactionRequest() {
        super.noSnake = true;
    }

    /**
     * 查询区间的起始时间，格式：yyyy-MM-dd HH:mm:ss。默认：3天前0点。
     */
    private String timeCreatedStart;
    /**
     * 查询区间的结束时间，格式同上。默认当前时间。
     */
    private String timeCreatedEnd;
    /**
     * 交易所属应用清单，使用”,“拼接。
     */
    private String sourceAppIds;

    private String outerTradeNo;
    /**
     * 当前页码，默认 1。
     */
    private Integer page = 1;
    /**
     * 每页记录数，默认 20。min:1, max:100。
     */
    private Integer rowsPerPage = 20;
    /**
     * 排序模式（按交易发生时间），升序 or 降序，默认：降序。
     */
    private Boolean sortMode = Boolean.FALSE;

    public String getTimeCreatedStart() {
        return timeCreatedStart;
    }

    public void setTimeCreatedStart(String timeCreatedStart) {
        this.timeCreatedStart = timeCreatedStart;
    }

    public String getTimeCreatedEnd() {
        return timeCreatedEnd;
    }

    public void setTimeCreatedEnd(String timeCreatedEnd) {
        this.timeCreatedEnd = timeCreatedEnd;
    }

    public String getSourceAppIds() {
        return sourceAppIds;
    }

    public void setSourceAppIds(String sourceAppIds) {
        this.sourceAppIds = sourceAppIds;
    }

    public String getOuterTradeNo() {
        return outerTradeNo;
    }

    public void setOuterTradeNo(String outerTradeNo) {
        this.outerTradeNo = outerTradeNo;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRowsPerPage() {
        return rowsPerPage;
    }

    public void setRowsPerPage(Integer rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }

    public Boolean getSortMode() {
        return sortMode;
    }

    public void setSortMode(Boolean sortMode) {
        this.sortMode = sortMode;
    }
}
