/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.activity.EnterpriseActivityAssetsGetRequest;
import com.gat.open.sdk.model.activity.EnterpriseActivityAssetsGetResp;
import com.gat.open.sdk.model.activity.EnterpriseActivityAssignRequest;
import com.gat.open.sdk.model.activity.EnterpriseActivityFindRequest;
import com.gat.open.sdk.model.activity.EnterpriseActivityFindResp;
import com.gat.open.sdk.util.JSON;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ActivityApiTest {
    private OpenClient openClient = Clients.openClient;

    @Test
    public void findEnterpriseActivityTest() {
        EnterpriseActivityFindRequest enterpriseActivityFindRequest = new EnterpriseActivityFindRequest();
        enterpriseActivityFindRequest.setProductCategory(10);
        List<EnterpriseActivityFindResp> enterpriseActivity = openClient.activityApi().findEnterpriseActivity(enterpriseActivityFindRequest);
        System.out.println(JSON.toJSONString(enterpriseActivity));
    }

    @Test
    public void getEnterpriseActivityAssetsTest() {
        EnterpriseActivityAssetsGetRequest enterpriseActivityAssetsGetRequest = new EnterpriseActivityAssetsGetRequest();
        enterpriseActivityAssetsGetRequest.setActivityId(2098L);
        List<EnterpriseActivityAssetsGetResp> enterpriseActivityAssets = openClient.activityApi().getEnterpriseActivityAssets(enterpriseActivityAssetsGetRequest);
        System.out.println(JSON.toJSONString(enterpriseActivityAssets));
    }

    @Test
    public void assignActivityTest() {
        EnterpriseActivityAssignRequest enterpriseActivityAssignRequest = new EnterpriseActivityAssignRequest();
        enterpriseActivityAssignRequest.setActivityId(2098L);
        enterpriseActivityAssignRequest.setAmount(new BigDecimal("10"));
        enterpriseActivityAssignRequest.setAccountOpenId("8c9022b7dfbd84e7f4102d9b0d3c2745");
        enterpriseActivityAssignRequest.setMode("immediate");
        enterpriseActivityAssignRequest.setExternalCode("20220705000000003");
        ArrayList<String> userIds = new ArrayList<>();
        userIds.add("tom0001");
        enterpriseActivityAssignRequest.setUserIds(userIds);
        enterpriseActivityAssignRequest.setReason("测试活动发放");
//        openClient.activityApi().assignActivity(enterpriseActivityAssignRequest);
    }
}
