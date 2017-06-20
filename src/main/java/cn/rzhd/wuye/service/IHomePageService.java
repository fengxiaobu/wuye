package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.Customer;

import java.util.List;
import java.util.Map;

public interface IHomePageService {

    public <T> T findHouseByCutomer(Customer customer);

    List<Map<String, Object>> findFeeListByCustomerId(String pk_customerId, String pk_house);
    
    public <T> T findMessageNumByCustomer(String customerId);
    
    public <T> T findMessageByCustomer(String customerId);

}
