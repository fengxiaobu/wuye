package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.DecorateDetail;
import cn.rzhd.wuye.mapper.DecorateDetailMapper;
import cn.rzhd.wuye.service.IDecorateDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * luopa 在 2017/6/7 创建.
 * 装修明细实体类
 */
@Service
public class DecorateDetailServiceImpl implements IDecorateDetailService {
    @Autowired
    DecorateDetailMapper decorateDetailMapper;

    /**
     * 删除装修明细
     * @param decorateDetailId
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long decorateDetailId) {
        return decorateDetailMapper.deleteByPrimaryKey(decorateDetailId);
    }

    /**
     * 新增装修明细
     * @param record
     * @return
     */
    @Override
    public int insert(DecorateDetail record) {
        return decorateDetailMapper.insert(record);
    }

    /**
     * 根据ID查询装修明细
     * @param decorateDetailId
     * @return
     */
    @Override
    public DecorateDetail selectByPrimaryKey(Long decorateDetailId) {
        return decorateDetailMapper.selectByPrimaryKey(decorateDetailId);
    }

    /**
     * 查询所有明细
     * @return
     */
    @Override
    public List<DecorateDetail> selectAll() {
        return decorateDetailMapper.selectAll();
    }

    /**
     * 更新装修明细
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(DecorateDetail record) {
        return decorateDetailMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<DecorateDetail> selectByApplyKey(Long decorationApplyId) {
        return decorateDetailMapper.selectByApplyKey(decorationApplyId);
    }
}
