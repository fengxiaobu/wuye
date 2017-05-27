package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.mapper.UserMapper;
import cn.rzhd.wuye.service.IUserService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.CustomerVO;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import cn.rzhd.wuye.wsclient.IExamDataServiceStub;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonFormat.Value;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserMapper mapper;

	@Override
	public List<Map<String, Value>> findUserList(Integer pageNum, Integer pageSize) {
	    Integer pageStartRow = pageNum*pageSize-pageSize+1;
	    Integer pageEndRow = pageStartRow+pageSize-1;
	   List<Map<String, Value>> findUserList = mapper.findUserList(pageStartRow,pageEndRow );
	   return findUserList;
	}
	
	@Override
	public List<Map<String, Value>> findUserByCondition(String condition, Integer pageNum, Integer pageSize) {
	    Integer pageStartRow = pageNum*pageSize-pageSize+1;
	    Integer pageEndRow = pageStartRow+pageSize-1;
	    List<Map<String, Value>> findUserByCondition = mapper.findUserByCondition(condition, pageStartRow, pageEndRow);
	    return findUserByCondition;
	}

	public void updateUser(User user) {
	    mapper.updateUser(user);
	    
	}

	@Override
	public void delUser(Long userId) {
	    mapper.delUserById(userId);
	    
	}

	@Override
	public String ERPAllUserPull() {
	    //拉起销售客户
	    RequesterVO requesterVO = new RequesterVO();
	    requesterVO.setKey("liando");
	    requesterVO.setPk_corp("1031");
	    requesterVO.setBilltype(LiandoServiceConstant.DATA_TYPE_SELL_CUSTOMER);
	    String baseDataTest = WebService.getBaseDataTest(requesterVO);
	    ResponseVO jsonToPojo = JsonUtils.jsonToPojo(baseDataTest, ResponseVO.class);
	    if (jsonToPojo.getIssuccess().equals("Y")) {
		CustomerVO[] customerdata = jsonToPojo.getCustomerdata();
		for (CustomerVO customerVO : customerdata) {
		    User findUserIsRepetitionByErpId = mapper.findUserIsRepetitionByErpId(customerVO.getPk_customerid());
		    if (findUserIsRepetitionByErpId == null) {
			 User user = new User();
			 Long findMaxUserId = mapper.findMaxUserId();
			 if (findMaxUserId==null) {
			     user.setUserId(Long.valueOf(1));
			 }else {
			     user.setUserId(findMaxUserId+1);
			 }
			 
			 user.setClientName(customerVO.getVcname());
			 user.setErpId(customerVO.getPk_customerid());
			 user.setFccategory(Integer.valueOf(customerVO.getFccategory()));
			 mapper.addUser(user);
		    }
		   
		}
	    }
	    //拉取租赁客户
	    RequesterVO requesterVO1 = new RequesterVO();
	    requesterVO1.setKey("liando");
	    requesterVO1.setPk_corp("1031");
	    requesterVO1.setBilltype(LiandoServiceConstant.DATA_TYPE_RENT_CUSTOMER);
	    String baseDataTest1 = WebService.getBaseDataTest(requesterVO);
	    ResponseVO jsonToPojo1 = JsonUtils.jsonToPojo(baseDataTest1, ResponseVO.class);
	    if (jsonToPojo1.getIssuccess().equals("Y")) {
		CustomerVO[] customerdata = jsonToPojo1.getCustomerdata();
		for (CustomerVO customerVO : customerdata) {
		    User findUserIsRepetitionByErpId = mapper.findUserIsRepetitionByErpId(customerVO.getPk_customerid());
		    if (findUserIsRepetitionByErpId == null ||
			    Integer.valueOf(customerVO.getFccategory()) != findUserIsRepetitionByErpId.getFccategory()
			    ){
			 User user = new User();
			 Long findMaxUserId = mapper.findMaxUserId();
			 if (findMaxUserId==null) {
			     user.setUserId(Long.valueOf(1));
			 }else {
			     user.setUserId(findMaxUserId+1);
			 }
			 user.setClientName(customerVO.getVcname());
			 user.setErpId(customerVO.getPk_customerid());
			 user.setFccategory(Integer.valueOf(customerVO.getFccategory()));
			 mapper.addUser(user);
		    }
		   
		}
	    }
	    return "更新完成";
	}
	
	
}
