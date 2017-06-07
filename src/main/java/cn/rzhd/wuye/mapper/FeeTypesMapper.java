package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.vo.FeeitemVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface FeeTypesMapper {
    int deleteByPrimaryKey(String pkFee);

    int insert(FeeitemVO record);

    FeeitemVO selectByPrimaryKey(String pkFee);

    List<FeeitemVO> selectAll();

    int updateByPrimaryKey(FeeitemVO record);
}