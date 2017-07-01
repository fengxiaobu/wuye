package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.ReletApply;

import java.util.List;

/**
 * luopa 在 2017/6/16 创建.
 * 续租申请
 */
public interface IReletApplyService {
    int deleteByPrimaryKey(Long reletApplyId);

    int insert(ReletApply record);

    ReletApply selectByPrimaryKey(Long reletApplyId);

    List<ReletApply> selectAll();

    int updateByPrimaryKey(ReletApply record);

    List<ReletApply> findReletApply(String houseInfoId, String customerId);

}
