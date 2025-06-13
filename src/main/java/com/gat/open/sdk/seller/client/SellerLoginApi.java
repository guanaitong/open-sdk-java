/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.client;

import com.gat.open.sdk.client.OpenClient;
import com.gat.open.sdk.seller.model.request.BindNotifyRequest;
import com.gat.open.sdk.seller.model.request.PersonAssetsRequest;
import com.gat.open.sdk.seller.model.request.PersonAvailableBalanceRequest;
import com.gat.open.sdk.seller.model.request.PersonDetailRequest;
import com.gat.open.sdk.seller.model.request.SellerLoginAuthRequest;
import com.gat.open.sdk.seller.model.response.BindNotifyRes;
import com.gat.open.sdk.seller.model.response.PersonAssetsResponse;
import com.gat.open.sdk.seller.model.response.PersonAvailableBalanceResp;
import com.gat.open.sdk.seller.model.response.PersonDetailResponse;
import com.gat.open.sdk.seller.model.response.SellerLoginAuthResponse;

import java.util.Objects;

public class SellerLoginApi {
    private final OpenClient openClient;


    public SellerLoginApi(OpenClient openClient) {
        this.openClient = Objects.requireNonNull(openClient);
    }

    public SellerLoginAuthResponse getByAuthCode(SellerLoginAuthRequest sellerLoginAuthRequest) {
        return openClient.postFormWithAuth("/seller/v3/person/getByAuthCode", sellerLoginAuthRequest);
    }

    public PersonDetailResponse getDetailByOpenId(PersonDetailRequest personDetailRequest) {
        return openClient.postFormWithAuth("/seller/v3/person/getDetailByOpenId", personDetailRequest);
    }

    public PersonAssetsResponse getPersonAssets(PersonAssetsRequest personAssetsRequest) {
        return openClient.postFormWithAuth("/seller/v3/person/assets", personAssetsRequest);
    }

    public PersonAvailableBalanceResp getAvailableBalance(PersonAvailableBalanceRequest personAvailableBalanceRequest) {
        return openClient.postFormWithAuth("/seller/v3/person/getAvailableBalance", personAvailableBalanceRequest);
    }

    public BindNotifyRes bindNotify(BindNotifyRequest bindNotifyRequest) {
        return openClient.postJsonWithAuth("/seller/v3/person/bindNotify", bindNotifyRequest);
    }

    public BindNotifyRes unBindNotify(BindNotifyRequest bindNotifyRequest) {
        return openClient.postJsonWithAuth("/seller/v3/person/unBindNotify", bindNotifyRequest);
    }
}
