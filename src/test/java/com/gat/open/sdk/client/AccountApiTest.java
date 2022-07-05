/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.account.EnterpriseAccountApplyChargeRequest;
import com.gat.open.sdk.model.account.EnterpriseAccountApplyChargeResp;
import com.gat.open.sdk.util.JSON;
import org.junit.Test;

import java.math.BigDecimal;

public class AccountApiTest {
    private OpenClient openClient = Clients.openClient;

    @Test
    public void applyChargeTest() {
        EnterpriseAccountApplyChargeRequest enterpriseAccountApplyChargeRequest = new EnterpriseAccountApplyChargeRequest();
        enterpriseAccountApplyChargeRequest.setAccountOpenid("8c5a592ddb7fbd705c44a60f535b31c0");
        enterpriseAccountApplyChargeRequest.setAmount(new BigDecimal("10000"));
        enterpriseAccountApplyChargeRequest.setExternalCode("201106612022070500000000000002");
        enterpriseAccountApplyChargeRequest.setTaxpayer("王纳税");
        enterpriseAccountApplyChargeRequest.setServiceProvider(1);
        EnterpriseAccountApplyChargeResp enterpriseAccountApplyChargeResp = openClient.accountApi().applyCharge(enterpriseAccountApplyChargeRequest);
        System.out.println(JSON.toJSONString(enterpriseAccountApplyChargeResp));
    }
}
