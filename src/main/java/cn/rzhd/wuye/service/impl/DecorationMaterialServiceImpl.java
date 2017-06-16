package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.DecorationMaterial;
import cn.rzhd.wuye.mapper.DecorationMaterialMapper;
import cn.rzhd.wuye.service.IDecorationMaterialService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/6/7 创建.
 * 装修资料
 */
@Service
public class DecorationMaterialServiceImpl implements IDecorationMaterialService {
    @Autowired
    DecorationMaterialMapper decorationMaterialMapper;

    /**
     * 根据ID删除装修资料信息
     *
     * @param decorationMaterialId
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long decorationMaterialId) {
        return decorationMaterialMapper.deleteByPrimaryKey(decorationMaterialId);
    }

    /**
     * 新增装修资料
     *
     * @param record
     * @return
     */
    @Override
    public int insert(DecorationMaterial record) {
        return decorationMaterialMapper.insert(record);
    }

    /**
     * 根据ID查询
     *
     * @param decorationMaterialId
     * @return
     */
    @Override
    public DecorationMaterial selectByPrimaryKey(Long decorationMaterialId) {
        return decorationMaterialMapper.selectByPrimaryKey(decorationMaterialId);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<DecorationMaterial> selectAll() {
        return decorationMaterialMapper.selectAll();
    }

    /**
     * 更新装修资料
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(DecorationMaterial record) {
        return decorationMaterialMapper.updateByPrimaryKey(record);
    }

    /**
     * 查询资料
     * @param decorationApplyId
     * @return
     */
    @Override
    public List<Map<String, JsonFormat.Value>> findByQuery(Long decorationApplyId) {
        return null;
    }

}
