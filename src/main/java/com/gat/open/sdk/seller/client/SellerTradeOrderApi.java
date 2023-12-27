/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.client;

import com.gat.open.sdk.client.OpenClient;
import com.gat.open.sdk.seller.model.Response.CancelPhysicalGoodsOrderRes;
import com.gat.open.sdk.seller.model.request.MovieTicketOrderV3Request;
import com.gat.open.sdk.seller.model.Response.MovieTicketOrderV3Response;
import com.gat.open.sdk.seller.model.request.PhysicalGoodsCancelOrderV3Request;
import com.gat.open.sdk.seller.model.request.PhysicalGoodsPayOrderV3Request;
import com.gat.open.sdk.seller.model.request.PhysicalGoodsRefundOrderV3Request;
import com.gat.open.sdk.seller.model.Response.SavePayPhysicalGoodsOrderRes;
import com.gat.open.sdk.seller.model.Response.SaveRefundPhysicalGoodsOrderRes;

import java.util.Objects;

public class SellerTradeOrderApi {
    private final SellerTestOpenClient sellerTestOpenClient;
    private final OpenClient openClient;

    public SellerTradeOrderApi(SellerTestOpenClient sellerTestOpenClient) {
        this.sellerTestOpenClient = sellerTestOpenClient;
        openClient = null;
    }

    public SellerTradeOrderApi(OpenClient openClient) {
        this.openClient = openClient;
        sellerTestOpenClient = null;
    }

    public MovieTicketOrderV3Response movieTicketCreateOrder(MovieTicketOrderV3Request movieTicketOrderV3Request) {
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth("/seller/v3/trade/movieTicket/createOrder", movieTicketOrderV3Request);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth("/seller/v3/trade/movieTicket/createOrder", movieTicketOrderV3Request);
    }

    public SavePayPhysicalGoodsOrderRes physicalGoodsCreateOrder(PhysicalGoodsPayOrderV3Request physicalGoodsPayOrderV3Request) {
        String path = "/seller/v3/trade/physicalGoods/createOrder";
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth(path, physicalGoodsPayOrderV3Request);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth(path, physicalGoodsPayOrderV3Request);
    }

    public SaveRefundPhysicalGoodsOrderRes physicalGoodsRefundOrder(PhysicalGoodsRefundOrderV3Request physicalGoodsRefundOrderV3Request) {
        String path = "/seller/v3/trade/physicalGoods/refundOrder";
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth(path, physicalGoodsRefundOrderV3Request);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth(path, physicalGoodsRefundOrderV3Request);
    }

    public CancelPhysicalGoodsOrderRes physicalGoodsCancelOrder(PhysicalGoodsCancelOrderV3Request physicalGoodsCancelOrderV3Request) {
        String path = "/seller/v3/trade/physicalGoods/cancelOrder";
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth(path, physicalGoodsCancelOrderV3Request);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth(path, physicalGoodsCancelOrderV3Request);
    }
}
