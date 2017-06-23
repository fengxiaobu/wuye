package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.PerfectInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CustomerCentreMapper {

    Customer findCustomer(@Param("customer") Customer customer);

    List<Map<String, Object>> findHouse(@Param("customer") Customer customer);

    void updateLogo(@Param("customer") Customer customer);

    void updatePhone(@Param("customer") Customer customer);



    void updatePerfectInformation(@Param("perfectInformation") PerfectInformation perfectInformation);

    PerfectInformation findInfoById(String customerId);

    List<PerfectInformation> getAll();
}
