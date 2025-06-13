/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.client;

import com.gat.open.sdk.client.OpenClient;
import com.gat.open.sdk.seller.model.request.MovieTicketOrderV3Request;
import com.gat.open.sdk.seller.model.request.PhysicalGoodsCancelOrderV3Request;
import com.gat.open.sdk.seller.model.request.PhysicalGoodsPayOrderV3Request;
import com.gat.open.sdk.seller.model.request.PhysicalGoodsPayOrdersV3Request;
import com.gat.open.sdk.seller.model.request.PhysicalGoodsRefundOrderV3Request;
import com.gat.open.sdk.seller.model.response.CancelPhysicalGoodsOrderRes;
import com.gat.open.sdk.seller.model.response.MovieTicketOrderV3Response;
import com.gat.open.sdk.seller.model.response.SavePayPhysicalGoodsOrderRes;
import com.gat.open.sdk.seller.model.response.SaveRefundPhysicalGoodsOrderRes;

import java.util.Objects;

public class SellerTradeOrderApi {
    private final OpenClient openClient;

    public SellerTradeOrderApi(OpenClient openClient) {
        this.openClient = Objects.requireNonNull(openClient);
    }

    /**
     * 推送电影票订单
     *
     * @param movieTicketOrderV3Request 电影票订单请求对象
     * @return 推送电影票订单的响应对象
     */
    public MovieTicketOrderV3Response movieTicketCreateOrder(MovieTicketOrderV3Request movieTicketOrderV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/trade/movieTicket/createOrder", movieTicketOrderV3Request);
    }

    /**
     * 推送实物商品订单
     *
     * @param physicalGoodsPayOrderV3Request 实物商品支付订单请求对象
     * @return 实物商品推送订单响应对象
     */
    public SavePayPhysicalGoodsOrderRes physicalGoodsCreateOrder(PhysicalGoodsPayOrderV3Request physicalGoodsPayOrderV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/trade/physicalGoods/createOrder", physicalGoodsPayOrderV3Request);
    }

    /**
     * 推送实物多订单
     *
     * @param physicalGoodsPayOrdersV3Request 实物订单请求对象
     * @return 推送成功的实物订单响应对象
     */
    public SavePayPhysicalGoodsOrderRes physicalGoodsCreateOrders(PhysicalGoodsPayOrdersV3Request physicalGoodsPayOrdersV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/trade/physicalGoods/createOrders", physicalGoodsPayOrdersV3Request);
    }

    /**
     * 申请退款实物商品订单
     *
     * @param physicalGoodsRefundOrderV3Request 实物商品退款订单请求体
     * @return 申请退款实物商品订单响应体
     */
    public SaveRefundPhysicalGoodsOrderRes physicalGoodsRefundOrder(PhysicalGoodsRefundOrderV3Request physicalGoodsRefundOrderV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/trade/physicalGoods/refundOrder", physicalGoodsRefundOrderV3Request);
    }

    /**
     * 取消实物商品订单
     *
     * @param physicalGoodsCancelOrderV3Request 实物商品取消订单请求
     * @return 取消实物商品订单响应
     */
    public CancelPhysicalGoodsOrderRes physicalGoodsCancelOrder(PhysicalGoodsCancelOrderV3Request physicalGoodsCancelOrderV3Request) {
        return openClient.postJsonWithAuth("/seller/v3/trade/physicalGoods/cancelOrder", physicalGoodsCancelOrderV3Request);
    }
}
