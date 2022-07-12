/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.model.invoice.InvoiceAddCostCenterRequest;
import com.gat.open.sdk.model.invoice.InvoiceAddOrUpdateCostCenterRelRequest;
import com.gat.open.sdk.model.invoice.InvoiceAddTaxpayerRequest;
import com.gat.open.sdk.model.invoice.InvoiceCostCenterRes;
import com.gat.open.sdk.model.invoice.InvoiceFindCostCenterByEnterpriseIdRequest;
import com.gat.open.sdk.model.invoice.InvoiceUpdateCostCenterRequest;
import com.gat.open.sdk.model.invoice.InvoiceUpdateTaxpayerRequest;

import java.util.List;

/**
 * Created by August.Zhou on 2022/6/27 13:51
 */
public class InvoiceApi {
    private final OpenClient openClient;

    InvoiceApi(OpenClient openClient) {
        this.openClient = openClient;
    }

    public Integer addCostCenter(InvoiceAddCostCenterRequest invoiceAddCostCenterRequest) {
        return this.openClient.postFormWithAuth("/billing/cost/addCostCenter", invoiceAddCostCenterRequest);
    }

    public Integer updateCostCenter(InvoiceUpdateCostCenterRequest invoiceUpdateCostCenterRequest) {
        return this.openClient.postFormWithAuth("/billing/cost/updateCostCenter", invoiceUpdateCostCenterRequest);
    }

    public Integer addOrUpdateCostCenterRel(InvoiceAddOrUpdateCostCenterRelRequest invoiceAddOrUpdateCostCenterRelRequest) {
        return this.openClient.postFormWithAuth("/billing/cost/addOrUpdateCostCenterRel", invoiceAddOrUpdateCostCenterRelRequest);
    }

    public List<InvoiceCostCenterRes> findCostCenterByEnterpriseId(InvoiceFindCostCenterByEnterpriseIdRequest invoiceFindCostCenterByEnterpriseIdRequest) {
        return this.openClient.postFormWithAuth("/billing/cost/findByEnterpriseId", invoiceFindCostCenterByEnterpriseIdRequest);
    }

    public Integer addTaxpayer(InvoiceAddTaxpayerRequest invoiceAddTaxpayerRequest) {
        return this.openClient.postFormWithAuth("/taxpayer/add", invoiceAddTaxpayerRequest);
    }

    public Boolean updateTaxpayer(InvoiceUpdateTaxpayerRequest invoiceUpdateTaxpayerRequest) {
        return this.openClient.postFormWithAuth("/taxpayer/update", invoiceUpdateTaxpayerRequest);
    }
}
