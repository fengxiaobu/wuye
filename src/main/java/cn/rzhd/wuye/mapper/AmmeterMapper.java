package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.Ammeter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by hasee on 2017/6/10.
 */
@Mapper
public interface AmmeterMapper {
    List<Ammeter> queryAmmeters(@Param("houseInfoId") String houseInfoId);

    List<Ammeter> getAllAmmeters();

    void insert(Ammeter ammeter);

    void del(String id);
}
