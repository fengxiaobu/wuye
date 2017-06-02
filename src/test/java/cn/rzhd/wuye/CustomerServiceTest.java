package cn.rzhd.wuye;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.service.ICustomerService;
import cn.rzhd.wuye.utils.MD5Utils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hasee on 2017/6/1.
 */
public class CustomerServiceTest extends BaseTest {
    @Autowired
    ICustomerService service;

    @Test
    public void loginTest(){
        Customer cus = new Customer();
        String username="test";
        cus.setVccode(username);
        String tempPassword="123456";
        String s = MD5Utils.md5(tempPassword);
        cus.setPassword(s);
        Customer customer = service.loginByPwd(cus);
        System.out.println(customer);
    }
}
