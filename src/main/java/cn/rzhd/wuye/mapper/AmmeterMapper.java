package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.Ammeter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hasee on 2017/6/10.
 */
@Mapper
public interface AmmeterMapper {
    List<Ammeter> queryAmmeters(String houseInfoId);
}
