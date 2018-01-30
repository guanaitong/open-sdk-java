package com.gat.open.sdk;


import com.gat.open.sdk.model.ApiResponse;
import com.gat.open.sdk.model.Employee;
import com.gat.open.sdk.model.EnterpriseAccount;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;

/**
 * Created by xin.hua on 2017/7/20.
 */
public class ApiTest extends TestCase {

    private GATOpen gatOpen;

    protected void setUp() {
        gatOpen = new GATOpen("20091181", "f915972094db1d42581eb805ca228b23", "https://openapi.guanaitong.com");
    }

    public void testToken() {
        String token = gatOpen.createToken().getData().getAccessToken();
        Assert.assertNotNull(token);
        Assert.assertNotNull(gatOpen.getTokenInfo(token).getData().getAccessToken());
    }

    public void testLogin() {
        ApiResponse<String> result = gatOpen.loginByMobile("15250415236");
        System.out.println(gatOpen.loginByCorpCode("6310"));
        Assert.assertNotNull(result);
        System.out.println(result);
    }

    public void testEmployee() {
        ApiResponse<Employee> employee = gatOpen.getEmployee("M020005");
        Assert.assertNotNull(employee);
        System.out.println(gatOpen.batchEmployee(1, 14));
        System.out.println(gatOpen.accountEmployee("OP020430"));
        System.out.println(gatOpen.resignEmployee("OP020430"));
        System.out.println(gatOpen.restoreEmployee("OP020430"));
        System.out.println(gatOpen.getEmployee("OP020430"));
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


}
