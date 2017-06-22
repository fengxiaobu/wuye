package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.PropertyFeePayDetails;
import cn.rzhd.wuye.vo.query.PropertyFeePayDetailsQuery;

import java.util.List;

/**
 * Created by hasee on 2017/6/1.
 * 查询物业缴费记录
 */

public interface IPropertyFeePayDetailsService {
    /**
     *
     * @param query 必须包含房产信息主键(houseInfoId),同时包含或不包含查询时间段,包含
     * @return
     */
    List<PropertyFeePayDetails> queryAll(PropertyFeePayDetailsQuery query);

    void addDetails(PropertyFeePayDetails details);

    void changeStatus(Long id);
}
