package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.HouseInfoDetails;
import cn.rzhd.wuye.vo.HouseVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HouseInfoDetailsMapper {
    int deleteByPrimaryKey(String pkHouse);

    int insert(HouseVO record);

    HouseVO selectByPrimaryKey(@Param("pkHouse") String pkHouse);

    List<HouseVO> selectAll();

    int updateByPrimaryKey(HouseVO record);

    void updateHouse(@Param("pkHouse") String pkHouse, @Param("enterApplyState") String enterApplyState, @Param("decorationapplystate") String decorationapplystate);

    List<HouseVO> getAll();

    List<HouseVO> getHouseInfoByName(String pk_house);


    List<String> getByManageId(String id);

    HouseInfoDetails selectByPkHouse(@Param("pkHouse") String pkHouse);

    void updadteState(@Param("alreadyFinish") String alreadyFinish, @Param("houseInfoId") String houseInfoId);

    /**
     * @Description 更新房产水电限制信息
     * @param houseInfoDetails
     */
    void updatehouseByPkHouse(HouseInfoDetails houseInfoDetails);

    HouseInfoDetails selectHouseInfoDetailsById(String pkHouse);

    List<HouseInfoDetails> selectByPkProject(String pkProject);

}