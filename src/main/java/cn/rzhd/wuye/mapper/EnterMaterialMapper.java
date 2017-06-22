package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.EnterMaterial;
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
     * @param pkproject
     * @return
     */
    EnterMaterial findEnterMaterialBypkproject(@Param("pkproject") String pkproject);

    /**
     * 根据ID查询入驻资料信息
     *
     * @param enterMaterialId
     * @return
     */
    EnterMaterial findEnterMaterialByKey(@Param("enterMaterialId") Long enterMaterialId);
}
