package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.HouseInfo;

/**
 * Created by hasee on 2017/5/25.
 */
public interface IHouseInfoService {
    /**
     * 通过HouseInfoId查询获取本地存放的HouseInfo数据
     * @param id
     * @return  返回HouseInfo对象
     */
    HouseInfo getById(Long id);
}
