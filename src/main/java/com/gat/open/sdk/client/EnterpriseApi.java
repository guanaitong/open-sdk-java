/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.enterprise.AppSubscribeRequest;
import com.gat.open.sdk.model.enterprise.AppUnSubscribeRequest;
import com.gat.open.sdk.model.enterprise.FindEnterpriseSettingRequest;
import com.gat.open.sdk.model.enterprise.ThirdSyncSettingResponse;

public class EnterpriseApi {

    private final OpenClient openClient;

    EnterpriseApi(OpenClient openClient) {
        this.openClient = openClient;
    }

    public String subscribe(AppSubscribeRequest appSubscribeRequest) {
        return openClient.postFormWithAuth("/enterprise/app/subscribe", appSubscribeRequest);
    }

    public Boolean unsubscribe(AppUnSubscribeRequest unSubscribeRequest) {
        return openClient.postFormWithAuth("/enterprise/app/unsubscribe", unSubscribeRequest);
    }

    public ThirdSyncSettingResponse findSetting(FindEnterpriseSettingRequest addEnterpriseSettingRequest) {
        return openClient.postFormWithAuth("/enterprise/setting/find", addEnterpriseSettingRequest);
    }
}
