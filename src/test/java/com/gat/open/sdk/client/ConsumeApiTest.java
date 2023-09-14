/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.Pagination;
import com.gat.open.sdk.model.consume.ConsumeListRequest;
import com.gat.open.sdk.model.consume.ConsumeListResp;
import com.gat.open.sdk.model.consume.GetConsumeRequest;
import com.gat.open.sdk.model.consume.GetConsumeResp;
import com.gat.open.sdk.util.JSON;
import org.junit.Test;

public class ConsumeApiTest {
    private OpenClient openClient = Clients.openClient;

    @Test
    public void consumeGetTest() {
        GetConsumeRequest getConsumeRequest = new GetConsumeRequest();
        getConsumeRequest.setTradeNo("2022081620000404");
        GetConsumeResp getConsumeResp = openClient.tradeApi().getConsume(getConsumeRequest);
        System.out.println(JSON.toJSONString(getConsumeResp));
    }

    @Test
    public void consumeListTest() {
        ConsumeListRequest consumeListRequest = new ConsumeListRequest();
//        consumeListRequest.setTimeStart("2022-03-17");
//        consumeListRequest.setTimeEnd("2022-03-17");
        consumeListRequest.setContainFeeTrade(2);
        consumeListRequest.setPageIndex(1);
        consumeListRequest.setPageSize(2);
        Pagination<ConsumeListResp> consumeListRespPagination = openClient.tradeApi().consumeList(consumeListRequest);
        System.out.println(JSON.toJSONString(consumeListRespPagination));
    }
}
