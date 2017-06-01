package cn.rzhd.wuye.mapper;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.annotations.Mapper;

import cn.rzhd.wuye.bean.EnterApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/5/25 创建.
 */
@Mapper
public interface EnterApplyMapper{
    EnterApply getEnterApplyByID(@Param("enterApplyId") Long enterApplyId);
   // List<Map<String, JsonFormat.Value>>  findEnterApplyList(@Param("pageStartRow")Integer pageStartRow, @Param("pageEndRow") Integer pageEndRow);
    List<Map<String, JsonFormat.Value>>  findEnterApplyList();
}
