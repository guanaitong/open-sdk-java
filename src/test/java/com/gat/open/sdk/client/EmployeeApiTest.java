/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.Pagination;
import com.gat.open.sdk.model.department.DepartmentBatchSynchronizeBody;
import com.gat.open.sdk.model.department.DepartmentBatchSynchronizeRequest;
import com.gat.open.sdk.model.department.DepartmentGetHierarchyRequest;
import com.gat.open.sdk.model.department.DepartmentGetHierarchyResp;
import com.gat.open.sdk.model.department.DepartmentGetRequest;
import com.gat.open.sdk.model.department.DepartmentResp;
import com.gat.open.sdk.model.employee.EmployeeAttributeGetRequest;
import com.gat.open.sdk.model.employee.EmployeeAttributeGetResp;
import com.gat.open.sdk.model.employee.EmployeeBatchGetRequest;
import com.gat.open.sdk.model.employee.EmployeeBatchGetResp;
import com.gat.open.sdk.model.employee.EmployeeGetByDepartmentCodeRequest;
import com.gat.open.sdk.model.employee.EmployeeGetCountByDepartmentCodeRequest;
import com.gat.open.sdk.model.employee.EmployeeGetRequest;
import com.gat.open.sdk.model.employee.EmployeeGetResp;
import com.gat.open.sdk.util.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by August.Zhou on 2022/6/27 14:21
 */
public class EmployeeApiTest {


    private OpenClient openClient = Clients.openClient;

    @Test
    public void employeeTest() {
        EmployeeGetRequest employeeGetRequest = new EmployeeGetRequest();
        employeeGetRequest.setMobile("14253142358");
        EmployeeGetResp employeeGetResp = openClient.employeeApi().get(employeeGetRequest);
        System.out.println(employeeGetResp);

        /*EmployeeBatchSyncRequest employeeBatchSyncRequest = new EmployeeBatchSyncRequest();
        List<EmployeeInfo> employeeList = new ArrayList<>();
        employeeBatchSyncRequest.setEmployeeList(employeeList);
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeList.add(employeeInfo);
        employeeInfo.setCode("xcxcxccc");
        employeeInfo.setName("xxx");
        employeeInfo.setMobile("13167019222");
        String synchronize = openClient.employeeApi().batchSynchronize(employeeBatchSyncRequest);
        System.out.println(synchronize);*/
    }

    @Test
    public void employeeAddTest() {
        /*EmployeeAddRequest employeeAddRequest = new EmployeeAddRequest();
        employeeAddRequest.setUserId("tom0001");
        employeeAddRequest.setCode("tom0001");
        employeeAddRequest.setName("tom0001");
        employeeAddRequest.setGender(1);
        employeeAddRequest.setMobile("16898989090");
        employeeAddRequest.setEmail("16898989090@tom.com");
        employeeAddRequest.setBirthDay("1990-06-05");
        employeeAddRequest.setEntryDay("2022-06-29");
        employeeAddRequest.setCardType(1);
        employeeAddRequest.setCardNo("110101199003070919");
        employeeAddRequest.setRemark("test");

        String add = openClient.employeeApi().add(employeeAddRequest);
        System.out.println(add);*/

        /*EmployeeUpdateRequest employeeUpdateRequest = new EmployeeUpdateRequest();
        employeeUpdateRequest.setUserId("tom0001");
        ArrayList<String> category = new ArrayList<>();
        category.add("帅哥组");
        employeeUpdateRequest.setCategory(category);
        employeeUpdateRequest.setLevel("金丹");
        employeeUpdateRequest.setGender(2);
        employeeUpdateRequest.setBirthDay("1990-06-05");
        employeeUpdateRequest.setEntryDay("2022-06-29");
        employeeUpdateRequest.setCode("tom0002");
        employeeUpdateRequest.setMobile("16898989091");
        ArrayList<EmployeeAttribute> employeeAttribute = new ArrayList<>();
        EmployeeAttribute e = new EmployeeAttribute();
        e.setAttributeCode("politicalVisage");
        e.setAttributeValue("群众");
        employeeAttribute.add(e);
        employeeUpdateRequest.setEmployeeAttribute(employeeAttribute);
        openClient.employeeApi().update(employeeUpdateRequest);

        EmployeeResignRequest employeeResignRequest = new EmployeeResignRequest();
        employeeResignRequest.setUserId("tom0001");

        openClient.employeeApi().resign(employeeResignRequest);*/

        /*EmployeeRestoreRequest employeeRestoreRequest = new EmployeeRestoreRequest();
        employeeRestoreRequest.setUserId("tom0001");

        openClient.employeeApi().restore(employeeRestoreRequest);*/

        EmployeeGetByDepartmentCodeRequest employeeGetByDepartmentCodeRequest = new EmployeeGetByDepartmentCodeRequest();
        employeeGetByDepartmentCodeRequest.setDeptCode("TomCompany_第二个部门");
        List<EmployeeGetResp> employeeGetRespList = openClient.employeeApi().getByDepartmentCode(employeeGetByDepartmentCodeRequest);
        System.out.println(JSON.toJSONString(employeeGetRespList));

        EmployeeGetCountByDepartmentCodeRequest employeeGetCountByDepartmentCodeRequest = new EmployeeGetCountByDepartmentCodeRequest();
        employeeGetCountByDepartmentCodeRequest.setDeptCode("TomCompany_第二个部门");
        Integer countByDepartmentCode = openClient.employeeApi().getCountByDepartmentCode(employeeGetCountByDepartmentCodeRequest);
        System.out.println(countByDepartmentCode);

        EmployeeAttributeGetRequest employeeAttributeGetRequest = new EmployeeAttributeGetRequest();
        employeeAttributeGetRequest.setUserId("tom0001");

        List<EmployeeAttributeGetResp> attributeGetRespList = openClient.employeeApi().getAttribute(employeeAttributeGetRequest);
        System.out.println(JSON.toJSONString(attributeGetRespList));

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

    @Test
    public void batchGetEmployeeTest() {
        EmployeeBatchGetRequest employeeBatchGetRequest = new EmployeeBatchGetRequest();
        Pagination<EmployeeBatchGetResp> employeeBatchGetRespPagination = openClient.employeeApi().batchGetEmployee(employeeBatchGetRequest);
        System.out.println(JSON.toJSONString(employeeBatchGetRespPagination));
    }

    @Test
    public void batchSynchronizeDeptTest() {
        List<DepartmentBatchSynchronizeBody> departmentBatchSynchronizeBodyList = new ArrayList<>();
        DepartmentBatchSynchronizeBody departmentBatchSynchronizeBody = new DepartmentBatchSynchronizeBody();
        departmentBatchSynchronizeBody.setDeptCode("TOM071201");
        departmentBatchSynchronizeBody.setName("TOM071201");
//        departmentBatchSynchronizeBody.setStatus(1);
        departmentBatchSynchronizeBodyList.add(departmentBatchSynchronizeBody);
        DepartmentBatchSynchronizeRequest departmentBatchSynchronizeRequest = new DepartmentBatchSynchronizeRequest(departmentBatchSynchronizeBodyList);
        String batchSynchronize = openClient.departmentApi().batchSynchronize(departmentBatchSynchronizeRequest);
        System.out.println(batchSynchronize);
    }

}