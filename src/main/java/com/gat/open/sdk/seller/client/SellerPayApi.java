/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.client;

import com.gat.open.sdk.client.OpenClient;
import com.gat.open.sdk.seller.model.request.CompleteOrderV3Request;
import com.gat.open.sdk.seller.model.request.DebitPayV3Request;
import com.gat.open.sdk.seller.model.request.ExcashierV3Request;
import com.gat.open.sdk.seller.model.request.GetCashierUrlV3Request;
import com.gat.open.sdk.seller.model.request.GetPayResultV3Request;
import com.gat.open.sdk.seller.model.request.GetRefundResultV3Request;
import com.gat.open.sdk.seller.model.request.RefundV3Request;
import com.gat.open.sdk.seller.model.request.SellerRefundV3Request;
import com.gat.open.sdk.seller.model.response.CompleteOrderV3Response;
import com.gat.open.sdk.seller.model.response.DebitPayV3Response;
import com.gat.open.sdk.seller.model.response.ExcashierV3Response;
import com.gat.open.sdk.seller.model.response.GetCashierUrlV3Response;
import com.gat.open.sdk.seller.model.response.GetPayResultV3Response;
import com.gat.open.sdk.seller.model.response.GetRefundResultV3Response;
import com.gat.open.sdk.seller.model.response.RefundV3Response;

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

    @Deprecated
    public String syncRefundV3(SellerRefundV3Request sellerRefundV3Request) {
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth("/seller/v3/pay/syncRefund", sellerRefundV3Request);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth("/seller/v3/pay/syncRefund", sellerRefundV3Request);
    }

    @Deprecated
    public ExcashierV3Response excashierV3(ExcashierV3Request excashierV3Request) {
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth("/seller/v3/pay/excashier", excashierV3Request);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth("/seller/v3/pay/excashier", excashierV3Request);
    }

    public GetCashierUrlV3Response getCashierUrlV3(GetCashierUrlV3Request getCashierUrlV3Request) {
        String path = "/seller/v3/pay/getCashierUrl";
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth(path, getCashierUrlV3Request);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth(path, getCashierUrlV3Request);
    }

    public RefundV3Response refundV3(RefundV3Request refundV3Request) {
        String path = "/seller/v3/pay/refund";
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth(path, refundV3Request);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth(path, refundV3Request);
    }

    public DebitPayV3Response debitPayV3(DebitPayV3Request debitPayV3Request) {
        String path = "/seller/v3/pay/debitPay";
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth(path, debitPayV3Request);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth(path, debitPayV3Request);
    }

    public CompleteOrderV3Response completeOrderV3(CompleteOrderV3Request completeOrderV3Request) {
        String path = "/seller/v3/pay/complete";
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth(path, completeOrderV3Request);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth(path, completeOrderV3Request);
    }

    public GetPayResultV3Response getResultV3(GetPayResultV3Request getPayResultV3Request) {
        String path = "/seller/v3/pay/getResult";
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth(path, getPayResultV3Request);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth(path, getPayResultV3Request);
    }

    public GetRefundResultV3Response getResultV3(GetRefundResultV3Request getRefundResultV3Request) {
        String path = "/seller/v3/pay/getRefundResult";
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth(path, getRefundResultV3Request);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth(path, getRefundResultV3Request);
    }
}
