package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.DecorationApply;
import cn.rzhd.wuye.vo.query.EnterApplyQuery;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/6/7 创建.
 */
public interface IDecorationApplyService {
    List<Map<String, JsonFormat.Value>> findDecorationApplyList();

    List<Map<String, JsonFormat.Value>> findDecorationApplyListByQuery(EnterApplyQuery enterApplyQuery);

    Long insertDecorationApply(DecorationApply decorationApply);

    int updateDecorationApply(DecorationApply decorationApply);

    int deleteDecorationApply( Long decorationApplyId);

    DecorationApply getDecorationApplyById(Long decorationApplyId);
}
