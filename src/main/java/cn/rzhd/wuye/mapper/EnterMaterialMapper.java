package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.EnterMaterial;
import cn.rzhd.wuye.vo.query.ApplyQuery;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/6/5 创建.
 * <p>
 * 入驻资料
 */
@Mapper
public interface EnterMaterialMapper {
    /**
     * 查询入驻资料夹
     *
     * @return
     */
    List<Map<String, JsonFormat.Value>> findEnterMaterial();

    /**
     * 根据房产ID查询入驻资料信息
     *
     * @param query
     * @return
     */
    List<Map<String, JsonFormat.Value>> findEnterMaterialBypkproject(ApplyQuery query);

    /**
     * 根据ID查询入驻资料信息
     *
     * @param enterMaterialId
     * @return
     */
    EnterMaterial findEnterMaterialByKey(@Param("enterMaterialId") Long enterMaterialId);

    /**
     * 查询项目资料
     *
     * @param trim
     * @return
     */
    EnterMaterial findEnterMaterialBypkprojectId(@Param("pkProject") String trim);

    /**
     * 新增
     *
     * @param enterMaterial
     */
    void insertEnterMaterial(EnterMaterial enterMaterial);

    /**
     * 删除
     *
     * @param enterMaterialId
     */
    void delEnterMaterial(@Param("enterMaterialId") Long enterMaterialId);
}
