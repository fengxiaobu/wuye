package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.Ammeter;
import cn.rzhd.wuye.mapper.AmmeterMapper;
import cn.rzhd.wuye.service.IAmmeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hasee on 2017/6/14.
 */
@Service
public class AmmeterServiceImpl implements IAmmeterService {
    @Autowired
    AmmeterMapper mapper;

    @Override
    public List<Ammeter> getAmmeters(String houseInfoId) {
        return mapper.queryAmmeters(houseInfoId);
    }

    @Override
    public List<Ammeter> getAllAmmeters() {
        return mapper.getAllAmmeters();
    }
}
