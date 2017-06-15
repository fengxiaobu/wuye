package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.ReletApply;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * luopa 在 2017/6/15 创建.
 * 续租申请
 */
@Mapper
public interface ReletApplyMapper {
    int deleteByPrimaryKey(Long reletApplyId);

    int insert(ReletApply record);

    ReletApply selectByPrimaryKey(Long reletApplyId);

    List<ReletApply> selectAll();

    int updateByPrimaryKey(ReletApply record);
}
