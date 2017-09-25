package com.gat.open.sdk;

import com.gat.open.sdk.constant.GATOpenConstant;
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

    protected void setUp(){
        gatOpen = new GATOpen("20110638", "6a90df207ba38c7085d34872e4ca96af","http://openapi.guanaitong.dev");
    }

    public void testToken(){
        String token = gatOpen.createToken().getData().getAccessToken();
        Assert.assertNotNull(token);
        Assert.assertNotNull(gatOpen.getTokenInfo(token).getData().getAccessToken());
    }

    public void testLogin(){
        ApiResponse<String> result = gatOpen.loginByMobile("15629052307");
        System.out.println(gatOpen.loginByCorpCode("OP020430"));
        Assert.assertNotNull(result);
        System.out.println(result);
    }

    public void testEmployee(){
        ApiResponse<Employee> employee = gatOpen.getEmployee("SX011111");
        Assert.assertNotNull(employee);
//        System.out.println(gatOpen.batchEmployee(1,14));
//        System.out.println(gatOpen.accountEmployee("OP020430"));
//        System.out.println(gatOpen.resignEmployee("OP020430"));
//        System.out.println(gatOpen.restoreEmployee("OP020430"));
        System.out.println(employee);
    }

    public void testEnterprise(){
        ApiResponse<List<EnterpriseAccount>> account = gatOpen.enterpriseAccount(null, null);
        System.out.println(gatOpen.limitStatus("1234"));
        System.out.println(gatOpen.pointStatus("1234"));
        Assert.assertNotNull(account);

        System.out.println(gatOpen.enterpriseAccount("LnrfDJ8J1dHBrhFPOy9pBw==",3));
        System.out.println(account);
    }

    public void testHelper(){
        ApiResponse<String> check = gatOpen.helperCheck("20110634");
        Assert.assertNotNull(check);
        System.out.println(check);
    }


}
