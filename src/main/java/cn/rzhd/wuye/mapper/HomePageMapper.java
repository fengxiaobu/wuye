package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.MessageManage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface HomePageMapper {

    List<Map<String, Object>> findHomePageHouseByCustomer(@Param("customer")Customer customer);
    
//    <T> T findFeeListByHouseId(@Param("houseId")String houseId);
    
    List<Map<String, Object>> findKfFeeListByCustomerId(Customer customer);
    
    List<Map<String, Object>> findPropertyFeeListByCustomerId(@Param("customer")Customer customer);
    
    <T> T findMessageNumByCustomer(String customerId);
    
    List<MessageManage> findMessageByCustomer(String customerId);
}
