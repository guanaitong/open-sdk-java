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
        findBillAggRequest.setTimeStart("2024-08-09 00:00:00");
        findBillAggRequest.setTimeEnd("2024-08-10 00:00:00");
        findBillAggRequest.setPageSize(50);
        findBillAggRequest.setPageNo(1);
        Pagination<FindBillAggResponse> billAgg = openClient.expenseApi().findBillAgg(findBillAggRequest);
        System.out.println(JSON.toJSONString(billAgg));
    }
}
