package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.service.IElectricFeeInvoiceService;
import cn.rzhd.wuye.service.IPropertyFeeInvoiceService;
import cn.rzhd.wuye.service.IWaterFeeInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hasee on 2017/6/17.
 */
@RequestMapping("/callback")
@RestController
public class PayCallBackController {
    @Autowired
    IElectricFeeInvoiceService electricFeeInvoiceService;
    @Autowired
    IPropertyFeeInvoiceService propertyFeeInvoiceService;
    @Autowired
    IWaterFeeInvoiceService waterFeeInvoiceService;

    @RequestMapping("/electric")
    public void electric(){

    }
}
