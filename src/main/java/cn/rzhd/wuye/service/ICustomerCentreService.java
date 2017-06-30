package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.PerfectInformation;

public interface ICustomerCentreService {

    <T> T findCustomerInfo(Customer customer);
    
    void updateLogo(String LOGO,String vccode);
    
    void updatePhone(String bindingPhone,String vccode);
    
    /**
     * @param customerId
     * @return 通过当前客户id拿到对应的详细资料
     */
    PerfectInformation getPerfectInformation(String customerId);
    
    void updatePerfectInformation(PerfectInformation perfectInformation);

	void updatePassword(String password, String vccode);
}
