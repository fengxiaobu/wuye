package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.*;
import cn.rzhd.wuye.service.*;
import cn.rzhd.wuye.utils.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by hasee on 2017/6/17.
 */
@RestController
@RequestMapping("/dist/invoicing")
public class InvoicingController {
    @Autowired
    private IUtilitiesService utilitiesService;
    @Autowired
    private IKfFeePayDetailsService kfFeePayDetailsService;
    @Autowired
    private IPropertyFeePayDetailsService propertyFeePayDetailsService;
    @Autowired
    private IPropertyFeeInvoiceService propertyFeeInvoiceService;
    @Autowired
    private IUtilitiesInvoiceService utilitiesInvoiceService;
    @Autowired
    private IKfFeeInvoiceService kfFeeInvoiceService;

    @RequestMapping("/records/property")
    public String property(@RequestBody PropertyFeePayDetails propertyFeePayDetails) {
        Long id = IDUtils.genLongUID();
        propertyFeePayDetails.setCarteTime(new Date());
        propertyFeePayDetails.setPayTime(new Date());
        propertyFeePayDetails.setPropertyFeePayDetails(id);
        propertyFeePayDetailsService.addDetails(propertyFeePayDetails);
        return id.toString();
    }

    @RequestMapping("/records/kfFee")
    public String property(@RequestBody KfFeePayDetails kfFeePayDetails) {
        Long id = IDUtils.genLongUID();
        kfFeePayDetails.setCarteTime(new Date());
        kfFeePayDetails.setPayTime(new Date());
        kfFeePayDetails.setKfFeePayDetailsId(id);
        kfFeePayDetailsService.addDetails(kfFeePayDetails);
        return id.toString();
    }

    @RequestMapping("/records/utilities")
    public String utilities(@RequestBody UtilitiesDetails details) {
        Long id = IDUtils.genLongUID();
        details.setUtilitiesDetailsId(id);
        details.setCarteTime(new Date());
        details.setPayTime(new Date());
        details.setCostType(utilitiesService.getCostType(details.getCostType(),details.getPk_corp()));
        details.setCollectingAccount(utilitiesService.getCompanyAccount(details.getCostType(),details.getPk_corp()));
        details.setCollectingCompany(utilitiesService.getCompanyName(details.getCostType(),details.getPk_corp()));
        utilitiesService.addDetails(details);
        return id.toString();
    }

    @RequestMapping("/invoice/property")
    public void propertyInvoice(@RequestBody PropertyFeePayDetails details) {
        Long id = details.getPropertyFeePayDetails();
        List<PropertyFeeInvoiceDetails> invoices = details.getInvoices();
        for (PropertyFeeInvoiceDetails invoice : invoices) {
            invoice.setPropFeeInvoiceDetailsId(IDUtils.genLongUID());
            invoice.setPropertyFeePayDetailsId(id);
            propertyFeeInvoiceService.addInvoice(invoice);
        }
    }

    @RequestMapping("/invoice/kfFee")
    public void kfFeeInvoice(@RequestBody KfFeePayDetails details) {
        Long id = details.getKfFeePayDetailsId();
        List<KfFeeInvoice> invoices = details.getInvoices();
        for (KfFeeInvoice invoice : invoices) {
            invoice.setKfFeeInvoiceDetailsId(IDUtils.genLongUID());
            invoice.setKfFeePayDetailsId(id);
            kfFeeInvoiceService.addInvoice(invoice);
        }
    }

    @RequestMapping("/invoice/utilities")
    public void utilitiesInvoice(@RequestBody UtilitiesDetails details) {
        Long id = details.getUtilitiesDetailsId();
        List<UtilitiesInvoice> invoices = details.getInvoices();
        for (UtilitiesInvoice invoice : invoices) {
            invoice.setUtilitiesInvoiceId(IDUtils.genLongUID());
            invoice.setUtilitiesDetailsId(id);
            utilitiesInvoiceService.addInvoice(invoice);
        }
    }
}
