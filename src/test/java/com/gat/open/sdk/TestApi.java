package com.gat.open.sdk;


import com.gat.open.sdk.model.ApiResponse;
import com.gat.open.sdk.model.Employee;
import com.gat.open.sdk.model.EnterpriseAccount;
import com.gat.open.sdk.model.bo.EmployeeBO;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;

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
        gatOpen = new GATOpen("20110748", "2441c671a89a680bd6b548b59e82a1f4", "https://openapi.guanaitong.cc");
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
        Assert.assertEquals(response.getData(),corpCode.toUpperCase());
    }

    public void testUpdateEmployee() {
        EmployeeBO employeeBO = new EmployeeBO();
        employeeBO.setMobile("19988889512");
        employeeBO.setName("陈成");
        employeeBO.setCorp_code("201803131840");
        ApiResponse<String> response = gatOpen.updateEmployee(employeeBO, null);
        System.out.println("response = " + response);
    }

    public void testEmployee() {
        ApiResponse<Employee> employee = gatOpen.getEmployee("M020005");
        Assert.assertNotNull(employee);
        System.out.println(employee);
        System.out.println(gatOpen.batchEmployee(1, 14));
        System.out.println(gatOpen.accountEmployee("OP020430"));
        System.out.println(gatOpen.resignEmployee("OP020430"));
        System.out.println(gatOpen.restoreEmployee("OP020430"));
        System.out.println(gatOpen.getEmployee("OP020430"));
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

}
