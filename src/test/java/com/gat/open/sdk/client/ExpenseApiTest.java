/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.Pagination;
import com.gat.open.sdk.model.expense.FindBillAggRequest;
import com.gat.open.sdk.model.expense.FindBillAggResponse;
import com.gat.open.sdk.util.JSON;
import org.junit.Test;

public class ExpenseApiTest {
    private OpenClient openClient =  new OpenClient("https://openapi.guanaitong.com", "20210556", "8ae9fecb7b2a36bafafced62b2d23a38");

    @Test
    public void testBillAggFind() {
        FindBillAggRequest findBillAggRequest = new FindBillAggRequest();
//        findBillAggRequest.setOuterTradeNo("20091204CT73E9RCQK48");
        findBillAggRequest.setTimeStart("2023-08-28 18:11:45");
        findBillAggRequest.setTimeEnd("2023-08-28 20:11:45");
        findBillAggRequest.setPageSize(50);
        findBillAggRequest.setPageNo(2);
        Pagination<FindBillAggResponse> billAgg = openClient.expenseApi().findBillAgg(findBillAggRequest);
        System.out.println(JSON.toJSONString(billAgg));
    }
}
