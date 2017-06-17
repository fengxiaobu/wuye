package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.RetreatLeaseApply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * luopa 在 2017/6/15 创建.
 * 退租申请
 */
@Mapper
public interface RetreatLeaseApplyMapper {
    int deleteByPrimaryKey(@Param("retreatLeaseApplyId") Long retreatLeaseApplyId);

    int insert(RetreatLeaseApply record);

    RetreatLeaseApply selectByPrimaryKey(@Param("retreatLeaseApplyId") Long retreatLeaseApplyId);

    List<RetreatLeaseApply> selectAll();

    int updateByPrimaryKey(RetreatLeaseApply record);

    RetreatLeaseApply findRetreatLeaseApply(@Param("houseInfoId") String houseInfoId);

}
