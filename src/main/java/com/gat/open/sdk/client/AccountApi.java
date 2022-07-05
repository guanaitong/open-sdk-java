/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.account.EnterpriseAccountApplyChargeRequest;
import com.gat.open.sdk.model.account.EnterpriseAccountApplyChargeResp;

/**
 * Created by August.Zhou on 2022/6/27 13:51
 */
public class AccountApi {
    private final OpenClient openClient;

    AccountApi(OpenClient openClient) {
        this.openClient = openClient;
    }

    public EnterpriseAccountApplyChargeResp applyCharge(EnterpriseAccountApplyChargeRequest enterpriseAccountApplyChargeRequest) {
        return this.openClient.postFormWithAuth("/enterprise/account/applyCharge", enterpriseAccountApplyChargeRequest);
    }
}
