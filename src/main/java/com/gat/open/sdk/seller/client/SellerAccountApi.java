/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
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
    private final SellerTestOpenClient sellerTestOpenClient;
    private final OpenClient openClient;

    public SellerAccountApi(SellerTestOpenClient sellerTestOpenClient) {
        this.sellerTestOpenClient = sellerTestOpenClient;
        openClient = null;
    }

    public SellerAccountApi(OpenClient openClient) {
        this.openClient = openClient;
        sellerTestOpenClient = null;
    }

    public Pagination2<IncomeTransactionResponse> incomeTransactions(IncomeTransactionRequest incomeTransactionRequest) {
        String path = "/seller/v3/account/incomeTransactions";
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth(path, incomeTransactionRequest);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth(path, incomeTransactionRequest);
    }

    public Pagination2<ExpenseTransactionResponse> expenseTransactions(ExpenseTransactionRequest expenseTransactionRequest) {
        String path = "/seller/v3/account/expenseTransactions";
        if (Objects.nonNull(sellerTestOpenClient)) {
            return sellerTestOpenClient.postJsonWithAuth(path, expenseTransactionRequest);
        }

        return Objects.isNull(openClient) ? null : openClient.postJsonWithAuth(path, expenseTransactionRequest);
    }

}
