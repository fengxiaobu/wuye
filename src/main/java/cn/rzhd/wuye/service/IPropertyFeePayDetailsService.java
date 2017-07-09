package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.PropertyFeePayDetails;
import cn.rzhd.wuye.vo.query.PropertyFeePayDetailsQuery;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;

import java.util.List;
import java.util.Map;

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

    List<Map<String, Object>> getByProject(PropertyRecordsQuery query);

    List<PropertyFeePayDetails> queryByProject(PropertyRecordsQuery query);

    String getCostType(String feeType,String pk_corp);

    String getCompanyAccount(String feeType,String pk_corp);

    String getCompanyName(String feeType,String pk_corp);

    Integer countByQuery(PropertyRecordsQuery query);

    void changeStatusByRecordsId(String id);

    void updateToERP(String id);
}
