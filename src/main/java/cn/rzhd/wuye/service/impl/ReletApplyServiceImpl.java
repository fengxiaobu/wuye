package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.ReletApply;
import cn.rzhd.wuye.mapper.ReletApplyMapper;
import cn.rzhd.wuye.service.IReletApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * luopa 在 2017/6/16 创建.
 * 续租申请
 */
@Service
public class ReletApplyServiceImpl implements IReletApplyService {
    @Autowired
    ReletApplyMapper reletApplyMapper;

    @Override
    public int deleteByPrimaryKey(Long reletApplyId) {
        return reletApplyMapper.deleteByPrimaryKey(reletApplyId);
    }

    @Override
    public int insert(ReletApply record) {
        return reletApplyMapper.insert(record);
    }

    @Override
    public ReletApply selectByPrimaryKey(Long reletApplyId) {
        return reletApplyMapper.selectByPrimaryKey(reletApplyId);
    }

    @Override
    public List<ReletApply> selectAll() {
        return reletApplyMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(ReletApply record) {
        return reletApplyMapper.updateByPrimaryKey(record);
    }
}
