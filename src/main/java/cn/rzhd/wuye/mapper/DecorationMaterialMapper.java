package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.DecorationMaterial;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    List<Map<String, JsonFormat.Value>> findByQuery(@Param("decorationApplyId") Long decorationApplyId);
}
