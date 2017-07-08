package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.*;
import cn.rzhd.wuye.service.*;
import cn.rzhd.wuye.utils.IDUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
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
    @Autowired
    private IPayFeeRecordsService payFeeRecordsService;


    //[{"ammeterNumber":\"10\",\"clientName\":\"无锡立柯纺织服装有限公司\",\"collectingAccount\":\"\",\"collectingCompany\":\"\",\"costType\":\"220101\",\"customerId\":\"1031XX100000000T5HMX\",\"electricPower\":135.51,\"endDate\":\"\",\"feetype\":\"电费\",\"houseInfoId\":\"1031AM1000000001HT2Z\",\"invoiceStatus\":\"\",\"multiplyingPower\":10,\"nyshouldmny\":123,\"paidIn\":123,\"payManner\":\"银联在线支付\",\"payMonth\":\"\",\"payTime\":\"\",\"payable\":\"\",\"pk_corp\":\"1031\",\"startDate\":\"\"},{\"ammeterNumber\":\"10\",\"clientName\":\"无锡立柯纺织服装有限公司\",\"collectingAccount\":\"\",\"collectingCompany\":\"\",\"costType\":\"220101\",\"customerId\":\"1031XX100000000T5HMX\",\"electricPower\":135.51,\"endDate\":\"\",\"feetype\":\"电费\",\"houseInfoId\":\"1031AM1000000001HT2Z\",\"invoiceStatus\":\"\",\"multiplyingPower\":10,\"nyshouldmny\":123,\"paidIn\":123,\"payManner\":\"银联在线支付\",\"payMonth\":\"\",\"payTime\":\"\",\"payable\":\"\",\"pk_corp\":\"1031\",\"startDate\":\"\"}]"


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


//    @RequestMapping("/records/property")
//    public String property(@RequestBody PropertyFeePayDetails propertyFeePayDetails) {
//        Long id = IDUtils.genLongUID();
//        propertyFeePayDetails.setCarteTime(new Date());
//        propertyFeePayDetails.setPayTime(new Date());
//        propertyFeePayDetails.setPropertyFeePayDetails(id);
//        propertyFeePayDetails.setCollectingAccount(propertyFeePayDetailsService.getCompanyAccount(propertyFeePayDetails.getFeecode(), propertyFeePayDetails.getPk_corp()));
//        propertyFeePayDetails.setCollectingCompany(propertyFeePayDetailsService.getCompanyName(propertyFeePayDetails.getFeecode(), propertyFeePayDetails.getPk_corp()));
//        propertyFeePayDetailsService.addDetails(propertyFeePayDetails);
//        return id.toString();
//    }

    /**
     * 生成水电缴费记录,一条记录一次请求
     *
     * @param details
     * @return
     */
//    @RequestMapping("/records/utilities")
//    public String utilities(@RequestBody UtilitiesDetails details) {
//        Long id = IDUtils.genLongUID();
//        details.setUtilitiesDetailsId(id);
//        details.setCarteTime(new Date());
//        details.setPayTime(new Date());
//        details.setCostType(utilitiesService.getCostType(details.getCostType(), details.getPk_corp()));
//        details.setCollectingAccount(utilitiesService.getCompanyAccount(details.getCostType(), details.getPk_corp()));
//        details.setCollectingCompany(utilitiesService.getCompanyName(details.getCostType(), details.getPk_corp()));
//        utilitiesService.addDetails(details);
//        return id.toString();
//    }
    /**
     * 生成开发缴费记录,一条记录请求一次
     */
