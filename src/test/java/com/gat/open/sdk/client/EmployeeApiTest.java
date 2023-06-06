/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.Pagination;
import com.gat.open.sdk.model.department.DepartmentBatchSetManagerRequest;
import com.gat.open.sdk.model.department.DepartmentBatchSetParentRequest;
import com.gat.open.sdk.model.department.DepartmentBatchSynchronizeRequest;
import com.gat.open.sdk.model.department.DepartmentGetBatchResultRequest;
import com.gat.open.sdk.model.department.DepartmentGetBatchResultResp;
import com.gat.open.sdk.model.department.DepartmentGetHierarchyRequest;
import com.gat.open.sdk.model.department.DepartmentGetHierarchyResp;
import com.gat.open.sdk.model.department.DepartmentGetRequest;
import com.gat.open.sdk.model.department.DepartmentResp;
import com.gat.open.sdk.model.department.DepartmentTransferEmployeeRequest;
import com.gat.open.sdk.model.employee.EmployeeAddRequest;
import com.gat.open.sdk.model.employee.EmployeeAttribute;
import com.gat.open.sdk.model.employee.EmployeeBatchGetRequest;
import com.gat.open.sdk.model.employee.EmployeeBatchGetResp;
import com.gat.open.sdk.model.employee.EmployeeBatchSyncRequest;
import com.gat.open.sdk.model.employee.EmployeeInfo;
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
        /*EmployeeGetRequest employeeGetRequest = new EmployeeGetRequest();
        employeeGetRequest.setMobile("16898989110");
        EmployeeGetResp employeeGetResp = openClient.employeeApi().get(employeeGetRequest);
        System.out.println(JSON.toJSONString(employeeGetResp));*/

        EmployeeBatchSyncRequest employeeBatchSyncRequest = new EmployeeBatchSyncRequest();
        List<EmployeeInfo> employeeList = new ArrayList<>();
        employeeBatchSyncRequest.setEmployeeList(employeeList);
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setUserId("99992368");
        employeeInfo.setCode("99992368");
        employeeInfo.setName("吴圳");
        employeeInfo.setStatus(1);
//        employeeInfo.setGender(1);

