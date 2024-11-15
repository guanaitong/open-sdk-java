package com.gat.open.sdk.client;

import com.gat.open.sdk.model.enterprise.AddEnterpriseSettingRequest;
import com.gat.open.sdk.model.enterprise.FindEnterpriseSettingRequest;
import com.gat.open.sdk.model.enterprise.ThirdSyncSettingResponse;

public class EnterpriseApi {

    private final OpenClient openClient;

    EnterpriseApi(OpenClient openClient) {
        this.openClient = openClient;
    }

    public String addSetting(AddEnterpriseSettingRequest addEnterpriseSettingRequest) {
        return openClient.postFormWithAuth("/enterprise/setting/add", addEnterpriseSettingRequest);
    }

    public ThirdSyncSettingResponse findSetting(FindEnterpriseSettingRequest addEnterpriseSettingRequest) {
        return openClient.postFormWithAuth("/enterprise/setting/find", addEnterpriseSettingRequest);
    }
}
