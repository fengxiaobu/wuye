package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.PerfectInformation;

public interface ICustomerCentreService {

    <T> T findCustomerInfo(Customer customer);
    
    void updateLogo(Customer customer);
    
    void updatePhone(Customer customer);
    
    void updatePerfectInformation(PerfectInformation perfectInformation);
}
