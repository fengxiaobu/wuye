package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.vo.HouseVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface HouseInfoDetailsMapper {
    int deleteByPrimaryKey(String pkHouse);

    int insert(HouseVO record);

    HouseVO selectByPrimaryKey(String pkHouse);

    List<HouseVO> selectAll();

    int updateByPrimaryKey(HouseVO record);
    
    List<HouseVO> getHouseInfoByName(String vhname);
    
    List<HouseVO> getAll();
}