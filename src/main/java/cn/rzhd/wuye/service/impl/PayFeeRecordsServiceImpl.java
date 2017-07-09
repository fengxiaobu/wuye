package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.PayFeeRecords;
import cn.rzhd.wuye.mapper.PayFeeRecordsMapper;
import cn.rzhd.wuye.service.IPayFeeRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/7/6.
 */
@Service
public class PayFeeRecordsServiceImpl implements IPayFeeRecordsService {

    @Autowired
    PayFeeRecordsMapper mapper;

    @Override
    public void addRecords(PayFeeRecords records) {
        mapper.insert(records);
    }

    @Override
    public String getTypeById(String id) {
        return mapper.getTypeById(id);
    }
}
