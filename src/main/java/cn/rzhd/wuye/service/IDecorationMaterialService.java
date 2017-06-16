package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.DecorationMaterial;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/6/7 创建.
 */
public interface IDecorationMaterialService {
    int deleteByPrimaryKey(Long decorationMaterialId);

    int insert(DecorationMaterial record);

    DecorationMaterial selectByPrimaryKey(Long decorationMaterialId);

    List<DecorationMaterial> selectAll();

    int updateByPrimaryKey(DecorationMaterial record);

    List<Map<String, JsonFormat.Value>> findByQuery(Long decorationApplyId);
}
