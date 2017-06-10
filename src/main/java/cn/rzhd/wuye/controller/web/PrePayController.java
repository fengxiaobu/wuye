package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.KfFee;
import cn.rzhd.wuye.bean.PropertyFee;
import cn.rzhd.wuye.service.IKfFeeService;
import cn.rzhd.wuye.service.IPropertyFeeService;
import cn.rzhd.wuye.utils.PageDataGridResult;
import cn.rzhd.wuye.vo.query.FeeDataQuery;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hasee on 2017/6/8.
 *
 */
@RestController
@RequestMapping("/dist/prePay")
public class PrePayController {

    @Autowired
    IPropertyFeeService propertyFeeService;
    @Autowired
    IKfFeeService kfFeeService;

    @RequestMapping("/propertyFeeList")
    public PageDataGridResult propertyFeeList(FeeDataQuery query){
        PageDataGridResult result = new PageDataGridResult();
        PageHelper.startPage(query.getStartPage(),query.getPageSize());
        List<PropertyFee> list = propertyFeeService.queryAll(query);
        PageInfo pageInfo = new PageInfo(list);
        List pageInfoList = pageInfo.getList();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfoList);
        return result;
    }

    @RequestMapping("/kfFeeList")
    public PageDataGridResult kfFeeList(FeeDataQuery query){
        PageDataGridResult result = new PageDataGridResult();
        PageHelper.startPage(query.getStartPage(),query.getPageSize());
        List<KfFee> list = kfFeeService.queryAll(query);
        PageInfo pageInfo = new PageInfo(list);
        List pageInfoList = pageInfo.getList();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfoList);
        return result;
    }

    /**
     * 入驻开发费
     *
     * @param query
     * @return
     */
    @RequestMapping("/rzKfFeeList")
    public PageDataGridResult RzKfFeeList(FeeDataQuery query) {
        PageDataGridResult result = new PageDataGridResult();
        PageHelper.startPage(query.getStartPage(), query.getPageSize());
        List<KfFee> list = kfFeeService.selectAllRZ(query);
        PageInfo pageInfo = new PageInfo(list);
        List pageInfoList = pageInfo.getList();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfoList);
        return result;
    }

    /**
     * 入驻物业费用
     *
     * @param query
     * @return
     */
    @RequestMapping("/rzPropertyFeeList")
    public PageDataGridResult RzpropertyFeeList(FeeDataQuery query) {
        PageDataGridResult result = new PageDataGridResult();
        PageHelper.startPage(query.getStartPage(), query.getPageSize());
        List<PropertyFee> list = propertyFeeService.rzselectAll(query);
        PageInfo pageInfo = new PageInfo(list);
        List pageInfoList = pageInfo.getList();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfoList);
        return result;
    }
}
