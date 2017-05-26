package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.HouseInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by hasee on 2017/5/25.
 */
@Mapper
public interface HouseInfoMapper {
    HouseInfo getById(Long id);
}
