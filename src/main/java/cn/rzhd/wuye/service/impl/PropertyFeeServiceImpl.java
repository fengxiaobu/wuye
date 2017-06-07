package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.PropertyFee;
import cn.rzhd.wuye.mapper.PropertyFeeMapper;
import cn.rzhd.wuye.service.IPropertyFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/6/6.
 */
@Service
public class PropertyFeeServiceImpl implements IPropertyFeeService {

    @Autowired
    PropertyFeeMapper mapper;

    @Override
    public void addPropertyFee(PropertyFee propertyFee) {
        mapper.insert(propertyFee);
    }
}
