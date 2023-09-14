/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.client;

import com.gat.open.sdk.client.OpenClient;
import com.gat.open.sdk.seller.model.MovieTicketOrderV3Request;
import com.gat.open.sdk.seller.model.MovieTicketOrderV3Response;

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
}
