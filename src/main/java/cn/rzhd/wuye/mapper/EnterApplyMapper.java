package cn.rzhd.wuye.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.rzhd.wuye.bean.EnterApply;

import java.util.List;

/**
 * luopa 在 2017/5/25 创建.
 */
@Mapper
public interface EnterApplyMapper{
    EnterApply getEnterApplyByID(Long enterApplyId);
    List<EnterApply> getEnterApplyAll();
}
