package cn.rzhd.wuye.service;

import java.util.List;

import cn.rzhd.wuye.vo.HouseVO;

/**
 * Created by hasee on 2017/6/5.
 */
public interface IHouseInfoDetailsService {

    void addHouseInfoDetails(HouseVO houseInfoDetails);
    /**
     * 此方法用于处理ERP推送更新数据,可能update也可能insert,在此方法中进行判断后执行
     * @param houseInfoDetails
     */
    void saveHouseInfoDetails(HouseVO houseInfoDetails) throws Exception;
<<<<<<< HEAD
    
    List<HouseVO> getHouseInfoDetails(String vhname);
=======

    HouseVO selectById(String pkHouse);
>>>>>>> abbbe119b4e270093b02bacdd5bf922ec7aa8e04
}
