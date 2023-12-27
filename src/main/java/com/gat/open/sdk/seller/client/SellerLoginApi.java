/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.client;

import com.gat.open.sdk.client.OpenClient;
import com.gat.open.sdk.seller.model.response.PersonAssetsResponse;
import com.gat.open.sdk.seller.model.response.PersonDetailResponse;
import com.gat.open.sdk.seller.model.response.SellerLoginAuthResponse;
import com.gat.open.sdk.seller.model.request.PersonAssetsRequest;
import com.gat.open.sdk.seller.model.request.PersonDetailRequest;
import com.gat.open.sdk.seller.model.request.SellerLoginAuthRequest;

import java.util.Objects;

public class SellerLoginApi {
    private final SellerTestOpenClient sellerTestOpenClient;
    private final OpenClient openClient;

    public SellerLoginApi(SellerTestOpenClient sellerTestOpenClient) {
        this.sellerTestOpenClient = sellerTestOpenClient;
        openClient = null;
    }

    public SellerLoginApi(OpenClient openClient) {
        this.openClient = openClient;
        sellerTestOpenClient = null;
    }

    public SellerLoginAuthResponse getByAuthCode(SellerLoginAuthRequest sellerLoginAuthRequest) {
        String path = "/seller/v3/person/getByAuthCode";
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postFormWithAuth(path, sellerLoginAuthRequest);
        }

        return Objects.isNull(openClient) ? null : openClient.postFormWithAuth(path, sellerLoginAuthRequest);
    }

    public PersonDetailResponse getDetailByOpenId(PersonDetailRequest personDetailRequest) {
        String path = "/seller/v3/person/getDetailByOpenId";
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postFormWithAuth(path, personDetailRequest);
        }

        return Objects.isNull(openClient) ? null : openClient.postFormWithAuth(path, personDetailRequest);
    }

    public PersonAssetsResponse getPersonAssets(PersonAssetsRequest personAssetsRequest) {
        String path = "/seller/v3/person/assets";
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postFormWithAuth(path, personAssetsRequest);
        }

        return Objects.isNull(openClient) ? null : openClient.postFormWithAuth(path, personAssetsRequest);
    }
}