//        employeeInfo.setDeptCode("TOM071201");
//        employeeInfo.setMobile("16898989113");
        /*employeeInfo.setMobileArea("86");
        employeeInfo.setEmail("168989890903@tom.com");
        employeeInfo.setBirthDay("1990-08-05");
        employeeInfo.setEntryDay("2022-06-29");
        employeeInfo.setCardType(1);
        ArrayList<String> category = new ArrayList<>();
        category.add("帅哥组");
        category.add("靓妹组");
        employeeInfo.setCategory(String.join(",", category));
        employeeInfo.setCardNo("110101199003070919");
        employeeInfo.setRemark("test");
        employeeInfo.setLevel("金丹");
        ArrayList<EmployeeAttribute> employeeAttribute = new ArrayList<>();
        EmployeeAttribute e = new EmployeeAttribute();
        e.setAttributeCode("politicalVisage");
        e.setAttributeValue("群众");
        employeeAttribute.add(e);
        employeeInfo.setEmployeeAttribute(JSON.toJSONString(employeeAttribute));*/

        employeeList.add(employeeInfo);

        EmployeeInfo employeeInfo2 = new EmployeeInfo();
        employeeInfo2.setUserId("99992158");
        employeeInfo2.setCode("99992158");
        employeeInfo2.setName("王维中");
        employeeInfo2.setStatus(1);
        employeeList.add(employeeInfo2);

        EmployeeInfo employeeInfo3 = new EmployeeInfo();
        employeeInfo3.setUserId("99995695");
        employeeInfo3.setCode("99995695");
        employeeInfo3.setName("钟劼");
        employeeInfo3.setStatus(1);
        employeeList.add(employeeInfo3);

        EmployeeInfo employeeInfo4 = new EmployeeInfo();
        employeeInfo4.setUserId("10114036");
        employeeInfo4.setCode("10114036");
        employeeInfo4.setName("张小宾");
        employeeInfo4.setStatus(1);
        employeeList.add(employeeInfo4);
        String synchronize = openClient.employeeApi().batchSynchronize(employeeBatchSyncRequest);
        System.out.println(synchronize);
    }

    @Test
    public void employeeAddTest() {
        EmployeeAddRequest employeeAddRequest = new EmployeeAddRequest();
//        employeeAddRequest.setEnterpriseCode("1990");
        employeeAddRequest.setUserId("83000019");
        employeeAddRequest.setCode("83000019");
        employeeAddRequest.setName("EREJER CRISNEL,EREJER CRISNEL");
        employeeAddRequest.setGender(1);
        employeeAddRequest.setDeptCode("100121210044");
        /*employeeAddRequest.setMobile("16898989120");
        employeeAddRequest.setMobileArea("86");
        employeeAddRequest.setEmail("HB102401@tom.com");
        employeeAddRequest.setBirthDay("1990-07-05");
        employeeAddRequest.setEntryDay("2022-06-29");
        employeeAddRequest.setCardType(1);
        ArrayList<String> category = new ArrayList<>();
        category.add("帅哥组");
        employeeAddRequest.setCategory(category);
        employeeAddRequest.setCardNo("110101199003070919");
        employeeAddRequest.setRemark("test");
        employeeAddRequest.setLevel("金丹");
        ArrayList<EmployeeAttribute> employeeAttribute = new ArrayList<>();
        EmployeeAttribute e = new EmployeeAttribute();
        e.setAttributeCode("politicalVisage");
        e.setAttributeValue("群众");
        employeeAttribute.add(e);
        employeeAddRequest.setEmployeeAttribute(employeeAttribute);*/

        String add = openClient.employeeApi().add(employeeAddRequest);
        System.out.println(add);

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

        /*EmployeeGetByDepartmentCodeRequest employeeGetByDepartmentCodeRequest = new EmployeeGetByDepartmentCodeRequest();
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
        System.out.println(JSON.toJSONString(attributeGetRespList));*/

    }

    @Test
    public void departmentGet() {
        DepartmentGetHierarchyRequest departmentGetHierarchyRequest = new DepartmentGetHierarchyRequest();
        DepartmentGetHierarchyResp departmentGetHierarchyResp = openClient.departmentApi().getHierarchy(departmentGetHierarchyRequest);
        DepartmentGetRequest departmentGetRequest = new DepartmentGetRequest();
        departmentGetRequest.setDeptCode(departmentGetHierarchyResp.get("basic").get(0).getDeptCode());
        DepartmentResp departmentResp = openClient.departmentApi().get(departmentGetRequest);
        assertNotNull(departmentResp);
        assertEquals(departmentResp.getName(), "Tomcampany1");
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
        List<DepartmentBatchSynchronizeRequest.DepartmentBatchSynchronizeBody> departmentBatchSynchronizeBodyList = new ArrayList<>();
        DepartmentBatchSynchronizeRequest.DepartmentBatchSynchronizeBody departmentBatchSynchronizeBody = new DepartmentBatchSynchronizeRequest.DepartmentBatchSynchronizeBody();
        departmentBatchSynchronizeBody.setDeptCode("TOM071202");
        departmentBatchSynchronizeBody.setName("TOM071202");
//        departmentBatchSynchronizeBody.setStatus(1);
        departmentBatchSynchronizeBodyList.add(departmentBatchSynchronizeBody);
        DepartmentBatchSynchronizeRequest departmentBatchSynchronizeRequest = new DepartmentBatchSynchronizeRequest(departmentBatchSynchronizeBodyList);
        departmentBatchSynchronizeRequest.setEnterpriseCode("19998888");
        String batchSynchronize = openClient.departmentApi().batchSynchronize(departmentBatchSynchronizeRequest);
        System.out.println(batchSynchronize);
    }

    @Test
    public void getDepartmentBatchResultTest() {
        DepartmentGetBatchResultRequest departmentGetBatchResultRequest = new DepartmentGetBatchResultRequest();
        departmentGetBatchResultRequest.setBatchNum("USERDOOR_BATCH_IM_DM_a802d12a240f125626d7640642881928");
        DepartmentGetBatchResultResp departmentBatchResult = openClient.departmentApi().getDepartmentBatchResult(departmentGetBatchResultRequest);
        System.out.println(JSON.toJSONString(departmentBatchResult));
    }

    @Test
    public void batchSetParentDeptTest() {
        List<DepartmentBatchSetParentRequest.DepartmentBatchSetParentBody> departmentBatchSynchronizeBodyList = new ArrayList<>();
        DepartmentBatchSetParentRequest.DepartmentBatchSetParentBody departmentBatchSynchronizeBody = new DepartmentBatchSetParentRequest.DepartmentBatchSetParentBody();
        departmentBatchSynchronizeBody.setDeptCode("TOM071202");
        departmentBatchSynchronizeBody.setParentCode("TOM071201");
        departmentBatchSynchronizeBodyList.add(departmentBatchSynchronizeBody);
        DepartmentBatchSetParentRequest departmentBatchSynchronizeRequest = new DepartmentBatchSetParentRequest(departmentBatchSynchronizeBodyList);
        String batchSynchronize = openClient.departmentApi().batchSetParent(departmentBatchSynchronizeRequest);
        System.out.println(batchSynchronize);
    }

    @Test
    public void departmentBatchSetManagerRequestTest() {
        List<DepartmentBatchSetManagerRequest.DepartmentBatchSetManagerBody> departmentBatchSynchronizeBodyList = new ArrayList<>();
        DepartmentBatchSetManagerRequest.DepartmentBatchSetManagerBody departmentBatchSynchronizeBody = new DepartmentBatchSetManagerRequest.DepartmentBatchSetManagerBody();
        departmentBatchSynchronizeBody.setDeptCode("TOM071202");
        departmentBatchSynchronizeBody.setManagerCode("TOM0002");
        departmentBatchSynchronizeBodyList.add(departmentBatchSynchronizeBody);
        DepartmentBatchSetManagerRequest departmentBatchSynchronizeRequest = new DepartmentBatchSetManagerRequest(departmentBatchSynchronizeBodyList);
        String batchSynchronize = openClient.departmentApi().batchSetManager(departmentBatchSynchronizeRequest);
        System.out.println(batchSynchronize);
    }

    @Test
    public void deptTransferEmployeeTest() {
        DepartmentTransferEmployeeRequest departmentTransferEmployeeRequest = new DepartmentTransferEmployeeRequest();
        departmentTransferEmployeeRequest.setSourceDeptCode("TomCompany");
        departmentTransferEmployeeRequest.setTargetDeptCode("TOM071202");
        /*Boolean s = openClient.departmentApi().transferEmployee(departmentTransferEmployeeRequest);
        System.out.println(s);*/
    }

    @Test
    public void deptAddTest() {
        /*DepartmentAddRequest departmentAddRequest = new DepartmentAddRequest();
        departmentAddRequest.setDeptCode("DEPT_0825_03");
        departmentAddRequest.setName("DEPT_0825_03");
        departmentAddRequest.setParentCode("DEPT_0825_01");

        String data = openClient.departmentApi().add(departmentAddRequest);
        System.out.println(data);*/
        /*
        DepartmentUpdateRequest departmentUpdateRequest = new DepartmentUpdateRequest();
        departmentUpdateRequest.setDeptCode("DEPT_0825_02");
        departmentUpdateRequest.setName("DEPT_0825_02+01");
        departmentUpdateRequest.setManagerUserid("tom082401");
        String data = openClient.departmentApi().update(departmentUpdateRequest);
        System.out.println(data);*/

        DepartmentGetRequest departmentGetRequest = new DepartmentGetRequest();
        departmentGetRequest.setDeptCode("DEPT_0825_02");
        DepartmentResp departmentResp = openClient.departmentApi().get(departmentGetRequest);
        System.out.println(JSON.toJSONString(departmentResp));
    }

}