/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.Pagination;
import com.gat.open.sdk.model.consume.ConsumeListRequest;
import com.gat.open.sdk.model.consume.ConsumeListResp;
import com.gat.open.sdk.model.consume.GetConsumeRequest;
import com.gat.open.sdk.model.consume.GetConsumeResp;

/**
 * Created by August.Zhou on 2022/6/27 13:51
 */
public class ConsumeApi {
    private final OpenClient openClient;

    ConsumeApi(OpenClient openClient) {
        this.openClient = openClient;
    }

    public GetConsumeResp getConsume(GetConsumeRequest getConsumeRequest) {
        return this.openClient.postFormWithAuth("/enterprise/consume/get", getConsumeRequest);
    }

    public Pagination<ConsumeListResp> consumeList(ConsumeListRequest consumeListRequest) {
        return this.openClient.postFormWithAuth("/enterprise/consume/list", consumeListRequest);
    }
}
