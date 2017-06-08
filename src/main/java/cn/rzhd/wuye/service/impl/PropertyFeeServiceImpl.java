package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.PropertyFee;
import cn.rzhd.wuye.mapper.PropertyFeeMapper;
import cn.rzhd.wuye.service.IPropertyFeeService;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.FeeDataQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hasee on 2017/6/6.
 */
@Service
public class PropertyFeeServiceImpl implements IPropertyFeeService {

    @Autowired
    PropertyFeeMapper mapper;

    @Override
    public void addPropertyFee(FeeVO propertyFee) {
        mapper.insert(propertyFee);
    }

    @Override
    public List<PropertyFee> queryAll(FeeDataQuery query) {
        return mapper.selectAll(query);
    }

    @Override
    public List<PropertyFee> queryAllArrears(ArrearsQuery query) {
        return mapper.selectAllArrears(query);
    }
}
