package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.PayFeeRecords;
import cn.rzhd.wuye.mapper.PayFeeRecordsMapper;
import cn.rzhd.wuye.service.IPayFeeRecordsService;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public List<Map<String, Object>> getByProject(PropertyRecordsQuery query) {
        return mapper.getByProject(query);
    }

    @Override
    public Integer countByQuery(PropertyRecordsQuery query) {
        return mapper.countByQuery(query);
    }

    @Override
    public void changeStatus(String id) {
        mapper.changeStatus(id);
    }
}
