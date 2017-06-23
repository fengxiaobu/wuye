package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.HouseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhongchaojie on 2017/5/25.
 */
@Mapper
public interface HouseInfoMapper {

    HouseInfo getById(@Param("houseInfoId") String houseInfoId);

    List<HouseInfo> getAll();

    void add(HouseInfo houseInfo);

    void update(HouseInfo houseInfo);

    void delete(Long id);

    HouseInfo selectByQuery(@Param("customerid") String customerid);
    
    List<HouseInfo> getHouseInfo();

}
