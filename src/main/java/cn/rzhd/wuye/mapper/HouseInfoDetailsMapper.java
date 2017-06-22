package cn.rzhd.wuye.mapper;

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
    
    List<HouseVO> getAll();
    
    List<HouseVO> getHouseInfoByName(String pk_house);
}