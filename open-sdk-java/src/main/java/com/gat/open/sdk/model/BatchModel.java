package com.gat.open.sdk.model;

import java.util.List;

/**
 * Created by xin.hua on 2017/7/19.
 */
public class BatchModel<T> {
    private int totalCount;

    private List<T> dataList;

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
}
