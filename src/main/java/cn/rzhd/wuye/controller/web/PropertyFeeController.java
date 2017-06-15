package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.KfFeePayDetails;
import cn.rzhd.wuye.bean.PropertyFeePayDetails;
import cn.rzhd.wuye.service.IKfFeePayDetailsService;
import cn.rzhd.wuye.service.IPropertyFeePayDetailsService;
import cn.rzhd.wuye.utils.PageDataGridResult;
import cn.rzhd.wuye.vo.query.KfFeePayDetailsQuery;
import cn.rzhd.wuye.vo.query.PropertyFeePayDetailsQuery;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hasee on 2017/6/1.
 */
@RestController
@RequestMapping("/dist/propertyFee")
public class PropertyFeeController {

    @Autowired
    private IPropertyFeePayDetailsService propertyFeePayDetailsService;
    @Autowired
    private IKfFeePayDetailsService kfFeePayDetailsService;

    /**
     *
     * @param query 包含当前页,每页展示条数,房产信息主键,缴费时间段等条件
     * @return  PageDataGridResult 对象封装了总条数,以及分页后的数据
     */
    @RequestMapping("/records/propertyList")
    public PageDataGridResult propertyList(PropertyFeePayDetailsQuery query){
        //设置分页的firstPage,和pageSize;
        PageHelper.startPage(query.getStartPage(),query.getPageSize());
        //直接执行查询
        List<PropertyFeePayDetails> list = propertyFeePayDetailsService.queryAll(query);
        //new PageInfo对象,将得出的List传入,得到的pageInfo就是一个分页对象,里面有数据,还有总条数等数据
        PageInfo pageInfo = new PageInfo(list);
        PageDataGridResult result = new PageDataGridResult();
        result.setRows(pageInfo.getList());
        result.setTotal(pageInfo.getTotal());
        return result;
    }

    /**
     *
     * @param query 包含当前页,每页展示条数,房产信息主键,缴费时间段等条件
     * @return  PageDataGridResult 对象封装了总条数,以及分页后的数据
     */
    @RequestMapping("/records/kfList")
    public PageDataGridResult kfList(KfFeePayDetailsQuery query){
        PageHelper.startPage(query.getStartPage(),query.getPageSize());
        List<KfFeePayDetails> list = kfFeePayDetailsService.queryAll(query);
        PageInfo pageInfo = new PageInfo(list);
        PageDataGridResult result = new PageDataGridResult();
        result.setRows(pageInfo.getList());
        result.setTotal(pageInfo.getTotal());
        return result;
    }
}
