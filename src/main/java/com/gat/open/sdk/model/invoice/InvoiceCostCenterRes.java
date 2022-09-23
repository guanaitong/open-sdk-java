/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.invoice;

import java.util.List;

public class InvoiceCostCenterRes {
    /**
     * 成本中心id
     */
    private Integer costCenterId;
    /**
     * 成本中心编号
     */
    private String costCenterCode;
    /**
     * 成本中心名称
     */
    private String costCenterName;

    /**
     * 成本中心标签
     */
    private List<String> costCenterTags;

    /**
     * 状态 1-生效 2-失效
     */
    private Integer status;

    public Integer getCostCenterId() {
        return costCenterId;
    }

    public void setCostCenterId(Integer costCenterId) {
        this.costCenterId = costCenterId;
    }

    public String getCostCenterCode() {
        return costCenterCode;
    }

    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }

    public String getCostCenterName() {
        return costCenterName;
    }

    public void setCostCenterName(String costCenterName) {
        this.costCenterName = costCenterName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<String> getCostCenterTags() {
        return costCenterTags;
    }

    public void setCostCenterTags(List<String> costCenterTags) {
        this.costCenterTags = costCenterTags;
    }
}
