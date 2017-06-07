package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.DecorationMaterial;

import java.util.List;

/**
 * luopa 在 2017/6/7 创建.
 */
public interface IDecorationMaterialService {
    int deleteByPrimaryKey(Long decorationMaterialId);

    int insert(DecorationMaterial record);

    DecorationMaterial selectByPrimaryKey(Long decorationMaterialId);

    List<DecorationMaterial> selectAll();

    int updateByPrimaryKey(DecorationMaterial record);
}
