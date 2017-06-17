package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.RetreatLeaseApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * luopa 在 2017/6/16 创建.
 * 退租申请
 */
public interface IRetreatLeaseApplyService {
    int deleteByPrimaryKey(@Param("retreatLeaseApplyId") Long retreatLeaseApplyId);

    int insert(RetreatLeaseApply record);

    RetreatLeaseApply selectByPrimaryKey(Long retreatLeaseApplyId);

    List<RetreatLeaseApply> selectAll();

    int updateByPrimaryKey(RetreatLeaseApply record);
}
