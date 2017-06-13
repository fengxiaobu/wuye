package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.service.ICustomerService;
import cn.rzhd.wuye.service.IRentContractService;
import cn.rzhd.wuye.service.ISellContractService;
import cn.rzhd.wuye.utils.JsonResult;
import cn.rzhd.wuye.vo.PactVO;
import cn.rzhd.wuye.vo.SignVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by hasee on 2017/6/1.
 */
@RestController
@RequestMapping("/dist/customer")
public class LoginController {
    @Autowired
    ICustomerService customerService;
    @Autowired
    ISellContractService sellContractService;
    @Autowired
    IRentContractService rentContractService;

    /**
     *
     * @param customer 通过Customer对象将vccode账号,password密码(未加密)封装起来
     * @return json对象,包含房产id及房产名称
     */
    @RequestMapping("/login")
    public JsonResult login(Customer customer){
        List<Customer> customers = customerService.loginByPwd(customer);
        if (customers.isEmpty()){
            return new JsonResult("账号或密码错误!");
        }else{
            JsonResult result = new JsonResult();
            //因ERP数据问题,暂取第一个客户
            Customer cus = customers.get(0);
            List<Object> houseInfos = new ArrayList<>();
            List<SignVO> signVOS = sellContractService.queryByCustomer(cus.getPk_customerid());
            List<PactVO> pactVOS = rentContractService.queryByCustomer(cus.getPk_customerid());
            houseInfos.addAll(signVOS);
            houseInfos.addAll(pactVOS);
            HashMap<String, Object> map = new HashMap<>();
            map.put("houseInfos",houseInfos);
            map.put("customer",cus);
            result.getData().add(map);

//            for (Customer cus : customers) {
//                String customerid = cus.getPk_customerid();
//                List<SignVO> signVOS = sellContractService.queryByCustomer(cus.getPk_customerid());
//                //List<PactVO> pactVOS = rentContractService.queryByCustomer(cus.getPk_customerid());
//                if (!signVOS.isEmpty()){
//                    result.getData().add(signVOS);
//                }
////                if (!pactVOS.isEmpty()){
////                    result.getData().add(pactVOS);
////                }
//            }
            return result;
        }
    }
}
