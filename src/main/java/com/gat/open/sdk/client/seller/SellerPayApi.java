package com.gat.open.sdk.client.seller;

import com.gat.open.sdk.client.OpenClient;
import com.gat.open.sdk.model.seller.SellerRefundV3Request;

public class SellerPayApi {
    private final OpenClient openClient;

    public SellerPayApi(OpenClient openClient) {
        this.openClient = openClient;
    }

    public String syncRefundV3(SellerRefundV3Request sellerRefundV3Request){
        return openClient.postJsonWithAuth("/seller/v3/pay/syncRefund", sellerRefundV3Request);
    }
}
