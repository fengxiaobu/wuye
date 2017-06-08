package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.KfFee;
import cn.rzhd.wuye.bean.PropertyFee;
import cn.rzhd.wuye.service.IKfFeeService;
import cn.rzhd.wuye.service.IPropertyFeeService;
import cn.rzhd.wuye.utils.PageDataGridResult;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hasee on 2017/6/8.
 */
@RestController
@RequestMapping("/dist/arrearsDetails")
public class ArrearsDetailsController {
    @Autowired
    IPropertyFeeService propertyFeeService;
    @Autowired
    IKfFeeService kfFeeService;

    @RequestMapping("/propertyDetailsList")
    public PageDataGridResult propertyDetailsList(ArrearsQuery query) {
        PageDataGridResult result = new PageDataGridResult();

        List<PropertyFee> propertyFees = propertyFeeService.queryAllArrears(query);

        result.setRows(propertyFees);

        return result;
    }

    @RequestMapping("/kfFeeDetailsList")
    public PageDataGridResult kfDetailsList(ArrearsQuery query) {
        PageDataGridResult result = new PageDataGridResult();

        List<KfFee> kfFees = kfFeeService.queryAllArrears(query);

        result.setRows(kfFees);

        return result;
    }

}