//    @RequestMapping("/records/kfFee")
//    public String kfFee(@RequestBody KfFeePayDetails kfFeePayDetails) {
//        Long id = IDUtils.genLongUID();
//        kfFeePayDetails.setCarteTime(new Date());
//        kfFeePayDetails.setPayTime(new Date());
//        kfFeePayDetails.setKfFeePayDetailsId(id);
//        kfFeePayDetails.setCollectingAccount(kfFeePayDetailsService.getCompanyAccount(kfFeePayDetails.getFeecode(), kfFeePayDetails.getPk_corp()));
//        kfFeePayDetails.setCollectingCompany(kfFeePayDetailsService.getCompanyName(kfFeePayDetails.getFeecode(), kfFeePayDetails.getPk_corp()));
//        kfFeePayDetailsService.addDetails(kfFeePayDetails);
//        return id.toString();
//    }


    /**
     * 生成水电缴费记录,多条一次请求
     *
     * @param
     * @return
     */
    @RequestMapping("/records/utilities")
    public String utilities(@RequestBody String detailStr) {
        JSONArray array = JSON.parseArray(detailStr);
        /**
         * 准备付款记录所需的字段
         */
        String id = IDUtils.genId();
        BigDecimal arrears = new BigDecimal(0);
        BigDecimal paidIn = new BigDecimal(0);
        String clientName = null;
        String collectingAccount = null;
        String collectingCompany = null;
        Date paytime = null;
        /**
         * 读取每条记录并存入付款记录的值,生成主键值,将部分值取出放入准备的字段,insert缴费详情
         */
        for (Object o : array) {
            JSON json = (JSON) o;
            UtilitiesDetails detail = JSON.toJavaObject(json, UtilitiesDetails.class);
            Long detailsId = IDUtils.genLongUID();
            detail.setUtilitiesDetailsId(detailsId);
            detail.setRecordsId(id);
            detail.setCarteTime(new Date());
            detail.setPayTime(new Date());
            detail.setCostType(utilitiesService.getCostType(detail.getCostType(), detail.getPk_corp()));
            detail.setCollectingAccount(utilitiesService.getCompanyAccount(detail.getCostType(), detail.getPk_corp()));
            detail.setCollectingCompany(utilitiesService.getCompanyName(detail.getCostType(), detail.getPk_corp()));
            utilitiesService.addDetails(detail);
            /**
             * 赋值
             */
            BigDecimal payable = detail.getPayable();
            arrears = arrears.add(payable == null ? new BigDecimal(0) : payable);
            BigDecimal paid = detail.getPaidIn();
            paidIn = paidIn.add(paid == null ? new BigDecimal(0) : paid);
            clientName = detail.getClientName();
            collectingAccount = detail.getCollectingAccount();
            collectingCompany = detail.getCollectingCompany();
            paytime = detail.getPayTime();
        }
        /**
         * 此处赋值到付款记录对象,并进行存储
         */
        PayFeeRecords records = new PayFeeRecords();
        records.setRecordsId(id);
        records.setArrears(arrears);
        records.setClientName(clientName);
        records.setCollectingAccount(collectingAccount);
        records.setCollectingCompany(collectingCompany);
        records.setFeeType("水电");
        records.setPaidIn(paidIn);
        records.setPayTime(paytime);
        payFeeRecordsService.addRecords(records);
        return id;
    }

    /**
     * 生成开发缴费详情记录,多条记录一次请求
     *
     * @param detailStr
     * @return
     */
    @RequestMapping("/records/kfFee")
    public String kfFee(@RequestBody String detailStr) {
        JSONArray array = JSON.parseArray(detailStr);
        /**
         * 准备付款记录所需的字段
         */
        String id = IDUtils.genId();
        BigDecimal arrears = new BigDecimal(0);
        BigDecimal paidIn = new BigDecimal(0);
        String clientName = null;
        String collectingAccount = null;
        String collectingCompany = null;
        Date paytime = null;
        /**
         * 读取每条记录并存入付款记录的值,生成主键值,将部分值取出放入准备的字段,insert缴费详情
         */
        for (Object o : array) {
            JSON json = (JSON) o;
            KfFeePayDetails detail = JSON.toJavaObject(json, KfFeePayDetails.class);
            Long detailId = IDUtils.genLongUID();
            detail.setCarteTime(new Date());
            detail.setPayTime(new Date());
            detail.setKfFeePayDetailsId(detailId);
            detail.setRecordsId(id);
            detail.setCollectingAccount(kfFeePayDetailsService.getCompanyAccount(detail.getFeecode(), detail.getPk_corp()));
            detail.setCollectingCompany(kfFeePayDetailsService.getCompanyName(detail.getFeecode(), detail.getPk_corp()));
            kfFeePayDetailsService.addDetails(detail);
            /**
             * 赋值
             */
            BigDecimal payable = detail.getPayable();
            arrears = arrears.add(payable == null ? new BigDecimal(0) : payable);
            BigDecimal paid = detail.getPaidIn();
            paidIn = paidIn.add(paid == null ? new BigDecimal(0) : paid);
            clientName = detail.getClientName();
            collectingAccount = detail.getCollectingAccount();
            collectingCompany = detail.getCollectingCompany();
            paytime = detail.getPayTime();
        }
        /**
         * 此处赋值到付款记录对象,并进行存储
         */
        PayFeeRecords records = new PayFeeRecords();
        records.setRecordsId(id);
        records.setArrears(arrears);
        records.setClientName(clientName);
        records.setCollectingAccount(collectingAccount);
        records.setCollectingCompany(collectingCompany);
        records.setFeeType("开发");
        records.setPaidIn(paidIn);
        records.setPayTime(paytime);
        payFeeRecordsService.addRecords(records);
        return id;
    }

    @RequestMapping("/records/property")
    public String property(@RequestBody String detailStr) {
        JSONArray array = JSON.parseArray(detailStr);
        /**
         * 准备付款记录所需的字段
         */
        String id = IDUtils.genId();
        BigDecimal arrears = new BigDecimal(0);
        BigDecimal paidIn = new BigDecimal(0);
        String clientName = null;
        String collectingAccount = null;
        String collectingCompany = null;
        Date paytime = null;
        /**
         * 读取每条记录并存入付款记录的值,生成主键值,将部分值取出放入准备的字段,insert缴费详情
         */
        for (Object o : array) {
            JSON json = (JSON) o;
            PropertyFeePayDetails detail = JSON.toJavaObject(json, PropertyFeePayDetails.class);
            Long detailId = IDUtils.genLongUID();
            detail.setCarteTime(new Date());
            detail.setPayTime(new Date());
            detail.setPropertyFeePayDetails(detailId);
            detail.setCollectingAccount(propertyFeePayDetailsService.getCompanyAccount(detail.getFeecode(), detail.getPk_corp()));
            detail.setCollectingCompany(propertyFeePayDetailsService.getCompanyName(detail.getFeecode(), detail.getPk_corp()));
            propertyFeePayDetailsService.addDetails(detail);
            /**
             * 赋值
             */
            BigDecimal payable = detail.getPayable();
            arrears = arrears.add(payable == null ? new BigDecimal(0) : payable);
            BigDecimal paid = detail.getPaidIn();
            paidIn = paidIn.add(paid == null ? new BigDecimal(0) : paid);
            clientName = detail.getClientName();
            collectingAccount = detail.getCollectingAccount();
            collectingCompany = detail.getCollectingCompany();
            paytime = detail.getPayTime();
        }
        /**
         * 此处赋值到付款记录对象,并进行存储
         */
        PayFeeRecords records = new PayFeeRecords();
        records.setRecordsId(id);
        records.setArrears(arrears);
        records.setClientName(clientName);
        records.setCollectingAccount(collectingAccount);
        records.setCollectingCompany(collectingCompany);
        records.setFeeType("物业");
        records.setPaidIn(paidIn);
        records.setPayTime(paytime);
        payFeeRecordsService.addRecords(records);
        return id;
    }
}

