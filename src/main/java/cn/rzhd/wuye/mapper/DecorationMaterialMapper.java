package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.DecorationMaterial;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * luopa 在 2017/6/7 创建.
 * 装修资料
 */
@Mapper
public interface DecorationMaterialMapper {
    int deleteByPrimaryKey(Long decorationMaterialId);

    int insert(DecorationMaterial record);

    DecorationMaterial selectByPrimaryKey(Long decorationMaterialId);

    List<DecorationMaterial> selectAll();

    int updateByPrimaryKey(DecorationMaterial record);
}
