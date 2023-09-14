/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
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
import com.gat.open.sdk.util.JSON;
import org.junit.Test;

import java.util.List;

public class InvoiceApiTest {
    private OpenClient openClient = Clients.openClient;

    @Test
    public void costCenterAddTest() {
        InvoiceAddCostCenterRequest invoiceAddCostCenterRequest = new InvoiceAddCostCenterRequest();
        invoiceAddCostCenterRequest.setCostCenterCode("abpp");
        invoiceAddCostCenterRequest.setCostCenterName("午餐成本");
        invoiceAddCostCenterRequest.setCostCenterDesc("desc");
        invoiceAddCostCenterRequest.setCostCenterTags("标签1");
        Integer id = openClient.invoiceApi().addCostCenter(invoiceAddCostCenterRequest);
        System.out.println(id);
    }

    @Test
    public void costCenterUpdateTest() {
        InvoiceUpdateCostCenterRequest invoiceUpdateCostCenterRequest = new InvoiceUpdateCostCenterRequest();
        invoiceUpdateCostCenterRequest.setCostCenterCode("abpp");
        invoiceUpdateCostCenterRequest.setCostCenterName("wucan08");
        invoiceUpdateCostCenterRequest.setCostCenterTags("标签A$#$标签B");
        invoiceUpdateCostCenterRequest.setCostCenterDesc("修改描述");
        invoiceUpdateCostCenterRequest.setCostCenterId(21107);
        Integer id = openClient.invoiceApi().updateCostCenter(invoiceUpdateCostCenterRequest);
        System.out.println(id);
    }

    @Test
    public void addOrUpdateCostCenterRelTest() {
        InvoiceAddOrUpdateCostCenterRelRequest invoiceAddOrUpdateCostCenterRelRequest = new InvoiceAddOrUpdateCostCenterRelRequest();
        invoiceAddOrUpdateCostCenterRelRequest.setCostCenterId(21030);
        invoiceAddOrUpdateCostCenterRelRequest.setUserId("tom0001");
        Integer id = openClient.invoiceApi().addOrUpdateCostCenterRel(invoiceAddOrUpdateCostCenterRelRequest);
        System.out.println(id);
    }

    @Test
    public void findCostCenterByEnterpriseIdTest() {
        InvoiceFindCostCenterByEnterpriseIdRequest invoiceAddOrUpdateCostCenterRelRequest = new InvoiceFindCostCenterByEnterpriseIdRequest();
        List<InvoiceCostCenterRes> invoiceCostCenterRes = openClient.invoiceApi().findCostCenterByEnterpriseId(invoiceAddOrUpdateCostCenterRelRequest);
        System.out.println(JSON.toJSONString(invoiceCostCenterRes));
    }

    @Test
    public void addTaxpayerTest() {
        InvoiceAddTaxpayerRequest invoiceAddTaxpayerRequest = new InvoiceAddTaxpayerRequest();
        invoiceAddTaxpayerRequest.setTaxpayerName("搞个纳税人");
        invoiceAddTaxpayerRequest.setIdentifier("100861001010012");
        invoiceAddTaxpayerRequest.setTaxpayerNature(2);
        Integer addTaxpayer = openClient.invoiceApi().addTaxpayer(invoiceAddTaxpayerRequest);
        System.out.println(addTaxpayer);
    }

    @Test
    public void updateTaxpayerTest() {
        InvoiceUpdateTaxpayerRequest invoiceUpdateTaxpayerRequest = new InvoiceUpdateTaxpayerRequest();
        invoiceUpdateTaxpayerRequest.setTaxpayerName("搞个纳税人l");
        invoiceUpdateTaxpayerRequest.setIdentifier("100861001010012");
        invoiceUpdateTaxpayerRequest.setTaxpayerNature(2);
        invoiceUpdateTaxpayerRequest.setDepositBank("招商银行");
        invoiceUpdateTaxpayerRequest.setBankAccount("6214850219556685");
        Boolean addTaxpayer = openClient.invoiceApi().updateTaxpayer(invoiceUpdateTaxpayerRequest);
        System.out.println(addTaxpayer);
    }


}
