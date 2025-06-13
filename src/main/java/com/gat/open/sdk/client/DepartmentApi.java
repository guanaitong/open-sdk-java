/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.department.DepartmentAddRequest;
import com.gat.open.sdk.model.department.DepartmentBatchSetManagerRequest;
import com.gat.open.sdk.model.department.DepartmentBatchSetParentRequest;
import com.gat.open.sdk.model.department.DepartmentBatchSynchronizeRequest;
import com.gat.open.sdk.model.department.DepartmentDeleteRequest;
import com.gat.open.sdk.model.department.DepartmentGetBatchResultRequest;
import com.gat.open.sdk.model.department.DepartmentGetBatchResultResp;
import com.gat.open.sdk.model.department.DepartmentGetHierarchyRequest;
import com.gat.open.sdk.model.department.DepartmentGetHierarchyResp;
import com.gat.open.sdk.model.department.DepartmentGetRequest;
import com.gat.open.sdk.model.department.DepartmentResp;
import com.gat.open.sdk.model.department.DepartmentTransferEmployeeRequest;
import com.gat.open.sdk.model.department.DepartmentUpdateRequest;

/**
 * Created by August.Zhou on 2022/6/27 14:15
 */
public class DepartmentApi {

    private final OpenClient openClient;

    DepartmentApi(OpenClient openClient) {
        this.openClient = openClient;
    }


    public String add(DepartmentAddRequest departmentAddRequest) {
        return this.openClient.postFormWithAuth("/department/add", departmentAddRequest);
    }


    public String update(DepartmentUpdateRequest departmentUpdateRequest) {
        return this.openClient.postFormWithAuth("/department/update", departmentUpdateRequest);
    }

    public String delete(DepartmentDeleteRequest departmentDeleteRequest) {
        return this.openClient.postFormWithAuth("/department/delete", departmentDeleteRequest);
    }


    public DepartmentResp get(DepartmentGetRequest departmentGetRequest) {
        return this.openClient.postFormWithAuth("/department/get", departmentGetRequest);
    }

    public DepartmentGetHierarchyResp getHierarchy(DepartmentGetHierarchyRequest departmentGetHierarchyRequest) {
        return this.openClient.postFormWithAuth("/department/getHierarchy", departmentGetHierarchyRequest);
    }

    public String batchSynchronize(DepartmentBatchSynchronizeRequest departmentBatchSynchronizeRequest) {
        return this.openClient.postJsonWithAuth("/department/batchSynchronize", departmentBatchSynchronizeRequest);
    }

    public DepartmentGetBatchResultResp getDepartmentBatchResult(DepartmentGetBatchResultRequest departmentGetBatchResultRequest) {
        return this.openClient.postFormWithAuth("/getByBatchNumber", departmentGetBatchResultRequest);
    }

    public String batchSetParent(DepartmentBatchSetParentRequest departmentBatchSetParentRequest) {
        return this.openClient.postJsonWithAuth("/department/batchSetParent", departmentBatchSetParentRequest);
    }

    public String batchSetManager(DepartmentBatchSetManagerRequest departmentBatchSetManagerRequest) {
        return this.openClient.postJsonWithAuth("/department/batchSetManager", departmentBatchSetManagerRequest);
    }

    public Boolean transferEmployee(DepartmentTransferEmployeeRequest departmentTransferEmployeeRequest) {
        return this.openClient.postFormWithAuth("/department/transferEmployee", departmentTransferEmployeeRequest);
    }
}
