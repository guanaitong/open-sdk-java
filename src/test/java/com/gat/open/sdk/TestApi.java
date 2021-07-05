/*
 * Copyright 2007-2021, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.gat.open.sdk.model.ApiResponse;
import com.gat.open.sdk.model.Employee;
import com.gat.open.sdk.model.EnterpriseAccount;
import com.gat.open.sdk.model.bo.EmployeeBO;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

/**
 * Created by xin.hua on 2017/7/20.
 */
public class TestApi extends TestCase {

    private GATOpen gatOpen;


    /**
     * 这个appid,appsecret和baseUrl是一个测试应用的示例,要根据实际情况切换
     * <br/>
     * gatOpen对象最好用单例,推荐用spring管理
     * <br/>
     * 如果第三方公司用分布式部署项目或者多个项目用到同样的appid,请做好access_token的<strong>缓存</strong>,
     * token接口每小时有次数限制
     */
    protected void setUp() {
        gatOpen = new GATOpen("20110704", "827a7120c37f0191c392db9d8355cb19", "https://openapi.guanaitong.tech");
    }

    public void testToken() {
        String token = gatOpen.createToken().getData().getAccessToken();
        Assert.assertNotNull(token);
        Assert.assertNotNull(gatOpen.getTokenInfo(token).getData().getAccessToken());
    }

    public void testAddEmployee() {
        String corpCode = "aC66";
        EmployeeBO employeeBO = new EmployeeBO();
        employeeBO.setMobile("19995678513");
        employeeBO.setName("陈成");
        employeeBO.setCorp_code(corpCode);
        ApiResponse<String> response = gatOpen.addEmployee(employeeBO);
        System.out.println("response = " + response);
        Assert.assertEquals(response.getData(), corpCode.toUpperCase());
    }

    public void testUpdateEmployee() {
        EmployeeBO employeeBO = new EmployeeBO();
        employeeBO.setCorp_code("C002");
        employeeBO.setLevel("1");
        employeeBO.setCategory("1,2");
        employeeBO.setName("陈晓");
        ApiResponse<String> response = gatOpen.updateEmployee(employeeBO, null);
        System.out.println("response = " + response);
    }

    public void testGetEmployee() throws JsonProcessingException {
        ApiResponse<Employee> employee = gatOpen.getEmployee("C002");
        Assert.assertNotNull(employee);
        System.out.println(employee);
    }

    public void testEnterprise() {
        ApiResponse<List<EnterpriseAccount>> account = gatOpen.enterpriseAccount(null, null);
        System.out.println(gatOpen.limitStatus("1234"));
        System.out.println(gatOpen.pointStatus("1234"));
        Assert.assertNotNull(account);

        System.out.println(gatOpen.enterpriseAccount("LnrfDJ8J1dHBrhFPOy9pBw==", 3));
        System.out.println(account);
    }

    public void testHelper() {
        ApiResponse<String> check = gatOpen.helperCheck("20110634");
        Assert.assertNotNull(check);
        System.out.println(check);
    }

    public void testGetHierarchy() {
        ApiResponse<Map<String, Object>> check = gatOpen.getHierarchy(null);
        Assert.assertNotNull(check);
        System.out.println(check);
    }
}
