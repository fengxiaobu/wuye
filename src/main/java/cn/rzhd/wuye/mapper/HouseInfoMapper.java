package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.HouseInfo;
import cn.rzhd.wuye.vo.HouseVO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhongchaojie on 2017/5/25.
 *
 */
@Mapper
public interface HouseInfoMapper {

    HouseInfo getById(String houseInfoId);

    List<HouseInfo> getAll();

    void add(HouseInfo houseInfo);

    void update(HouseInfo houseInfo);

    void delete(Long id);

<<<<<<< HEAD
    List<HouseInfo> selectByQuery(@Param("customerid") String customerid);
    
=======
    HouseInfo selectByQuery(@Param("customerid") String customerid);

>>>>>>> abbbe119b4e270093b02bacdd5bf922ec7aa8e04
}
