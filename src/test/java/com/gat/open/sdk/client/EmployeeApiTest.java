/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.department.DepartmentGetHierarchyRequest;
import com.gat.open.sdk.model.department.DepartmentGetHierarchyResp;
import com.gat.open.sdk.model.department.DepartmentGetRequest;
import com.gat.open.sdk.model.department.DepartmentResp;
import com.gat.open.sdk.model.employee.EmployeeBatchSyncRequest;
import com.gat.open.sdk.model.employee.EmployeeInfo;
import com.gat.open.sdk.util.Constants;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by August.Zhou on 2022/6/27 14:21
 */
public class EmployeeApiTest {


    private OpenClient openClient = new OpenClient(Constants.BASE_URL_TEST, "20110947", "db962af04d5dbbd5bcac6041e82c191a");
//    private OpenClient openClient = new OpenClient("http://127.0.0.1:18080", "20110947", "db962af04d5dbbd5bcac6041e82c191a");

    @Test
    public void employeeTest() {
//        EmployeeGetRequest employeeGetRequest = new EmployeeGetRequest();
//        employeeGetRequest.setMobile("13711111111");
//        EmployeeGetResp employeeGetResp = openClient.employeeApi().get(employeeGetRequest);
//        System.out.println(employeeGetResp);

        EmployeeBatchSyncRequest employeeBatchSyncRequest = new EmployeeBatchSyncRequest();
        List<EmployeeInfo> employeeList = new ArrayList<>();
        employeeBatchSyncRequest.setEmployeeList(employeeList);
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeList.add(employeeInfo);
        employeeInfo.setCode("xcxcxccc");
        employeeInfo.setName("xxx");
        employeeInfo.setMobile("13167019222");
        String synchronize = openClient.employeeApi().batchSynchronize(employeeBatchSyncRequest);
        System.out.println(synchronize);
    }

    @Test
    public void departmentGet() {
        DepartmentGetHierarchyRequest departmentGetHierarchyRequest = new DepartmentGetHierarchyRequest();
        DepartmentGetHierarchyResp departmentGetHierarchyResp = openClient.departmentApi().getHierarchy(departmentGetHierarchyRequest);
        DepartmentGetRequest departmentGetRequest = new DepartmentGetRequest();
        departmentGetRequest.setDeptCode(departmentGetHierarchyResp.get("basic").get(0).getDeptCode());
        DepartmentResp departmentResp = openClient.departmentApi().get(departmentGetRequest);
        assertNotNull(departmentResp);
        assertEquals(departmentResp.getName(), "li开放平台企业05");
        System.out.println(departmentResp);
    }

}