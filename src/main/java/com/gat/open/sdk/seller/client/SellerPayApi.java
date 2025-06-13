/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.client;

import com.gat.open.sdk.client.OpenClient;
import com.gat.open.sdk.seller.model.request.CancelOrderV3Request;
import com.gat.open.sdk.seller.model.request.CompleteOrderV3Request;
import com.gat.open.sdk.seller.model.request.CompleteSubOrderV3Request;
import com.gat.open.sdk.seller.model.request.DebitPayV3BindAssetsReq;
import com.gat.open.sdk.seller.model.request.DebitPayV3ByAssetsReq;
import com.gat.open.sdk.seller.model.request.DebitPayV3Request;
import com.gat.open.sdk.seller.model.request.ExcashierV3Request;
import com.gat.open.sdk.seller.model.request.GetCashierUrlV3Request;
import com.gat.open.sdk.seller.model.request.GetPayResultV3Request;
import com.gat.open.sdk.seller.model.request.GetRefundResultV3Request;
import com.gat.open.sdk.seller.model.request.PolicyDebitPayAvailableAssetsReq;
import com.gat.open.sdk.seller.model.request.QuickPayRequest;
import com.gat.open.sdk.seller.model.request.RefundV3Request;
import com.gat.open.sdk.seller.model.request.SellerRefundV3Request;
import com.gat.open.sdk.seller.model.response.CancelOrderV3Res;
import com.gat.open.sdk.seller.model.response.CompleteOrderV3Response;
import com.gat.open.sdk.seller.model.response.CompleteSubOrderV3Response;
import com.gat.open.sdk.seller.model.response.DebitPayV3Response;
import com.gat.open.sdk.seller.model.response.ExcashierV3Response;
import com.gat.open.sdk.seller.model.response.GetCashierUrlV3Response;
import com.gat.open.sdk.seller.model.response.GetPayResultV3Response;
import com.gat.open.sdk.seller.model.response.GetRefundResultV3Response;
import com.gat.open.sdk.seller.model.response.RefundV3Response;

import java.util.Objects;

public class SellerPayApi {
    private final OpenClient openClient;


    public SellerPayApi(OpenClient openClient) {
        this.openClient = Objects.requireNonNull(openClient);
    }

    @Deprecated
    public String syncRefundV3(SellerRefundV3Request sellerRefundV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/pay/syncRefund", sellerRefundV3Request);
    }

    @Deprecated
    public ExcashierV3Response excashierV3(ExcashierV3Request excashierV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/pay/excashier", excashierV3Request);
    }

    public GetCashierUrlV3Response getCashierUrlV3(GetCashierUrlV3Request getCashierUrlV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/pay/getCashierUrl", getCashierUrlV3Request);
    }

    public RefundV3Response refundV3(RefundV3Request refundV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/pay/refund", refundV3Request);
    }

    public DebitPayV3Response debitPayV3(DebitPayV3Request debitPayV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/pay/debitPay", debitPayV3Request);
    }

    public CompleteOrderV3Response completeOrderV3(CompleteOrderV3Request completeOrderV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/pay/complete", completeOrderV3Request);
    }

    public CompleteSubOrderV3Response subComplete(CompleteSubOrderV3Request completeSubOrderV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/pay/subComplete", completeSubOrderV3Request);
    }

    public GetPayResultV3Response getPayResultV3(GetPayResultV3Request getPayResultV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/pay/getResult", getPayResultV3Request);
    }

    public GetRefundResultV3Response getRefundResultV3(GetRefundResultV3Request getRefundResultV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/pay/getRefundResult", getRefundResultV3Request);
    }

    public String quickPay(QuickPayRequest quickPayRequest) {
        return openClient.postFormWithAuth("/seller/quickPay", quickPayRequest);
    }

    public DebitPayV3Response debitPayBindAssets(DebitPayV3BindAssetsReq debitPayV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/pay/debitPayBindAssets", debitPayV3Request);
    }

    public DebitPayV3Response policyDebitPayAvailableAssetsReq(PolicyDebitPayAvailableAssetsReq policyDebitPayAvailableAssetsReq) {
        return openClient.postJsonWithAuth("/seller/v3/pay/policy/debitPayAvailableAssets", policyDebitPayAvailableAssetsReq);
    }

    public CancelOrderV3Res cancel(CancelOrderV3Request request) {
        return openClient.postJsonWithAuth("/seller/v3/order/cancel", request);
    }

    public DebitPayV3Response debitPayByAsset(DebitPayV3ByAssetsReq debitPayV3ByAssetsReq) {
        return openClient.postJsonWithAuth("/seller/v3/pay/debitPayByAsset", debitPayV3ByAssetsReq);
    }
}
