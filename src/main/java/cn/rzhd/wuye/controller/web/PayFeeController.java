package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.service.IKfFeeService;
import cn.rzhd.wuye.service.IPropertyFeeService;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/9.
 */
@RestController
@RequestMapping("/dist/payFee")
public class PayFeeController {
    @Autowired
    IPropertyFeeService propertyService;
    @Autowired
    IKfFeeService kfService;

    @RequestMapping("/propertyFee")
    public Map<String,List> propertyFee(ArrearsQuery query){
        Map<String, List> map = propertyService.queryForPay(query);
        return map;
    }

    @RequestMapping("/kfFee")
    public Map<String,List> kfFee(ArrearsQuery query){
        Map<String, List> map = kfService.queryForPay(query);
        return map;
    }
}
