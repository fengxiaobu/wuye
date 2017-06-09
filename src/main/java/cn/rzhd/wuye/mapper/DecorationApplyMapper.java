package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.DecorationApply;
import cn.rzhd.wuye.vo.query.EnterApplyQuery;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/6/6 创建.
 * 装修申请表
 *
 */
@Mapper
public interface DecorationApplyMapper {

    List<Map<String, JsonFormat.Value>> findDecorationApplyList();

    List<Map<String, JsonFormat.Value>> findDecorationApplyListByQuery(EnterApplyQuery enterApplyQuery);

    Long insertDecorationApply(DecorationApply decorationApply);

    int updateDecorationApply(DecorationApply decorationApply);

    int deleteDecorationApply(@Param("decorationApplyId") Long decorationApplyId);

    DecorationApply getDecorationApplyById(@Param("decorationApplyId") Long decorationApplyId);
}
