/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.trade.EnterpriseGetTradeDetailRequest;
import com.gat.open.sdk.model.trade.EnterpriseGetTradeDetailResp;

/**
 * Created by August.Zhou on 2022/6/27 13:51
 */
public class TradeApi {
    private final OpenClient openClient;

    TradeApi(OpenClient openClient) {
        this.openClient = openClient;
    }

    public EnterpriseGetTradeDetailResp getTradeDetail(EnterpriseGetTradeDetailRequest enterpriseGetTradeDetailRequest) {
        return this.openClient.postFormWithAuth("/enterprise/trade/detail/get", enterpriseGetTradeDetailRequest);
    }
}
