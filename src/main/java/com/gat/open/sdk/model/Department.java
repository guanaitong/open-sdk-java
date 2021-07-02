/*
 * Copyright 2007-2021, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Stanley Shen
 * @version 1.0.0
 * @date 2017/12/18 19:34
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Department {

    private String name;
    private Integer status;
    private String dept_Code;
    private String parent_code;
    private String manager_code;

    public Department() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDept_Code() {
        return this.dept_Code;
    }

    public void setDept_Code(String dept_Code) {
        this.dept_Code = dept_Code;
    }

    public String getParent_code() {
        return this.parent_code;
    }

    public void setParent_code(String parent_code) {
        this.parent_code = parent_code;
    }

    public String getManager_code() {
        return this.manager_code;
    }

    public void setManager_code(String manager_code) {
        this.manager_code = manager_code;
    }
}
