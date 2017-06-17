package cn.rzhd.wuye.controller.web;


import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.MessageManage;
import cn.rzhd.wuye.service.IHomePageService;
import cn.rzhd.wuye.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * © 2017 RZHD.CN
 *
 * @Package: cn.rzhd.wuye.controller.web
 * @ClassName: HomePageController
 * @Description: 描述：首页
 * @author: an-wei.xie@rzhd.cn
 * @date: 2017年6月5日 下午2:44:19
 * @version: V1.0
 */
@RestController
@RequestMapping("/dist/homePage")
public class HomePageController {

    @Autowired
    private IHomePageService homePageService;

    /**
     * 根据客户id查询房产信息
     *
     * @param customer
     * @return
     */
    @RequestMapping(value = "/findHouseByCustomer", method = RequestMethod.POST)
    public String findHomePageHouseByCustomer(Customer customer) {
        if (customer == null) {
            return JsonUtils.objectToJson("客户主键不能为空");
        }
        try {
            List<Map<String, Object>> result = new ArrayList<>();
            List<Map<String, Object>> findHouseByCutomer = homePageService.findHouseByCutomer(customer);
            result.addAll(findHouseByCutomer);
            return JsonUtils.objectToJson(result);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.objectToJson("服务器异常");
        }

    }

    /**
     * 根据客户查询相关费用清单
     *
     * @param customer
     * @return
     */
    @RequestMapping(value = "/findFeeListByCustomer", method = RequestMethod.POST)
    public String findFeeListByCustomer(Customer customer) {

        try {
            List<Map<String, Object>> result = new ArrayList<>();
            Map<String, Object> findFeeListByCustomerId = homePageService.findFeeListByCustomerId(customer);
            result.add(findFeeListByCustomerId);
            return JsonUtils.objectToJson(result);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.objectToJson("服务器异常");
        }
    }

    /**
     * 查询未读信息数
     *
     * @param customerid
     * @return
     */
    @RequestMapping(value = "/findMessageNumByCutromer", method = RequestMethod.POST)
    public String findMessageNumByCutromer(String customerid) {
        if (customerid == null || "".equals(customerid.trim())) {
            return JsonUtils.objectToJson("客户主键不能为空");
        }
        String[] strings = customerid.split(",");
        try {
            Integer number = 0;
            for (String customer : strings) {
                Integer findMessageNumByCustomer = homePageService.findMessageNumByCustomer(customer);
                number += findMessageNumByCustomer;
            }
            return JsonUtils.objectToJson(number);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.objectToJson("服务器异常");
        }
    }

    /**
     * 查询通知消息的标题列表
     *
     * @param customerid
     * @return
     */
    @RequestMapping(value = "/findMessageByCustomer", method = RequestMethod.POST)
    public String findMessageByCustomer(String customerid) {
        if (customerid == null || "".equals(customerid.trim())) {
            return JsonUtils.objectToJson("客户主键不能为空");
        }
        String[] strings = customerid.split(",");
        try {
            List<MessageManage> result = new ArrayList<>();
            for (String customerId : strings) {
                List<MessageManage> findMessageByCustomer = homePageService.findMessageByCustomer(customerId);
                result.addAll(findMessageByCustomer);
            }
            return JsonUtils.objectToJson(result);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.objectToJson("服务器异常");
        }

    }


}
