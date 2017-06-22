package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.*;
import cn.rzhd.wuye.service.*;
import cn.rzhd.wuye.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
    IPropertyFeeInvoiceService propertyFeeInvoiceService;
    @Autowired
    IPropertyFeePayDetailsService propertyFeePayDetailsService;
    @Autowired
    IUtilitiesInvoiceService utilitiesInvoiceService;
    @Autowired
    IUtilitiesService utilitiesService;
    @Autowired
    IKfFeePayDetailsService kfFeePayDetailsService;
    @Autowired
    IKfFeeInvoiceService kfFeeInvoiceService;

    @RequestMapping("/property")
    public Long property(@RequestBody PropertyFeePayDetails propertyFeePayDetails) {
        Long id = IDUtils.genLongUID();
        propertyFeePayDetails.setPropertyFeePayDetails(id);
        List<PropertyFeeInvoiceDetails> invoices = propertyFeePayDetails.getInvoices();
        for (PropertyFeeInvoiceDetails invoice : invoices) {
            Long aLong = IDUtils.genLongUID();
            invoice.setPropFeeInvoiceDetailsId(aLong);
            invoice.setPropertyFeePayDetailsId(id);
            propertyFeeInvoiceService.addInvoice(invoice);
        }
        propertyFeePayDetailsService.addDetails(propertyFeePayDetails);
        return id;
    }

    @RequestMapping("/kfFee")
    public Long property(@RequestBody KfFeePayDetails kfFeePayDetails) {
        Long id = IDUtils.genLongUID();
        kfFeePayDetails.setKfFeePayDetailsId(id);
        List<KfFeeInvoice> invoices = kfFeePayDetails.getInvoices();
        for (KfFeeInvoice invoice : invoices) {
            invoice.setKfFeePayDetailsId(id);
            invoice.setKfFeeInvoiceDetailsId(IDUtils.genLongUID());
            kfFeeInvoiceService.addInvoice(invoice);
        }
        kfFeePayDetailsService.addDetails(kfFeePayDetails);
        return id;
    }

    @RequestMapping("/utilities")
    public Long utilities(@RequestBody UtilitiesDetails details) {
        Long id = IDUtils.genLongUID();
        details.setUtilitiesDetailsId(id);
        List<UtilitiesInvoice> invoices = details.getInvoices();
        for (UtilitiesInvoice invoice : invoices) {
            Long aLong = IDUtils.genLongUID();
            invoice.setUtilitiesInvoiceId(aLong);
            invoice.setUtilitiesDetailsId(id);
            utilitiesInvoiceService.addInvoice(invoice);
        }
        utilitiesService.addDetails(details);
        return id;
    }
}
