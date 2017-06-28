package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.KfFee;
import cn.rzhd.wuye.bean.PropertyFee;
import cn.rzhd.wuye.service.IKfFeeService;
import cn.rzhd.wuye.service.IPropertyFeeService;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/8.
 */
@RestController
@RequestMapping("/dist/arrearsDetails")
public class ArrearsDetailsController {
    @Autowired
    private IPropertyFeeService propertyFeeService;
    @Autowired
    private IKfFeeService kfFeeService;

    @RequestMapping("/propertyDetailsList")
    public Map<String,Object> propertyDetailsList(ArrearsQuery query) {
        Map<String,Object> result = new HashMap<>();
        List<PropertyFee> propertyFees = propertyFeeService.queryAllArrears(query);
        BigDecimal sum = new BigDecimal(0);
        for (PropertyFee fee : propertyFees) {
            sum = sum.add(new BigDecimal(fee.getNyshouldmny()));
        }
        result.put("rows",result);
        result.put("sum",sum);
        return result;
    }

    @RequestMapping("/kfFeeDetailsList")
    public Map<String,Object> kfDetailsList(ArrearsQuery query) {
        Map<String,Object> result = new HashMap<>();

        List<KfFee> kfFees = kfFeeService.queryAllArrears(query);
        BigDecimal sum = new BigDecimal(0);
        for (KfFee kfFee : kfFees) {
            sum = sum.add(new BigDecimal(kfFee.getArrears()));
        }
        result.put("rows",kfFees);
        result.put("sum",sum);
        return result;
    }

}
