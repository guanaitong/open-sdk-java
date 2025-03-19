/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.Pagination2;
import com.gat.open.sdk.seller.client.SellerAccountApi;
import com.gat.open.sdk.seller.client.SellerTestOpenClient;
import com.gat.open.sdk.seller.model.request.ExpenseTransactionRequest;
import com.gat.open.sdk.seller.model.request.IncomeTransactionRequest;
import com.gat.open.sdk.seller.model.response.ExpenseTransactionResponse;
import com.gat.open.sdk.seller.model.response.IncomeTransactionResponse;
import com.gat.open.sdk.util.JSON;
import org.junit.Test;

public class SellerAccountApiTest {
    //    private SellerOpenClient openClient = new SellerOpenClient("http://127.0.0.1:19090", "http://127.0.0.1:18888", "", "");
    private SellerTestOpenClient sellerTestOpenClient = new SellerTestOpenClient("https://openapi.guanaitong.tech", "http://127.0.0.1:18888", "", "");
//    private OpenClient openClient = new OpenClient("https://openapi.guanaitong.tech", "", "");


    @Test
    public void incomeTransactions() {
        IncomeTransactionRequest incomeTransactionRequest = new IncomeTransactionRequest();
        SellerAccountApi sellerAccountApi = new SellerAccountApi(sellerTestOpenClient);
        Pagination2<IncomeTransactionResponse> incomeTransactionResponsePagination =
                sellerAccountApi.incomeTransactions(incomeTransactionRequest);
        System.out.println("incomeTransactionResponsePagination = " + JSON.toJSONString(incomeTransactionResponsePagination));
    }

    @Test
    public void expenseTransactions() {
        SellerAccountApi sellerAccountApi = new SellerAccountApi(sellerTestOpenClient);

        ExpenseTransactionRequest expenseTransactionRequest = new ExpenseTransactionRequest();
        Pagination2<ExpenseTransactionResponse> response = sellerAccountApi.expenseTransactions(expenseTransactionRequest);
        System.out.println("response = " + response);
    }
}
