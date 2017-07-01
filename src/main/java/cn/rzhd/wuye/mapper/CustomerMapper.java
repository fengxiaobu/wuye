package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.vo.CustomerVO;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/1.
 * 针对客户进行操作
 */
@Mapper
public interface CustomerMapper {
    /**
     * @param customer 将账号为客户编码  密码初始为MD5编码后的123456封装到Customer对象中
     * @return 账号密码吻合的Customer
     */
    List<Customer> loginByPwd(Customer customer);

    List<Map<String, Value>> findCustomerList(@Param("pageStartRow") Integer pageStartRow, @Param("pageEndRow") Integer pageEndRow);

    List<Map<String, Value>> findCustomerByCondition(@Param("condition") String condition, @Param("pageStartRow") Integer pageStartRow, @Param("pageEndRow") Integer pageEndRow);

    void updateCustomer(@Param("customerVo") CustomerVO customerVo);

    void delCustomerById(@Param("customerId") Long customerId);

    Customer findCustomerIsRepetitionByErpId(@Param("customerId") String customerId);

    void addCustomer(@Param("customerVo") CustomerVO customerVo);

    List<Customer> getAll();

    void updadteState(@Param("currentFlow") String currentFlow, @Param("houseInfoId") String houseInfoId);
}
