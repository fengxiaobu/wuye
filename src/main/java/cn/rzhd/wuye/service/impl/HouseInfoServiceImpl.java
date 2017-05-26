package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.HouseInfo;
import cn.rzhd.wuye.mapper.HouseInfoMapper;
import cn.rzhd.wuye.service.IHouseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

    @Override
    public List<HouseInfo> getAll() {
        List<HouseInfo> list = houseInfoMapper.getAll();
        return list;
    }

    @Override
    public void add(HouseInfo houseInfo) {
        houseInfo.setCreationTime(new Date());
        houseInfoMapper.add(houseInfo);
    }

    @Override
    public void update(HouseInfo houseInfo) {
        houseInfo.setUpdateTime(new Date());
        houseInfoMapper.update(houseInfo);
    }

    @Override
    public void delete(Long id) {
        houseInfoMapper.delete(id);
    }
}
