package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.service.IPropertyFeePayDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hasee on 2017/6/22.
 */
@Controller
@RequestMapping("/propertyRecords")
public class PropertyRecordsController {
    @Autowired
    IPropertyFeePayDetailsService propertyFeePayDetailsService;

    @RequestMapping("/index")
    public String index(){

        return "payment/wuye";
    }
}
