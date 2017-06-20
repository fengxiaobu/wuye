package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.PropertyFeeInvoiceDetails;
import cn.rzhd.wuye.bean.PropertyFeePayDetails;
import cn.rzhd.wuye.bean.UtilitiesDetails;
import cn.rzhd.wuye.bean.UtilitiesInvoice;
import cn.rzhd.wuye.service.IPropertyFeeInvoiceService;
import cn.rzhd.wuye.service.IPropertyFeePayDetailsService;
import cn.rzhd.wuye.service.IUtilitiesInvoiceService;
import cn.rzhd.wuye.service.IUtilitiesService;
import cn.rzhd.wuye.utils.IDUtils;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/property")
    public Long property(PropertyFeePayDetails propertyFeePayDetails) {
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

    @RequestMapping("/utilities")
    public Long utilities(UtilitiesDetails details) {
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

    @RequestMapping("/changeStatus")
    public void changeStatus(HttpServletRequest req){
        String orderStatus = req.getParameter("OrderStatus");
        String tranReserved = req.getParameter("TranReserved");
        Map map = (Map) JSON.parse(tranReserved);
        if("0001".equals(orderStatus)){

        }
    }
}
