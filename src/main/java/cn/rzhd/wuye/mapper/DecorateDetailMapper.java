package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.DecorateDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * luopa 在 2017/6/7 创建.
 * <p>
 * 装修明细实体类
 */
@Mapper
public interface DecorateDetailMapper {
    int deleteByPrimaryKey(Long decorateDetailId);

    int insert(DecorateDetail record);

    DecorateDetail selectByPrimaryKey(Long decorateDetailId);

    List<DecorateDetail> selectAll();

    int updateByPrimaryKey(DecorateDetail record);
}
