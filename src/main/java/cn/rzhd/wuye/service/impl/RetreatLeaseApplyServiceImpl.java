package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.RetreatLeaseApply;
import cn.rzhd.wuye.mapper.RetreatLeaseApplyMapper;
import cn.rzhd.wuye.service.IRetreatLeaseApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * luopa 在 2017/6/16 创建.
 * 退租申请
 */
@Service
public class RetreatLeaseApplyServiceImpl implements IRetreatLeaseApplyService {
    @Autowired
    RetreatLeaseApplyMapper retreatLeaseApplyMapper;

    @Override
    public int deleteByPrimaryKey(Long retreatLeaseApplyId) {
        return retreatLeaseApplyMapper.deleteByPrimaryKey(retreatLeaseApplyId);
    }

    @Override
    public int insert(RetreatLeaseApply record) {
        return retreatLeaseApplyMapper.insert(record);
    }

    @Override
    public RetreatLeaseApply selectByPrimaryKey(Long retreatLeaseApplyId) {
        return retreatLeaseApplyMapper.selectByPrimaryKey(retreatLeaseApplyId);
    }

    @Override
    public List<RetreatLeaseApply> selectAll() {
        return retreatLeaseApplyMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(RetreatLeaseApply record) {
        return retreatLeaseApplyMapper.updateByPrimaryKey(record);
    }

    @Override
    public RetreatLeaseApply findRetreatLeaseApply(String houseInfoId) {
        return retreatLeaseApplyMapper.findRetreatLeaseApply(houseInfoId);
    }
}
