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
    int deleteByPrimaryKey(Long decorationApplyId);

    int insert(DecorationApply record);

    DecorationApply selectByPrimaryKey(Long decorationApplyId);

    int updateByPrimaryKey(DecorationApply record);

    List<Map<String, JsonFormat.Value>> findDecorationApplyList();

    List<Map<String, JsonFormat.Value>> findDecorationApplyListByQuery(EnterApplyQuery enterApplyQuery);

    DecorationApply findDecorationApplyByHouseId(String houseInfoId);

    void updatePayState(String paymentStatus, Long decorationApplyId);

    Integer getCount(String pkHouse, String customerId);
}
