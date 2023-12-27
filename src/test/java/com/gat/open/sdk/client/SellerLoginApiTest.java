/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.seller.client.SellerTestOpenClient;
import com.gat.open.sdk.seller.model.response.PersonAssetsResponse;
import com.gat.open.sdk.seller.model.response.PersonDetailResponse;
import com.gat.open.sdk.seller.model.response.SellerLoginAuthResponse;
import com.gat.open.sdk.seller.model.request.PersonAssetsRequest;
import com.gat.open.sdk.seller.model.request.PersonDetailRequest;
import com.gat.open.sdk.seller.model.request.SellerLoginAuthRequest;
import com.gat.open.sdk.util.JSON;
import org.junit.Test;

public class SellerLoginApiTest {
    //    private SellerOpenClient openClient = new SellerOpenClient("http://127.0.0.1:19090", "http://127.0.0.1:18888", "25001782", "f72c0aeb74630c760a9bbf9c01b9acf4");
    private SellerTestOpenClient sellerTestOpenClient = new SellerTestOpenClient("https://openapi.guanaitong.tech", "http://127.0.0.1:18888", "15003994", "60933dd0a828ab920439d6b52b5b6e98");
//    private OpenClient openClient = new OpenClient("https://openapi.guanaitong.tech", "20110752", "f8d4c27e3120dac4f1df6da0f6f09487");


    @Test
    public void auth() {

        SellerLoginAuthRequest sellerLoginAuthRequest = new SellerLoginAuthRequest();
        sellerLoginAuthRequest.setAuthCode("11111");
        SellerLoginAuthResponse authCode = sellerTestOpenClient.sellerLoginApi().getByAuthCode(sellerLoginAuthRequest);
        System.out.println(JSON.toJSONString(authCode));
    }

    @Test
    public void detail() {

        PersonDetailRequest personDetailRequest = new PersonDetailRequest();
        personDetailRequest.setOpenId("52f838b668524ffb06cd6fce95b91632");
        PersonDetailResponse detail = sellerTestOpenClient.sellerLoginApi().getDetailByOpenId(personDetailRequest);
        System.out.println(JSON.toJSONString(detail));
    }

    @Test
    public void assets() {

        PersonAssetsRequest personAssetsRequest = new PersonAssetsRequest();
        personAssetsRequest.setOpenId("52f838b668524ffb06cd6fce95b91632");
        PersonAssetsResponse personAssets = sellerTestOpenClient.sellerLoginApi().getPersonAssets(personAssetsRequest);
        System.out.println(JSON.toJSONString(personAssets));
    }
}
