package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.mapper.CustomerMapper;
import cn.rzhd.wuye.service.ICustomerService;
import cn.rzhd.wuye.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/6/1.
 */
@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    CustomerMapper mapper;

    /**
     * 在接收到封装了vccode和password的Customer对象后,取出password进行加密并重新赋值进去
     * @param customer
     * @return
     */
    @Override
    public Customer loginByPwd(Customer customer) {
        customer.setPassword(MD5Utils.md5(customer.getPassword()));
        return mapper.loginByPwd(customer);
    }
}