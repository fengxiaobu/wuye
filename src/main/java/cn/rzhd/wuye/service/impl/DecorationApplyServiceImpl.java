package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.DecorationApply;
import cn.rzhd.wuye.mapper.DecorationApplyMapper;
import cn.rzhd.wuye.service.IDecorationApplyService;
import cn.rzhd.wuye.vo.EnterApplyQuery;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/6/7 创建.
 * 装修申请表
 */
@Service
public class DecorationApplyServiceImpl implements IDecorationApplyService {

    @Autowired
    DecorationApplyMapper decorationApplyMapper;

    /**
     * 获取所有装修申请
     * @return
     */
    @Override
    public List<Map<String, JsonFormat.Value>> findDecorationApplyList() {
        return decorationApplyMapper.findDecorationApplyList();
    }

    /**
     * 根据条件查询申请
     * @param enterApplyQuery
     * @return
     */
    @Override
    public List<Map<String, JsonFormat.Value>> findDecorationApplyListByQuery(EnterApplyQuery enterApplyQuery) {
        return decorationApplyMapper.findDecorationApplyListByQuery(enterApplyQuery);
    }

    /**
     * 新增装修申请
     * @param decorationApply
     * @return
     */
    @Override
    public Long insertDecorationApply(DecorationApply decorationApply) {
        return decorationApplyMapper.insertDecorationApply(decorationApply);
    }

    /**
     * 更新装修申请
     * @param decorationApply
     * @return
     */
    @Override
    public int updateDecorationApply(DecorationApply decorationApply) {
        return decorationApplyMapper.updateDecorationApply(decorationApply);
    }

    /**
     * 删除装修申请
     * @param decorationApplyId
     * @return
     */
    @Override
    public int deleteDecorationApply(Long decorationApplyId) {
        return decorationApplyMapper.deleteDecorationApply(decorationApplyId);
    }

    /**
     * 根据ID查询申请信息
     * @param decorationApplyId
     * @return
     */
    @Override
    public DecorationApply getDecorationApplyById(Long decorationApplyId) {
        return decorationApplyMapper.getDecorationApplyById(decorationApplyId);
    }
}
