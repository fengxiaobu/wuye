package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.PropertyFee;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.FeeDataQuery;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/6.
 */
public interface IPropertyFeeService{

    void addPropertyFee(FeeVO propertyFee);

    void addRzFee(FeeVO propertyFee);

    List<PropertyFee> queryAll(FeeDataQuery query);

    List<PropertyFee> queryAllArrears(ArrearsQuery query);

    Map<String,List> queryForPay(ArrearsQuery query);
}
