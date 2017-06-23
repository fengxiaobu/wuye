package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.HouseInfoDetails;
import cn.rzhd.wuye.bean.ReletApply;
import cn.rzhd.wuye.bean.RetreatLeaseApply;
import cn.rzhd.wuye.service.*;
import cn.rzhd.wuye.utils.JsonResult;
import cn.rzhd.wuye.vo.PactVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    IRentContractService rentContractService;
    @Autowired
    IReletApplyService reletApplyService;
    @Autowired
    IRetreatLeaseApplyService retreatLeaseApplyService;
    @Autowired
    IHouseInfoDetailsService houseInfoDetailsService;

    /**
     * @param customer 通过Customer对象将vccode账号,password密码(未加密)封装起来
     * @return json对象, 包含房产id及房产名称
     */
    @RequestMapping("/login")
    public JsonResult login( Customer customer) {
        List<Customer> customers = customerService.loginByPwd(customer);
        if (customers.isEmpty()) {
            return new JsonResult("账号或密码错误!!!");
        } else {
            JsonResult result = new JsonResult();
            //只取租赁客户
            for (Customer cus : customers) {
                List<PactVO> pactVOS = rentContractService.queryByCustomer(cus.getPk_customerid());
                for (PactVO vo : pactVOS) {
                    ReletApply reletApply = reletApplyService.findReletApply(vo.getPk_house());
                    RetreatLeaseApply retreatLeaseApply = retreatLeaseApplyService.findRetreatLeaseApply(vo.getPk_house());
                    //获取房产状态
                    HouseInfoDetails houseInfoDetails = houseInfoDetailsService.selectByPkHouse(vo.getPk_house());
                    if (reletApply != null) {
                        vo.setContractStatus("1");
                    } else if (retreatLeaseApply != null) {
                        vo.setContractStatus("-1");
                    } else {
                        vo.setContractStatus("0");
                    }
                    if (houseInfoDetails != null) {
                        vo.setHouseInfoDetails(houseInfoDetails);
                    }
                }
                cus.getHouseInfos().addAll(pactVOS);
            }
            result.getData().addAll(customers);

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
