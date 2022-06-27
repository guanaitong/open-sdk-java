/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.employee.EmployeeAddRequest;
import com.gat.open.sdk.model.employee.EmployeeBatchSyncRequest;
import com.gat.open.sdk.model.employee.EmployeeGetRequest;
import com.gat.open.sdk.model.employee.EmployeeGetResp;

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


    public EmployeeGetResp get(EmployeeGetRequest employeeGetRequest) {
        return this.openClient.postFormWithAuth("/employee/get", employeeGetRequest);
    }

    public String batchSynchronize(EmployeeBatchSyncRequest employeeBatchSyncRequest) {
        return this.openClient.postJsonWithAuth("/employee/v2/batchSynchronize", employeeBatchSyncRequest);
    }
}
