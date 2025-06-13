/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.Pagination;
import com.gat.open.sdk.model.assets.EmployeeAssetsAccountGetRequest;
import com.gat.open.sdk.model.assets.EmployeeAssetsAccountGetResp;
import com.gat.open.sdk.model.assets.EmployeeAssetsLimitRecordRequest;
import com.gat.open.sdk.model.assets.EmployeeAssetsLimitRecordResp;
import com.gat.open.sdk.model.assets.EmployeeAssetsPointConsumeRequest;
import com.gat.open.sdk.model.assets.EmployeeAssetsPointConsumeResp;
import com.gat.open.sdk.model.assets.EnterpriseAssetsAccountGetRequest;
import com.gat.open.sdk.model.assets.EnterpriseAssetsAccountGetResp;
import com.gat.open.sdk.model.assets.EnterpriseAssetsAssignJiFenSingleRequest;
import com.gat.open.sdk.model.assets.EnterpriseAssetsAssignLimitSingleRequest;
import com.gat.open.sdk.model.assets.EnterpriseAssetsAssignSingleQueryRequest;
import com.gat.open.sdk.model.assets.EnterpriseAssetsAssignSingleQueryResp;
import com.gat.open.sdk.model.assets.EnterpriseAssetsAssignSingleRequest;
import com.gat.open.sdk.model.assets.EnterpriseAssetsJiFenAssignStatusRequest;
import com.gat.open.sdk.model.assets.EnterpriseAssetsJiFenAssignStatusResp;
import com.gat.open.sdk.model.assets.EnterpriseAssetsJiFenRecycleRequest;
import com.gat.open.sdk.model.assets.EnterpriseAssetsLimitAssignStatusRequest;
import com.gat.open.sdk.model.assets.EnterpriseAssetsLimitAssignStatusResp;
import com.gat.open.sdk.model.assets.EnterpriseAssetsLimitGetRequest;
import com.gat.open.sdk.model.assets.EnterpriseAssetsLimitGetResp;
import com.gat.open.sdk.model.assets.EnterpriseAssetsLimitRecycleRequest;

import java.util.List;

/**
 * Created by August.Zhou on 2022/6/27 13:51
 */
public class AssetsApi {
    private final OpenClient openClient;

    AssetsApi(OpenClient openClient) {
        this.openClient = openClient;
    }

    public List<EmployeeAssetsAccountGetResp> getEmployeeAssetsAccount(EmployeeAssetsAccountGetRequest employeeAssetsAccountGetRequest) {
        return this.openClient.postFormWithAuth("/assets/account/employee/get", employeeAssetsAccountGetRequest);
    }

    public List<EnterpriseAssetsAccountGetResp> getEnterpriseAssetsAccount(EnterpriseAssetsAccountGetRequest enterpriseAssetsAccountGetRequest) {
        return this.openClient.postFormWithAuth("/assets/account/enterprise/get", enterpriseAssetsAccountGetRequest);
    }

    public List<EnterpriseAssetsLimitGetResp> getEnterpriseAssetsLimit(EnterpriseAssetsLimitGetRequest enterpriseAssetsLimitGetRequest) {
        return this.openClient.postFormWithAuth("/assets/limit/enterprise/get", enterpriseAssetsLimitGetRequest);
    }

    @Deprecated
    public String assignSingleJiFen(EnterpriseAssetsAssignJiFenSingleRequest enterpriseAssetsAssignJiFenSingleRequest) {
        return this.openClient.postFormWithAuth("/assets/jifen/enterprise/assign/single", enterpriseAssetsAssignJiFenSingleRequest);
    }

    @Deprecated
    public String assignSingleLimit(EnterpriseAssetsAssignLimitSingleRequest enterpriseAssetsAssignLimitSingleRequest) {
        return this.openClient.postFormWithAuth("/assets/limit/enterprise/assign/single", enterpriseAssetsAssignLimitSingleRequest);
    }

    @Deprecated
    public EnterpriseAssetsJiFenAssignStatusResp assignJiFenStatus(EnterpriseAssetsJiFenAssignStatusRequest enterpriseAssetsJiFenAssignStatusRequest) {
        return this.openClient.postFormWithAuth("/assets/jifen/enterprise/assign/status", enterpriseAssetsJiFenAssignStatusRequest);
    }

    @Deprecated
    public EnterpriseAssetsLimitAssignStatusResp assignLimitStatus(EnterpriseAssetsLimitAssignStatusRequest enterpriseAssetsLimitAssignStatusRequest) {
        return this.openClient.postFormWithAuth("/assets/limit/enterprise/assign/status", enterpriseAssetsLimitAssignStatusRequest);
    }

    @Deprecated
    public String recycleJiFen(EnterpriseAssetsJiFenRecycleRequest enterpriseAssetsJiFenRecycleRequest) {
        return this.openClient.postFormWithAuth("/assets/jifen/enterprise/recycle", enterpriseAssetsJiFenRecycleRequest);
    }

    @Deprecated
    public String recycleLimit(EnterpriseAssetsLimitRecycleRequest enterpriseAssetsLimitRecycleRequest) {
        return this.openClient.postFormWithAuth("/assets/limit/enterprise/recycle", enterpriseAssetsLimitRecycleRequest);
    }

    public String assetsAssignSingle(EnterpriseAssetsAssignSingleRequest enterpriseAssetsAssignSingleRequest) {
        return this.openClient.postFormWithAuth("/enterprise/assign/single", enterpriseAssetsAssignSingleRequest);
    }

    public EnterpriseAssetsAssignSingleQueryResp assignSingleQuery(EnterpriseAssetsAssignSingleQueryRequest enterpriseAssetsAssignSingleQueryRequest) {
        return this.openClient.postFormWithAuth("/enterprise/assign/single/query", enterpriseAssetsAssignSingleQueryRequest);
    }

    public Pagination<EmployeeAssetsPointConsumeResp> employeePointConsumeQuery(EmployeeAssetsPointConsumeRequest employeeAssetsPointConsumeRequest) {
        return this.openClient.postFormWithAuth("/assets/point/employee/consume", employeeAssetsPointConsumeRequest);
    }

    public Pagination<EmployeeAssetsLimitRecordResp> employeeAssetsLimitRecordQuery(EmployeeAssetsLimitRecordRequest employeeAssetsLimitRecordRequest) {
        return this.openClient.postFormWithAuth("/assets/limit/employee/record", employeeAssetsLimitRecordRequest);
    }
}
