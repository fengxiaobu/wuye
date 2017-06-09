package cn.rzhd.wuye.controller.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.EnterMaterial;
import cn.rzhd.wuye.bean.PerfectInformation;
import cn.rzhd.wuye.bean.PropertyFeeInvoiceDetails;
import cn.rzhd.wuye.service.IUserDataPerfectionService;
import cn.rzhd.wuye.utils.JsonUtils;

/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.wuye.controller.web
@ClassName: UserDataPerfection
@Description: 描述：个人资料完善
@author: an-wei.xie@rzhd.cn
@date: 2017年6月5日 下午4:58:19
@version: V1.0
 */
@RestController
@RequestMapping("/userData")
public class UserDataPerfectionController {

    @Autowired
    private IUserDataPerfectionService userDataPerfectionService;
    
    /**
     * 查询房产下拉菜单列表
     * @param customer
     * @return
     */
    @RequestMapping(value="/findHouseListByCustomer")
    public String findHouseListByCustomer(Customer customer){
	if (customer==null || customer.getPk_customerid() == null||customer.getPk_customerid().equals("")) {
	    return JsonUtils.objectToJson("客户主键不能为空");
	}
	
	try {
	    List<Map<String, Object>> findHouseListByCustomer = userDataPerfectionService.findHouseListByCustomer(customer);
	    return JsonUtils.objectToJson(findHouseListByCustomer);
	} catch (Exception e) {
	    e.printStackTrace();
	    return JsonUtils.objectToJson("服务器异常");
	}
	
    }
    /**
     * 资料完善
     * @param perfectInformation
     * @return
     */
    @RequestMapping(value="/userDataPerfection",method=RequestMethod.POST)
    public String AddUserDataPerfection(PerfectInformation perfectInformation){
	if (perfectInformation == null || perfectInformation.getPerfectInformationId()==null) {
	    return JsonUtils.objectToJson("主键ID不能为空");
	}
	try {
	    userDataPerfectionService.addUserDataPerfection(perfectInformation);
	    return JsonUtils.objectToJson("success");
	} catch (Exception e) {
	    e.printStackTrace();
	    return JsonUtils.objectToJson("服务器异常");
	}
    }
    
//    /**
//     * 入驻办理资料
//     * @param enterMaterial
//     * @return
//     */
//    @RequestMapping(value="/addEnterTransactMaterial",method=RequestMethod.POST)
//    public String addEnterTransactMaterial(EnterMaterial enterMaterial){
//	userDataPerfectionService.addEnterTransactMaterial(enterMaterial);
//	return JsonUtils.objectToJson("success");
//	
//    }
//    /**
//     * 费用缴纳查询
//     * @param customerId
//     * @param houseId
//     * @return
//     */
//    @RequestMapping(value="/feePaymentByHouseId",method=RequestMethod.POST)
//    public String feePaymentByHouseId(String customerId,String houseId){
//	return houseId;
//	
//    }
//    
//    /**
//     *  完善资料完成后通知信息
//     * @return
//     */
//    public String dataPerfectionMessage(){
//	return null;
//	
//    }
//    
//    public String propertyFeePayInfo(String customerId,String houseId){
//	return null;
//	
//    }
//    
//    /**
//     * 物业费开具发票
//     * @return
//     */
//    public String payPropertyFeeInvoice(PropertyFeeInvoiceDetails propertyFeeInvoiceDetails){
//	userDataPerfectionService.payPropertyFeeInvoice(propertyFeeInvoiceDetails);
//	return JsonUtils.objectToJson("success");
//	
//    }
}
