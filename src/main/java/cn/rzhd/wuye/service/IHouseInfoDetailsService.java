package cn.rzhd.wuye.service;

import cn.rzhd.wuye.vo.HouseVO;

import java.util.List;

/**
 * Created by hasee on 2017/6/5.
 */
public interface IHouseInfoDetailsService {

    void addHouseInfoDetails(HouseVO houseInfoDetails);

    /**
     * 此方法用于处理ERP推送更新数据,可能update也可能insert,在此方法中进行判断后执行
     *
     * @param houseInfoDetails
     */
    void saveHouseInfoDetails(HouseVO houseInfoDetails) throws Exception;


    List<HouseVO> getHouseInfoDetails(String pk_house);


    HouseVO selectById(String pkHouse);

    /**
     * 获取后台房产数据
     */
    List<HouseVO> getBackAll();

    void updateHouseInfoDetails(HouseVO houseVO);

    void updateHouse(String pkHouse, String enterApplyState);
}
