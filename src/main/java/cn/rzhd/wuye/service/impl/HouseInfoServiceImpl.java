package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.HouseInfo;
import cn.rzhd.wuye.mapper.HouseInfoMapper;
import cn.rzhd.wuye.service.IHouseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/5/25.
 */
@Service
public class HouseInfoServiceImpl implements IHouseInfoService {

    @Autowired
    HouseInfoMapper houseInfoMapper;
    @Override
    public HouseInfo getById(Long id) {
        return houseInfoMapper.getById(id);
    }
}
