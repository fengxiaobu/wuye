package cn.rzhd.wuye.controller.web;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.MessageManage;
import cn.rzhd.wuye.service.IHomePageService;
import cn.rzhd.wuye.utils.JsonUtils;
/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.wuye.controller.web
@ClassName: HomePageController
@Description: 描述：首页
@author: an-wei.xie@rzhd.cn
@date: 2017年6月5日 下午2:44:19
@version: V1.0
 */
@RestController
@RequestMapping("/homePage")
public class HomePageController {

    @Autowired
    private IHomePageService homePageService;
    
    /**
     * 根据客户id查询房产信息
     * @param customer
     * @return
     */
    @RequestMapping(value="/findHouseByCustomer",method=RequestMethod.POST)
    public String findHomePageHouseByCustomer(Customer customer){
	List<Map<String, Object>> findHouseByCutomer = homePageService.findHouseByCutomer(customer);
	return JsonUtils.objectToJson(findHouseByCutomer);
    }
    
    /**
     * 根据客户查询相关费用清单
     * @param houseId
     * @return
     */
    @RequestMapping(value="/findFeeListByCustomer",method=RequestMethod.POST)
    public String findFeeListByCustomer(Customer customer){
	Map<String, Object> findFeeListByCustomerId = homePageService.findFeeListByCustomerId(customer);
	return JsonUtils.objectToJson(findFeeListByCustomerId);
    }
    
    /**
     * 查询未读信息数
     * @param customer
     * @return
     */
    @RequestMapping(value="/findMessageNumByCutromer",method=RequestMethod.POST)
    public String findMessageNumByCutromer(Customer customer){
	Integer findMessageNumByCustomer = homePageService.findMessageNumByCustomer(customer);
	return JsonUtils.objectToJson(findMessageNumByCustomer);
	
    }
    
    /**
     * 查询通知消息的标题列表
     * @param customer
     * @return
     */
    @RequestMapping(value="/findMessageByCustomer",method=RequestMethod.POST)
    public String findMessageByCustomer(Customer customer){
	List<MessageManage> findMessageByCustomer = homePageService.findMessageByCustomer(customer);
	return JsonUtils.objectToJson(findMessageByCustomer);
	
    }
    
    
}
