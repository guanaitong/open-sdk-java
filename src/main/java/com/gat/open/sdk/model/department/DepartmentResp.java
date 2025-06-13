/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.department;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by August.Zhou on 2022/6/27 14:40
 */
public class DepartmentResp {
    private String name;
    private Integer status;

    @JsonProperty("dept_Code")
    private String deptCode;
    private String parentCode;
    private String managerCode;
    private String managerUserid;
    @JsonProperty("is_primary")
    private Boolean isPrimary;

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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getManagerCode() {
        return managerCode;
    }

    public void setManagerCode(String managerCode) {
        this.managerCode = managerCode;
    }

    public String getManagerUserid() {
        return managerUserid;
    }

    public void setManagerUserid(String managerUserid) {
        this.managerUserid = managerUserid;
    }

    public Boolean getPrimary() {
        return isPrimary;
    }

    public void setPrimary(Boolean primary) {
        isPrimary = primary;
    }
}
