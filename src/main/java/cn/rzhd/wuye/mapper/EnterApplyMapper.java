package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.vo.EnterApplyQuery;
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
public interface EnterApplyMapper{

    EnterApply getEnterApplyByID(@Param("enterApplyId") Long enterApplyId);

    List<Map<String, JsonFormat.Value>>  findEnterApplyList();

    int insertEnterApply(EnterApply enterApply);

    int deleteEnterApply(@Param("enterApplyId") Long enterApplyId);

    int updateEnterApply(EnterApply enterApply);

    List<Map<String, JsonFormat.Value>> findEnterApplyByQuery(EnterApplyQuery enterApplyQuery);
}
