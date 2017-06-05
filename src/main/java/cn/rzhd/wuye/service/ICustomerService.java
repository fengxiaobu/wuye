package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.vo.CustomerVO;

/**
 * Created by hasee on 2017/6/1.
 */
public interface ICustomerService {

    Customer loginByPwd(Customer customer);

    void addCustomer(CustomerVO customer);

}
