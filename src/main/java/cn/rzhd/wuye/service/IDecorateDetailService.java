package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.DecorateDetail;

import java.util.List;

/**
 * luopa 在 2017/6/7 创建.
 * 装修明细实体类
 */
public interface IDecorateDetailService {
    int deleteByPrimaryKey(Long decorateDetailId);

    int insert(DecorateDetail record);

    DecorateDetail selectByPrimaryKey(Long decorateDetailId);

    List<DecorateDetail> selectAll();

    int updateByPrimaryKey(DecorateDetail record);

    List<DecorateDetail> selectByApplyKey(Long decorationApplyId);
}
