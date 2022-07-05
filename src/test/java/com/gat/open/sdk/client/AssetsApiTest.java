/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
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
import com.gat.open.sdk.util.Constants;
import com.gat.open.sdk.util.JSON;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class AssetsApiTest {
        private OpenClient openClient = new OpenClient(Constants.BASE_URL_TEST, "20110661", "fba0575923aa07fbfdaddbc99bc4e017");
//    private OpenClient openClient = new OpenClient("http://127.0.0.1:18080", "20110661", "fba0575923aa07fbfdaddbc99bc4e017");

    @Test
    public void enterpriseAccountGetTest() {
        EnterpriseAssetsAccountGetRequest enterpriseAssetsAccountGetRequest = new EnterpriseAssetsAccountGetRequest();
//        enterpriseAssetsAccountGetRequest.setAccountOpenid("8c9022b7dfbd84e7f4102d9b0d3c2745");
        List<EnterpriseAssetsAccountGetResp> enterpriseAssetsAccount = openClient.assetsApi().getEnterpriseAssetsAccount(enterpriseAssetsAccountGetRequest);
        System.out.println(JSON.toJSONString(enterpriseAssetsAccount));
    }

    @Test
    public void enterpriseAssignJiFenTest() {
        EnterpriseAssetsAssignJiFenSingleRequest enterpriseAssetsAssignJiFenSingleRequest = new EnterpriseAssetsAssignJiFenSingleRequest();
        enterpriseAssetsAssignJiFenSingleRequest.setUserId("tom0001");
        enterpriseAssetsAssignJiFenSingleRequest.setAccountOpenid("8c9022b7dfbd84e7f4102d9b0d3c2745");
        enterpriseAssetsAssignJiFenSingleRequest.setAmount(new BigDecimal("10"));
        enterpriseAssetsAssignJiFenSingleRequest.setExternalCode("2011066120220704000001");
        enterpriseAssetsAssignJiFenSingleRequest.setReason("测试发送");
        openClient.assetsApi().assignSingleJiFen(enterpriseAssetsAssignJiFenSingleRequest);
    }

    @Test
    public void enterpriseAssignJiFenStatusTest() {
        EnterpriseAssetsJiFenAssignStatusRequest enterpriseAssetsJiFenAssignStatusRequest = new EnterpriseAssetsJiFenAssignStatusRequest();
        enterpriseAssetsJiFenAssignStatusRequest.setExternalCode("2011066120220704000001");
        EnterpriseAssetsJiFenAssignStatusResp enterpriseAssetsJiFenAssignStatusResp = openClient.assetsApi().assignJiFenStatus(enterpriseAssetsJiFenAssignStatusRequest);
        System.out.println(JSON.toJSONString(enterpriseAssetsJiFenAssignStatusResp));
    }

    @Test
    public void enterpriseAssetsAssignSingle() {
        EnterpriseAssetsAssignSingleRequest enterpriseAssetsAssignSingleRequest = new EnterpriseAssetsAssignSingleRequest();
        enterpriseAssetsAssignSingleRequest.setUserId("tom0001");
        enterpriseAssetsAssignSingleRequest.setAccountOpenid("8c9022b7dfbd84e7f4102d9b0d3c2745");
        enterpriseAssetsAssignSingleRequest.setAmount(new BigDecimal("1000"));
        enterpriseAssetsAssignSingleRequest.setExternalCode("2011066120220704000006");
        enterpriseAssetsAssignSingleRequest.setReason("测试发送");
        openClient.assetsApi().assetsAssignSingle(enterpriseAssetsAssignSingleRequest);
    }

    @Test
    public void enterpriseAssignSingleQuery() {
        EnterpriseAssetsAssignSingleQueryRequest enterpriseAssetsAssignSingleQueryRequest = new EnterpriseAssetsAssignSingleQueryRequest();
        enterpriseAssetsAssignSingleQueryRequest.setExternalCode("2011066120220704000002");
        EnterpriseAssetsAssignSingleQueryResp enterpriseAssetsAssignSingleQueryResp = openClient.assetsApi().assignSingleQuery(enterpriseAssetsAssignSingleQueryRequest);
        System.out.println(JSON.toJSONString(enterpriseAssetsAssignSingleQueryResp));
    }

    @Test
    public void enterpriseLimitGetTest() {
        EnterpriseAssetsLimitGetRequest enterpriseAssetsLimitGetRequest = new EnterpriseAssetsLimitGetRequest();
        List<EnterpriseAssetsLimitGetResp> enterpriseAssetsLimit = openClient.assetsApi().getEnterpriseAssetsLimit(enterpriseAssetsLimitGetRequest);
        System.out.println(JSON.toJSONString(enterpriseAssetsLimit));
    }

    @Test
    public void enterpriseAssignLimitTest() {
        EnterpriseAssetsAssignLimitSingleRequest enterpriseAssetsAssignLimitSingleRequest = new EnterpriseAssetsAssignLimitSingleRequest();
        enterpriseAssetsAssignLimitSingleRequest.setLimitOpenid("9fdbeea55dab2b1d252d7b593d00e7c5");
        enterpriseAssetsAssignLimitSingleRequest.setAmount(new BigDecimal(100));
        enterpriseAssetsAssignLimitSingleRequest.setExternalCode("2011066120220704000007");
        enterpriseAssetsAssignLimitSingleRequest.setUserId("tom0001");
        enterpriseAssetsAssignLimitSingleRequest.setReason("测试发送额度");
        openClient.assetsApi().assignSingleLimit(enterpriseAssetsAssignLimitSingleRequest);
    }

    @Test
    public void enterpriseAssignLimitStatusTest() {
        EnterpriseAssetsLimitAssignStatusRequest enterpriseAssetsLimitAssignStatusRequest = new EnterpriseAssetsLimitAssignStatusRequest();
        enterpriseAssetsLimitAssignStatusRequest.setExternalCode("2011066120220704000003");
        EnterpriseAssetsLimitAssignStatusResp enterpriseAssetsLimitAssignStatusResp = openClient.assetsApi().assignLimitStatus(enterpriseAssetsLimitAssignStatusRequest);
        System.out.println(JSON.toJSONString(enterpriseAssetsLimitAssignStatusResp));
    }

    @Test
    public void enterpriseRecycleJiFenTest() {
        EnterpriseAssetsJiFenRecycleRequest enterpriseAssetsJiFenRecycleRequest = new EnterpriseAssetsJiFenRecycleRequest();
        enterpriseAssetsJiFenRecycleRequest.setAmount(new BigDecimal(1));
        enterpriseAssetsJiFenRecycleRequest.setExternalCode("2011066120220704000004");
        enterpriseAssetsJiFenRecycleRequest.setUserId("tom0001");
        enterpriseAssetsJiFenRecycleRequest.setReason("测试发送额度");
        openClient.assetsApi().recycleJiFen(enterpriseAssetsJiFenRecycleRequest);
    }

    @Test
    public void enterpriseRecycleLimitTest() {
        EnterpriseAssetsLimitRecycleRequest enterpriseAssetsLimitRecycleRequest = new EnterpriseAssetsLimitRecycleRequest();
        enterpriseAssetsLimitRecycleRequest.setAmount(new BigDecimal(1));
        enterpriseAssetsLimitRecycleRequest.setExternalCode("2011066120220704000005");
        enterpriseAssetsLimitRecycleRequest.setUserId("tom0001");
        enterpriseAssetsLimitRecycleRequest.setReason("测试回收额度");
        enterpriseAssetsLimitRecycleRequest.setLimitOpenid("9fdbeea55dab2b1d252d7b593d00e7c5");
        openClient.assetsApi().recycleLimit(enterpriseAssetsLimitRecycleRequest);
    }

    @Test
    public void employeePointConsumeQueryTest() {
        EmployeeAssetsPointConsumeRequest employeeAssetsPointConsumeRequest = new EmployeeAssetsPointConsumeRequest();
        employeeAssetsPointConsumeRequest.setType(1);
        Pagination<EmployeeAssetsPointConsumeResp> employeeAssetsPointConsumeResps = openClient.assetsApi().employeePointConsumeQuery(employeeAssetsPointConsumeRequest);
        System.out.println(employeeAssetsPointConsumeResps);
    }

    @Test
    public void employeeAssetsLimitRecordQueryTest() {
        EmployeeAssetsLimitRecordRequest employeeAssetsLimitRecordRequest = new EmployeeAssetsLimitRecordRequest();
        employeeAssetsLimitRecordRequest.setAccountOpenid("9fdbeea55dab2b1d252d7b593d00e7c5");
        employeeAssetsLimitRecordRequest.setUserId("tom0001");
        Pagination<EmployeeAssetsLimitRecordResp> employeeAssetsLimitRecordResps = openClient.assetsApi().employeeAssetsLimitRecordQuery(employeeAssetsLimitRecordRequest);
        System.out.println(employeeAssetsLimitRecordResps);
    }

    @Test
    public void getEmployeeAssetsAccountTest() {
        EmployeeAssetsAccountGetRequest employeeAssetsAccountGetRequest = new EmployeeAssetsAccountGetRequest();
        employeeAssetsAccountGetRequest.setUserId("tom0001");
        List<EmployeeAssetsAccountGetResp> employeeAssetsAccount = openClient.assetsApi().getEmployeeAssetsAccount(employeeAssetsAccountGetRequest);
        System.out.println(JSON.toJSONString(employeeAssetsAccount));
    }
}
