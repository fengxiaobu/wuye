package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.TPort;
import cn.rzhd.wuye.bean.TPortExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TPortMapper {
    int countByExample(TPortExample example);

    int deleteByExample(TPortExample example);

    int deleteByPrimaryKey(String id);

    int insert(TPort record);

    int insertSelective(TPort record);

    List<TPort> selectByExample(TPortExample example);

    TPort selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TPort record, @Param("example") TPortExample example);

    int updateByExample(@Param("record") TPort record, @Param("example") TPortExample example);

    int updateByPrimaryKeySelective(TPort record);

    int updateByPrimaryKey(TPort record);
}