package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.DecorationApply;
import cn.rzhd.wuye.vo.query.ApplyQuery;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/6/6 创建.
 * 装修申请表
 */
@Mapper
public interface DecorationApplyMapper {

    int deleteByPrimaryKey(Long decorationApplyId);

    int insert(DecorationApply record);

    DecorationApply selectByPrimaryKey(@Param("decorationApplyId") Long decorationApplyId);

    int updateByPrimaryKey(DecorationApply record);

    List<Map<String, JsonFormat.Value>> findDecorationApplyList();

    List<Map<String, JsonFormat.Value>> findDecorationApplyListByQuery(ApplyQuery enterApplyQuery);

    DecorationApply findDecorationApplyByHouseId(@Param("houseInfoId") String houseInfoId);

    void updatePayState(@Param("paymentStatus") String paymentStatus, @Param("decorationApplyId") Long decorationApplyId);

    Integer getCount(@Param("pkHouse") String pkHouse, @Param("customerId") String customerId);

    DecorationApply getDecorationApplyByOrder(@Param("pkHouse") String pkHouse, @Param("customerId") String customerId);
}
