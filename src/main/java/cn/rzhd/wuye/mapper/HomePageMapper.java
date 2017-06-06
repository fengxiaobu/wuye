package cn.rzhd.wuye.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.rzhd.wuye.bean.Customer;

@Mapper
public interface HomePageMapper {

    <T> T findHomePageHouseByCustomer(@Param("customer")Customer customer);
    
//    <T> T findFeeListByHouseId(@Param("houseId")String houseId);
    
    <T> T findKfFeeListByCustomerId(@Param("customer")Customer customer);
    
    <T> T findPropertyFeeListByCustomerId(@Param("customer")Customer customer);
    
    <T> T findMessageNumByCustomer(@Param("customer")Customer customer);
    
    <T> T findMessageByCustomer(Customer customer);
}
