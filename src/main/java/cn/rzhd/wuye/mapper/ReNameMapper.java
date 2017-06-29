package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.ReName;
import org.apache.ibatis.annotations.Mapper;

/**
 * luopa 在 2017/6/28 创建.
 */
@Mapper
public interface ReNameMapper {
    /**
     * 获取更名须知
     *
     * @return
     */
    ReName getAll();
}
