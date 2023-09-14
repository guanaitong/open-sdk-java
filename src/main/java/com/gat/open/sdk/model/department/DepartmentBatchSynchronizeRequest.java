/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.department;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.JsonArrayRequest;

import java.util.List;

/**
 * Created by August.Zhou on 2022/6/27 14:40
 */
public class DepartmentBatchSynchronizeRequest extends JsonArrayRequest<String> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;

    public DepartmentBatchSynchronizeRequest(List<DepartmentBatchSynchronizeBody> array) {
        super(array);
    }

    public static class DepartmentBatchSynchronizeBody {
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

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

}
