package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.TSys;
import cn.rzhd.wuye.bean.TSysExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TSysMapper {
    int countByExample(TSysExample example);

    int deleteByExample(TSysExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSys record);

    int insertSelective(TSys record);

    List<TSys> selectByExample(TSysExample example);

    TSys selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSys record, @Param("example") TSysExample example);

    int updateByExample(@Param("record") TSys record, @Param("example") TSysExample example);

    int updateByPrimaryKeySelective(TSys record);

    int updateByPrimaryKey(TSys record);
}