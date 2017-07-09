package cn.rzhd.wuye.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.rzhd.wuye.bean.Ammeter;
import cn.rzhd.wuye.bean.HouseInfoDetails;
import cn.rzhd.wuye.bean.ProjectInfo;
import cn.rzhd.wuye.bean.vo.AmmeQueryVo;
import cn.rzhd.wuye.bean.vo.HouseInfoDetailsQueryVo;
import cn.rzhd.wuye.bean.vo.ProjectInfoQueryVo;

@Mapper
public interface SysMapperCustom {

    int findHouseCount(HouseInfoDetailsQueryVo queryVo);

    List<HouseInfoDetails> findHouseListPage(HouseInfoDetailsQueryVo queryVo);
    
    int findProjectCount(ProjectInfoQueryVo queryVo);

    List<ProjectInfo> findProjectListPage(ProjectInfoQueryVo queryVo);

    int findAmmeCount(AmmeQueryVo queryVo);

    List<Ammeter> findAmmeListPage(AmmeQueryVo queryVo);

}
