/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model;

import com.gat.open.sdk.util.JSON;

import java.util.List;


public class Pagination<T> {
    /**
     * <strong>属性名不要更改</strong>
     */
    private int totalCount;

    /**
     * <strong>属性名不要更改</strong>
     */
    private List<T> dataList;


    public Pagination() {

    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pagination)) return false;

        Pagination<?> that = (Pagination<?>) o;

        if (totalCount != that.totalCount) return false;
        return dataList != null ? dataList.equals(that.dataList) : that.dataList == null;
    }

    @Override
    public int hashCode() {
        int result = totalCount;
        result = 31 * result + (dataList != null ? dataList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
