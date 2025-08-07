/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.employee;

import com.gat.open.sdk.model.FormRequest;

import java.util.List;

/**
 * 根据员工属性查询多平台下员工信息
 */
public class EmployeeGetListRequest extends FormRequest<List<EmployeeGet2Resp>> {

    /**
     * 属性类型 1手机号 2工号
     */
    private Integer fieldType;

    /**
     * 类型对应的内容
     */
    private String fieldContent;


    public Integer getFieldType() {
        return fieldType;
    }

    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldContent() {
        return fieldContent;
    }

    public void setFieldContent(String fieldContent) {
        this.fieldContent = fieldContent;
    }
}
