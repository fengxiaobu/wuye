package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.*;
import cn.rzhd.wuye.service.IElectricFeeInvoiceService;
import cn.rzhd.wuye.service.IPropertyFeeInvoiceService;
import cn.rzhd.wuye.service.IWaterFeeInvoiceService;
import cn.rzhd.wuye.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hasee on 2017/6/17.
 */
@RestController
@RequestMapping("/dist/invoicing")
public class InvoicingController {
    @Autowired
    IElectricFeeInvoiceService electricFeeInvoiceService;
    @Autowired
    IPropertyFeeInvoiceService propertyFeeInvoiceService;
    @Autowired
    IWaterFeeInvoiceService waterFeeInvoiceService;

    @RequestMapping("/electric")
    public void electric(ElectricFeePayDetails electricFeePayDetails) {
        Long id = IDUtils.genLongUID();
        electricFeePayDetails.setElectricFeePayDetailsId(id);
        List<ElectricFeeInvoiceDeta> invoices = electricFeePayDetails.getInvoices();
        for (ElectricFeeInvoiceDeta invoice : invoices) {
            Long aLong = IDUtils.genLongUID();
            invoice.setElectricChargeInvoiceDeta(aLong);
            electricFeeInvoiceService.addInvoice(invoice);
        }
    }

    @RequestMapping("/property")
    public void property(PropertyFeePayDetails propertyFeePayDetails) {
        Long id = IDUtils.genLongUID();
        propertyFeePayDetails.setPropertyFeePayDetails(id);
        List<PropertyFeeInvoiceDetails> invoices = propertyFeePayDetails.getInvoices();
        for (PropertyFeeInvoiceDetails invoice : invoices) {
            Long aLong = IDUtils.genLongUID();
            invoice.setPropFeeInvoiceDetailsId(aLong);
            propertyFeeInvoiceService.addInvoice(invoice);
        }
    }

    @RequestMapping("/water")
    public void water(WaterRatePayDetails waterRatePayDetails) {
        Long id = IDUtils.genLongUID();
        waterRatePayDetails.setWaterRatePayDetailsId(id);
        List<WaterRateInvoiceDetails> invoices = waterRatePayDetails.getInvoices();
        for (WaterRateInvoiceDetails invoice : invoices) {
            Long aLong = IDUtils.genLongUID();
            invoice.setWaterRateInvoiceDetailsId(aLong);
            waterFeeInvoiceService.addInvoice(invoice);
        }
    }
}
