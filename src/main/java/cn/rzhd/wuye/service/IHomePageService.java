package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.Customer;

public interface IHomePageService {

    public <T> T findHouseByCutomer(Customer customer);
    
    public <T> T findFeeListByCustomerId(Customer customer);
    
    public <T> T findMessageNumByCustomer(Customer customer);
    
    public <T> T findMessageByCustomer(Customer customer);

}
