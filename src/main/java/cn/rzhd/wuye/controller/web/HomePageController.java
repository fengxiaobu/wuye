package cn.rzhd.wuye.controller.web;


import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.MessageManage;
import cn.rzhd.wuye.service.ICustomerService;
import cn.rzhd.wuye.service.IHomePageService;
import cn.rzhd.wuye.service.IRentContractService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.PactVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
    @Autowired
    private IRentContractService rentContractService;
    @Autowired
    private ICustomerService customerService;

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
            List<Map<String, Object>> findHouseByCutomer = homePageService.findHouseByCutomer(customer);
            return JsonUtils.objectToJson(findHouseByCutomer);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.objectToJson("服务器异常");
        }

    }

    /**
     * 根据客户查询相关费用清单
     *
     * @param customerId
     * @return
     */
    @RequestMapping(value = "/findFeeListByCustomer", method = RequestMethod.POST)
    public String findFeeListByCustomer(@RequestBody String customerId) {
//        Map<String,Object> map = new HashMap<>();
//        try {
//            for (Customer customer : customers) {
//                Map<String, Object> findFeeListByCustomerId = homePageService.findFeeListByCustomerId(customer);
//                map.putAll(findFeeListByCustomerId);
//            }
//
//            return JsonUtils.objectToJson(map);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return JsonUtils.objectToJson("服务器异常");
//        }
        if (customerId==null || "".equals(customerId.trim())){
            return JsonUtils.objectToJson("客户主键不能为空!");
        }
        String[] split = customerId.split(",");
        List<Map<String,Object>> result = new ArrayList<>();
        for (String s : split) {
            List<PactVO> pactVOS = rentContractService.queryByCustomer(s);
            for (PactVO pactVO : pactVOS) {
                String pk_house = pactVO.getPk_house();
                String pk_customerid = pactVO.getPk_customerid();
                List<Map<String, Object>> list = homePageService.findFeeListByCustomerId(pk_customerid, pk_house);
                result.addAll(list);
            }

        }
        return JsonUtils.objectToJson(result);
    }

    /**
     * 查询未读信息数
     *
     * @param pk_customerid
     * @return
     */
    @RequestMapping(value = "/findMessageNumByCutromer", method = RequestMethod.POST)
    public String findMessageNumByCutromer(@RequestBody String pk_customerid) {
        if (pk_customerid == null || "".equals(pk_customerid.trim())) {
            return JsonUtils.objectToJson("客户主键不能为空");
        }
        String[] strings = pk_customerid.split(",");
        try {
            Integer number = 0;
            for (String customer : strings) {
                Integer findMessageNumByCustomer = homePageService.findMessageNumByCustomer(customer.trim());
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
     * @param pk_customerid
     * @return
     */
    @RequestMapping(value = "/findMessageByCustomer",method = RequestMethod.POST)
    public String findMessageByCustomer(@RequestBody String pk_customerid) {
        if (pk_customerid == null || "".equals(pk_customerid.trim())) {
            return JsonUtils.objectToJson("客户主键不能为空");
        }
        String[] strings = pk_customerid.split(",");
        try {
            List<MessageManage> result = new ArrayList<>();
            for (String customerId : strings) {
                List<MessageManage> findMessageByCustomer = homePageService.findMessageByCustomer(customerId.trim());
                result.addAll(findMessageByCustomer);
            }
            return JsonUtils.objectToJson(result);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.objectToJson("服务器异常");
        }

    }


}
