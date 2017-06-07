package cn.rzhd.wuye.mapper;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.annotations.Mapper;

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
     * @return
     */
    List<Map<String, JsonFormat.Value>> findEnterMaterial();
}
