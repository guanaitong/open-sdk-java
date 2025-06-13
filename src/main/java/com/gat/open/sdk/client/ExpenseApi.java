/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;


import com.gat.open.sdk.model.Pagination;
import com.gat.open.sdk.model.expense.AddApprovalFormRequest;
import com.gat.open.sdk.model.expense.ApprovalFormResp;
import com.gat.open.sdk.model.expense.FindBillAggRequest;
import com.gat.open.sdk.model.expense.FindBillAggResponse;
import com.gat.open.sdk.model.expense.GetApprovalFormRequest;
import com.gat.open.sdk.model.expense.RevokeApprovalFormRequest;


public class ExpenseApi {
    private final OpenClient openClient;

    ExpenseApi(OpenClient openClient) {
        this.openClient = openClient;
    }

    //新增审批单
    public String addApprovalForm(AddApprovalFormRequest addApprovalFormRequest) {
        return this.openClient.postFormWithAuth("/enterprise/expense/approvalForm/add", addApprovalFormRequest);
    }

    //作废审批单
    public Boolean revokeApprovalForm(RevokeApprovalFormRequest revokeApprovalFormRequest) {
        return this.openClient.postFormWithAuth("/enterprise/expense/approvalForm/revoke", revokeApprovalFormRequest);
    }

    //查询审批单
    public ApprovalFormResp getApprovalFormRequest(GetApprovalFormRequest getApprovalFormRequest) {
        return this.openClient.postFormWithAuth("/enterprise/expense/approvalForm/get", getApprovalFormRequest);
    }

    //查询账单集
    public Pagination<FindBillAggResponse> findBillAgg(FindBillAggRequest findBillAggRequest) {
        return this.openClient.postFormWithAuth("/enterprise/expense/billAgg/find", findBillAggRequest);
    }

}
