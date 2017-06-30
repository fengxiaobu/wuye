package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.ReletApply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * luopa 在 2017/6/15 创建.
 * 续租申请
 */
@Mapper
public interface ReletApplyMapper {
    int deleteByPrimaryKey(@Param("reletApplyId") Long reletApplyId);

    int insert(ReletApply record);

    ReletApply selectByPrimaryKey(@Param("reletApplyId") Long reletApplyId);

    List<ReletApply> selectAll();

    int updateByPrimaryKey(ReletApply record);

    List<ReletApply> findReletApply(@Param("houseInfoId") String houseInfoId);
}
