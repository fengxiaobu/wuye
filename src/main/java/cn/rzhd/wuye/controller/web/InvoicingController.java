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
    public Long property(@RequestBody PropertyFeePayDetails propertyFeePayDetails) {
        Long id = IDUtils.genLongUID();
        propertyFeePayDetails.setPropertyFeePayDetails(id);
        propertyFeePayDetailsService.addDetails(propertyFeePayDetails);
        return id;
    }

    @RequestMapping("/records/kfFee")
    public Long property(@RequestBody KfFeePayDetails kfFeePayDetails) {
        Long id = IDUtils.genLongUID();
        kfFeePayDetails.setKfFeePayDetailsId(id);
        kfFeePayDetailsService.addDetails(kfFeePayDetails);
        return id;
    }

    @RequestMapping("/records/utilities")
    public Long utilities(@RequestBody UtilitiesDetails details) {
        Long id = IDUtils.genLongUID();
        details.setUtilitiesDetailsId(id);
        //新创建一个水电缴费对象,用于分割一部分水费数据到其中;
//        UtilitiesDetails newOne = new UtilitiesDetails();
//        newOne.setUtilitiesDetailsId(id);
//        newOne.setCarteTime(new Date());
//        newOne.setClientName(details.getClientName());
//        newOne.setCollectingAccount(details.getCollectingAccount());
//        newOne.setCollectingCompany(details.getCollectingCompany());
//        newOne.setCostType("水费");

        utilitiesService.addDetails(details);
        return id;
    }

    @RequestMapping("/invoice/property")
    public void propertyInvoice(@RequestBody PropertyFeePayDetails details){
        Long id = details.getPropertyFeePayDetails();
        List<PropertyFeeInvoiceDetails> invoices = details.getInvoices();
        for (PropertyFeeInvoiceDetails invoice : invoices) {
            invoice.setPropFeeInvoiceDetailsId(IDUtils.genLongUID());
            invoice.setPropertyFeePayDetailsId(id);
            propertyFeeInvoiceService.addInvoice(invoice);
        }
    }

    @RequestMapping("/invoice/kfFee")
    public void kfFeeInvoice(@RequestBody KfFeePayDetails details){
        Long id = details.getKfFeePayDetailsId();
        List<KfFeeInvoice> invoices = details.getInvoices();
        for (KfFeeInvoice invoice : invoices) {
            invoice.setKfFeeInvoiceDetailsId(IDUtils.genLongUID());
            invoice.setKfFeePayDetailsId(id);
            kfFeeInvoiceService.addInvoice(invoice);
        }
    }

    @RequestMapping("/invoice/utilities")
    public void utilitiesInvoice(@RequestBody UtilitiesDetails details){
        Long id = details.getUtilitiesDetailsId();
        List<UtilitiesInvoice> invoices = details.getInvoices();
        for (UtilitiesInvoice invoice : invoices) {
            invoice.setUtilitiesInvoiceId(IDUtils.genLongUID());
            invoice.setUtilitiesDetailsId(id);
            utilitiesInvoiceService.addInvoice(invoice);
        }
    }
}
