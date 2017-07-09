package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.PayFeeRecords;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/7/6.
 */
public interface IPayFeeRecordsService {

    void addRecords(PayFeeRecords records);

    String getTypeById(String id);

    List<Map<String, Object>> getByProject(PropertyRecordsQuery query);
}
