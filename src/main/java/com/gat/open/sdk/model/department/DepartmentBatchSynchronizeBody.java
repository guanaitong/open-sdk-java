/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.department;

public class DepartmentBatchSynchronizeBody {
    /**
     * 部门编码
     */
    private String deptCode;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 部门是否有效，1有效、2无效
     */
    private Integer status;

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
