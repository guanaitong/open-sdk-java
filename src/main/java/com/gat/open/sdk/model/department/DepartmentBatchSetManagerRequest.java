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
public class DepartmentBatchSetManagerRequest extends JsonArrayRequest<String> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;

    public DepartmentBatchSetManagerRequest(List<DepartmentBatchSetManagerBody> array) {
        super(array);
    }

    public static class DepartmentBatchSetManagerBody {
        /**
         * 部门编码
         */
        private String deptCode;
        /**
         * 部门主管编码（员工工号）
         */
        private String managerCode;

        public String getDeptCode() {
            return deptCode;
        }

        public void setDeptCode(String deptCode) {
            this.deptCode = deptCode;
        }

        public String getManagerCode() {
            return managerCode;
        }

        public void setManagerCode(String managerCode) {
            this.managerCode = managerCode;
        }
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

}
