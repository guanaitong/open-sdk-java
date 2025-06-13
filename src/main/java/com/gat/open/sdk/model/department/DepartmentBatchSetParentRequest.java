/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.department;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.JsonArrayRequest;

import java.util.List;

/**
 * Created by August.Zhou on 2022/6/27 14:40
 */
public class DepartmentBatchSetParentRequest extends JsonArrayRequest<String> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;

    public DepartmentBatchSetParentRequest(List<DepartmentBatchSetParentBody> array) {
        super(array);
    }

    public static class DepartmentBatchSetParentBody {
        /**
         * 部门编码
         */
        private String deptCode;
        /**
         * 父部门编码
         */
        private String parentCode;

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
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

}
