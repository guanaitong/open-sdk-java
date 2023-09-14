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

import java.util.List;

/**
 * Created by August.Zhou on 2022/6/27 13:51
 */
public class ActivityApi {
    private final OpenClient openClient;

    ActivityApi(OpenClient openClient) {
        this.openClient = openClient;
    }

    public List<EnterpriseActivityFindResp> findEnterpriseActivity(EnterpriseActivityFindRequest enterpriseActivityFindRequest) {
        return this.openClient.postFormWithAuth("/enterprise/activity/find", enterpriseActivityFindRequest);
    }

    public List<EnterpriseActivityAssetsGetResp> getEnterpriseActivityAssets(EnterpriseActivityAssetsGetRequest enterpriseActivityAssetsGetRequest) {
        return this.openClient.postFormWithAuth("/enterprise/activity/assets", enterpriseActivityAssetsGetRequest);
    }

    public String assignActivity(EnterpriseActivityAssignRequest enterpriseActivityAssignRequest) {
        return this.openClient.postFormWithAuth("/enterprise/activity/assign", enterpriseActivityAssignRequest);
    }
}
