package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.PayFeeRecords;

/**
 * Created by hasee on 2017/7/6.
 */
public interface IPayFeeRecordsService {

    void addRecords(PayFeeRecords records);

    String getTypeById(String id);
}
