package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.RetreatLeaseApply;

import java.util.List;

/**
 * luopa 在 2017/6/16 创建.
 * 退租申请
 */
public interface IRetreatLeaseApplyService {
    int deleteByPrimaryKey(Long retreatLeaseApplyId);

    int insert(RetreatLeaseApply record);

    RetreatLeaseApply selectByPrimaryKey(Long retreatLeaseApplyId);

    List<RetreatLeaseApply> selectAll();

    int updateByPrimaryKey(RetreatLeaseApply record);

    List<RetreatLeaseApply> findRetreatLeaseApply(String houseInfoId);
}
