package cn.rzhd.wuye.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.MessageManage;
import cn.rzhd.wuye.bean.vo.KfFeeHouseInfoDetailsVo;
import cn.rzhd.wuye.bean.vo.PropertyFeeHouseInfoDetailsVo;

@Mapper
public interface HomePageMapper {

    List<Map<String, Object>> findHomePageHouseByCustomer(@Param("customer")Customer customer);
    
//    <T> T findFeeListByHouseId(@Param("houseId")String houseId);
    
    List<Map<String, Object>> findKfFeeListByCustomerId(Customer customer);
    
    List<Map<String, Object>> findPropertyFeeListByCustomerId(@Param("customer")Customer customer);
    
    <T> T findMessageNumByCustomer(@Param("customer")Customer customer);
    
    List<MessageManage> findMessageByCustomer(@Param("customer")Customer customer);
}
