package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.TDictType;
import cn.rzhd.wuye.bean.TDictTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TDictTypeMapper {
    int countByExample(TDictTypeExample example);

    int deleteByExample(TDictTypeExample example);

    int deleteByPrimaryKey(String typeCode);

    int insert(TDictType record);

    int insertSelective(TDictType record);

    List<TDictType> selectByExample(TDictTypeExample example);

    TDictType selectByPrimaryKey(String typeCode);

    int updateByExampleSelective(@Param("record") TDictType record, @Param("example") TDictTypeExample example);

    int updateByExample(@Param("record") TDictType record, @Param("example") TDictTypeExample example);

    int updateByPrimaryKeySelective(TDictType record);

    int updateByPrimaryKey(TDictType record);
}