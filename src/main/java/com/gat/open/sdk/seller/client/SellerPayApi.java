package com.gat.open.sdk.seller.client;

import com.gat.open.sdk.client.OpenClient;
import com.gat.open.sdk.seller.model.ExcashierV3Request;
import com.gat.open.sdk.seller.model.ExcashierV3Response;
import com.gat.open.sdk.seller.model.SellerRefundV3Request;

import java.util.Objects;

public class SellerPayApi {
    private final SellerTestOpenClient sellerTestOpenClient;
    private final OpenClient openClient;

    public SellerPayApi(SellerTestOpenClient sellerTestOpenClient) {
        this.sellerTestOpenClient = sellerTestOpenClient;
        openClient = null;
    }

    public SellerPayApi(OpenClient openClient) {
        this.openClient = openClient;
        sellerTestOpenClient = null;
    }

    public String syncRefundV3(SellerRefundV3Request sellerRefundV3Request) {
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth("/seller/v3/pay/syncRefund", sellerRefundV3Request);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth("/seller/v3/pay/syncRefund", sellerRefundV3Request);
    }

    public ExcashierV3Response excashierV3(ExcashierV3Request excashierV3Request) {
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth("/seller/v3/pay/excashier", excashierV3Request);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth("/seller/v3/pay/excashier", excashierV3Request);
    }
}
