package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.vo.query.ApplyQuery;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/5/25 创建.
 * 入驻申请
 */
@Mapper
public interface EnterApplyMapper {

    List<Map<String, JsonFormat.Value>> getEnterApplyByID(@Param("enterApplyId") Long enterApplyId);

    /**
     * 查询所有装修结果
     *
     * @param pkHouse
     * @return
     */
    List<Map<String, JsonFormat.Value>> getEnterApplyByIDAndState(@Param("pkHouse") String pkHouse);

    List<Map<String, JsonFormat.Value>> findEnterApplyList();

    int insertEnterApply(EnterApply enterApply);

    int deleteEnterApply(@Param("enterApplyId") Long enterApplyId);

    int updateEnterApply(EnterApply enterApply);

    List<Map<String, JsonFormat.Value>> findEnterApplyByQuery(ApplyQuery enterApplyQuery);

    void updatePayState(@Param("wyState") String wyState, @Param("kfState") String kfState, @Param("enterApplyId") Long enterApplyId);

    Integer getCount(@Param("pkHouse") String pkHouse, @Param("customerId") String customerId);

    EnterApply getEnterApply(@Param("pkHouse") String pkHouse, @Param("customerId") String customerId);
}
