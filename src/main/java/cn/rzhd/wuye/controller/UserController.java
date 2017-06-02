package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.service.IUserService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.CustomerVO;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
© 2017 RZHD.CN
@Package: cn.rzhd.wuye.controller
@ClassName: UserController
@Description: 描述：用户管理
@author: an-wei.xie@rzhd.cn
@date: 2017年5月25日 上午10:38:39
@version: V1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;
    
    /**
     * 用户列表分页查询
     * @param pageNum	当前页码
     * @param pageSize	每页长度
     * @return	json
     */
    @RequestMapping(value = "/findUserList",method = RequestMethod.POST)
    public String findUserList(Integer pageNum,Integer pageSize){
	if (pageNum == null || pageNum <= 0) {
	    return JsonUtils.objectToJson("当前页码无效");
	}
	if (pageSize == null || pageSize <= 0) {
	    return JsonUtils.objectToJson("每页显示条数无效");
	}
	try {
	    List<Map<String, Value>> findUserList = userService.findCustomerList(pageNum, pageSize);
	    return JsonUtils.objectToJson(findUserList);
	} catch (Exception e) {
	    System.err.println("用户列表分页查询失败");
	    e.printStackTrace();
	    return JsonUtils.objectToJson("异常");
	}
    }
    
    /**
     * 用户条件查询
     * @param condition	查询条件：客户名称，手机号码
     * @param pageNum	当前页码
     * @param pageSize	每页长度
     * @return	json
     */
    @RequestMapping(value = "/findUserByCondition",method = RequestMethod.POST)
    public String findUserByCondition(String condition,Integer pageNum,Integer pageSize){
	if (pageNum == null || pageNum <= 0) {
	    return JsonUtils.objectToJson("当前页码无效");
	}
	if (pageSize == null || pageSize <= 0) {
	    return JsonUtils.objectToJson("每页显示条数无效");
	}
	if (condition == null || condition.equals("")) {
	    List<Map<String, Value>> findUserList = userService.findCustomerList(pageNum, pageSize);
	    return JsonUtils.objectToJson(findUserList);
	}
	try {
	    List<Map<String, Value>> findUserByCondition = userService.findCustomerByCondition(condition, pageNum, pageSize);
	    return findUserByCondition.toString();
	} catch (Exception e) {
	    System.err.println("用户条件查询失败");
	    e.printStackTrace();
	    return JsonUtils.objectToJson("异常");
	}
    }
    
    /**
     * 修改用户
     * @return	json
     */
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public String updateUser(CustomerVO customer){
	if(customer == null){
	    JsonUtils.objectToJson("对象为空");
	}
	if (customer.getPk_customerid() == null || customer.getPk_customerid().equals("")) {
	    JsonUtils.objectToJson("用户id无效");
	}
	try {
	    userService.updateCustomer(customer);
	} catch (Exception e) {
	    System.err.println("修改用户操作失败。");
	    e.printStackTrace();
	}
	return JsonUtils.objectToJson("用户修改成功");
    }
    
    /**
     * 删除用户
     * @param id 主键id
     * @return	json
     */
    @RequestMapping(value = "/delUserById",method = RequestMethod.POST)
    public String delUserById(Long id){
	if(id == null || id <= 0){
	    return JsonUtils.objectToJson("id参数无效");
	}
	try {
	    userService.delCustomer(id);
	} catch (Exception e) {
	    System.err.println("删除用户操作失败。");
	    e.printStackTrace();
	}
	return JsonUtils.objectToJson("用户删除成功");
    }
    
    /**
     * 拉取ERP用户信息
     * @return
     */
    @RequestMapping(value="/pullUserInfo",method=RequestMethod.POST)
    public String pullUserInfo(){
	
	String erpAllUserPull = userService.ERPAllCustomerPull();
	return JsonUtils.objectToJson(erpAllUserPull);
	
    }
    
}
