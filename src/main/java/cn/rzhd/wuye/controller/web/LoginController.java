package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.service.ICustomerService;
import cn.rzhd.wuye.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hasee on 2017/6/1.
 */
@RestController
public class LoginController {
    @Autowired
    ICustomerService customerService;

    /**
     *
     * @param customer 通过Customer对象将vccode账号,password密码(未加密)封装起来
     * @return
     */
    @RequestMapping("/login")
    public JsonResult login(Customer customer){
        Customer loginCustomer = customerService.loginByPwd(customer);
        if (loginCustomer == null){
            return new JsonResult("账号或密码错误!");
        }else{
            return new JsonResult();
        }
    }
}
