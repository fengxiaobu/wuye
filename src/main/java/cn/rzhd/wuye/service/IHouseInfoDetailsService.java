package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.HouseInfoDetails;
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
    
    List<HouseVO> selectAll();


    List<HouseVO> getHouseInfoDetails(String pk_house);


    HouseVO selectById(String pkHouse);

    /**
     * 获取后台房产数据
     */
    List<HouseVO> getBackAll();

    void updateHouseInfoDetails(HouseVO houseVO);

    void updateHouse(String pkHouse, String enterApplyState,String decorationapplystate);

    HouseInfoDetails selectByPkHouse(String pkHouse);

	void updadteState(String alreadyFinish, String houseInfoId);

	/**
	 * @Description 更新房产水电限制信息
	 * @param houseInfoDetails
	 */
    void updatehouse(HouseInfoDetails houseInfoDetails);

    /**
     * 
     * @Description 根据主键id查询
     * @param pkHouse
     * @return
     */
    HouseInfoDetails selectHouseInfoDetailsById(String pkHouse);

    /**
     * 
     * @Description 根据项目主键查找所有房产信息
     * @param pkProject
     * @return
     */
    List<HouseInfoDetails> selectByPkProject(String pkProject);
}
