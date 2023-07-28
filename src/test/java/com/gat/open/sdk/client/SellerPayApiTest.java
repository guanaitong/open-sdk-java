package com.gat.open.sdk.client;

import com.gat.open.sdk.model.seller.SellerRefundV3Request;
import org.junit.Test;

public class SellerPayApiTest {
    private OpenClient openClient = Clients.openClient;

    @Test
    public void syncRefund() {
        openClient.sellerPayApi().syncRefundV3(new SellerRefundV3Request());
    }
}
