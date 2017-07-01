package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.TDictInfo;
import cn.rzhd.wuye.bean.TDictInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TDictInfoMapper {
    int countByExample(TDictInfoExample example);

    int deleteByExample(TDictInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TDictInfo record);

    int insertSelective(TDictInfo record);

    List<TDictInfo> selectByExample(TDictInfoExample example);

    TDictInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TDictInfo record, @Param("example") TDictInfoExample example);

    int updateByExample(@Param("record") TDictInfo record, @Param("example") TDictInfoExample example);

    int updateByPrimaryKeySelective(TDictInfo record);

    int updateByPrimaryKey(TDictInfo record);
}