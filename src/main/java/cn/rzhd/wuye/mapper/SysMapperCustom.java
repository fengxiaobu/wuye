package cn.rzhd.wuye.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.rzhd.wuye.bean.HouseInfoDetails;
import cn.rzhd.wuye.bean.vo.HouseInfoDetailsQueryVo;

@Mapper
public interface SysMapperCustom {

    int findHouseCount(HouseInfoDetailsQueryVo queryVo);

    List<HouseInfoDetails> findHouseListPage(HouseInfoDetailsQueryVo queryVo);

}
