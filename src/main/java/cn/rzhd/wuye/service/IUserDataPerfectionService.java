package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.PerfectInformation;

public interface IUserDataPerfectionService {
    
    public <T> T findHouseListByCustomer(Customer customer);
    
    public void addUserDataPerfection(PerfectInformation perfectInformation);

}
