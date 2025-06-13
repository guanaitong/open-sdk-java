/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.client;

import com.gat.open.sdk.client.OpenClient;
import com.gat.open.sdk.model.Pagination2;
import com.gat.open.sdk.seller.model.request.ExpenseTransactionRequest;
import com.gat.open.sdk.seller.model.request.IncomeTransactionRequest;
import com.gat.open.sdk.seller.model.response.ExpenseTransactionResponse;
import com.gat.open.sdk.seller.model.response.IncomeTransactionResponse;

import java.util.Objects;

/**
 * @author shuai.zhao@guaniatong.com
 */
public class SellerAccountApi {
    private final OpenClient openClient;


    public SellerAccountApi(OpenClient openClient) {
        this.openClient = Objects.requireNonNull(openClient);
    }

    public Pagination2<IncomeTransactionResponse> incomeTransactions(IncomeTransactionRequest incomeTransactionRequest) {
        return openClient.postJsonWithAuth("/seller/v3/account/incomeTransactions", incomeTransactionRequest);
    }

    public Pagination2<ExpenseTransactionResponse> expenseTransactions(ExpenseTransactionRequest expenseTransactionRequest) {
        return openClient.postJsonWithAuth("/seller/v3/account/expenseTransactions", expenseTransactionRequest);
    }

}
