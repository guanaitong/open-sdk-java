/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.Pagination;
import com.gat.open.sdk.model.employee.EmployeeAddRequest;
import com.gat.open.sdk.model.employee.EmployeeAttributeGetRequest;
import com.gat.open.sdk.model.employee.EmployeeAttributeGetResp;
import com.gat.open.sdk.model.employee.EmployeeBatchGetRequest;
import com.gat.open.sdk.model.employee.EmployeeBatchGetResp;
import com.gat.open.sdk.model.employee.EmployeeBatchSyncRequest;
import com.gat.open.sdk.model.employee.EmployeeGet2Resp;
import com.gat.open.sdk.model.employee.EmployeeGetByDepartmentCodeRequest;
import com.gat.open.sdk.model.employee.EmployeeGetCountByDepartmentCodeRequest;
import com.gat.open.sdk.model.employee.EmployeeGetListRequest;
import com.gat.open.sdk.model.employee.EmployeeGetRequest;
import com.gat.open.sdk.model.employee.EmployeeGetResp;
import com.gat.open.sdk.model.employee.EmployeeResignRequest;
import com.gat.open.sdk.model.employee.EmployeeRestoreRequest;
import com.gat.open.sdk.model.employee.EmployeeSyncRequest;
import com.gat.open.sdk.model.employee.EmployeeTransferRequest;
import com.gat.open.sdk.model.employee.EmployeeUpdateMobileRequest;
import com.gat.open.sdk.model.employee.EmployeeUpdateRequest;

import java.util.List;

/**
 * Created by August.Zhou on 2022/6/27 13:51
 */
public class EmployeeApi {
    private final OpenClient openClient;

    EmployeeApi(OpenClient openClient) {
        this.openClient = openClient;
    }

    public String add(EmployeeAddRequest employeeAddRequest) {
        return this.openClient.postFormWithAuth("/employee/add", employeeAddRequest);
    }

    public String update(EmployeeUpdateRequest employeeUpdateRequest) {
        return this.openClient.postFormWithAuth("/employee/update", employeeUpdateRequest);
    }

    public String updateMobile(EmployeeUpdateMobileRequest employeeUpdateRequest) {
        return this.openClient.postFormWithAuth("/employee/updateMobile", employeeUpdateRequest);
    }

    public EmployeeGetResp get(EmployeeGetRequest employeeGetRequest) {
        return this.openClient.postFormWithAuth("/employee/get", employeeGetRequest);
    }

    public List<EmployeeGet2Resp> getListByField(EmployeeGetListRequest employeeGetListRequest) {
        return this.openClient.postFormWithAuth("/employee/getListByField", employeeGetListRequest);
    }

    public String batchSynchronize(EmployeeBatchSyncRequest employeeBatchSyncRequest) {
        return this.openClient.postJsonWithAuth("/employee/v2/batchSynchronize", employeeBatchSyncRequest);
    }

    public String resign(EmployeeResignRequest employeeResignRequest) {
        return this.openClient.postFormWithAuth("/employee/resign", employeeResignRequest);
    }

    public String restore(EmployeeRestoreRequest employeeRestoreRequest) {
        return this.openClient.postFormWithAuth("/employee/restore", employeeRestoreRequest);
    }

    public List<EmployeeGetResp> getByDepartmentCode(EmployeeGetByDepartmentCodeRequest employeeGetByDepartmentCodeRequest) {
        return this.openClient.postFormWithAuth("/employee/getByDepartmentCode", employeeGetByDepartmentCodeRequest);
    }

    public Integer getCountByDepartmentCode(EmployeeGetCountByDepartmentCodeRequest employeeGetCountByDepartmentCodeRequest) {
        return this.openClient.postFormWithAuth("/employee/getCountByDepartmentCode", employeeGetCountByDepartmentCodeRequest);
    }

    public List<EmployeeAttributeGetResp> getAttribute(EmployeeAttributeGetRequest employeeAttributeGetRequest) {
        return this.openClient.postFormWithAuth("/employee/attribute/get", employeeAttributeGetRequest);
    }

    public Pagination<EmployeeBatchGetResp> batchGetEmployee(EmployeeBatchGetRequest employeeBatchGetRequest) {
        return this.openClient.postFormWithAuth("/employee/batchGet", employeeBatchGetRequest);
    }

    public String transfer(EmployeeTransferRequest employeeTransferRequest) {
        return this.openClient.postFormWithAuth("/employee/transfer", employeeTransferRequest);
    }

    public String syncSingleEmployee(EmployeeSyncRequest employeeSyncRequest) {
        return this.openClient.postFormWithAuth("/employee/syncSingleEmployee", employeeSyncRequest);
    }
}
