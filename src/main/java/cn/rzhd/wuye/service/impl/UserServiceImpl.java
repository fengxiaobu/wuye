package cn.rzhd.wuye.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.rzhd.wuye.bean.Role;
import cn.rzhd.wuye.mapper.HouseInfoDetailsMapper;
import cn.rzhd.wuye.mapper.ManageVOMapper;
import cn.rzhd.wuye.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonFormat.Value;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.mapper.CustomerMapper;
import cn.rzhd.wuye.mapper.UserMapper;
import cn.rzhd.wuye.service.IUserService;
import cn.rzhd.wuye.utils.JsonUtils;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	CustomerMapper mapper;

	@Autowired
	UserMapper userMapper;

	@Autowired
	HouseInfoDetailsMapper houseInfoDetailsMapper;

	@Autowired
	ManageVOMapper manageMapper;

	@Override
	public List<Map<String, Value>> findCustomerList(Integer pageNum, Integer pageSize) {
		Integer pageStartRow = pageNum * pageSize - pageSize + 1;
		Integer pageEndRow = pageStartRow + pageSize - 1;
		List<Map<String, Value>> findCustomerList = mapper.findCustomerList(pageStartRow, pageEndRow);
		return findCustomerList;
	}

	@Override
	public List<Map<String, Value>> findCustomerByCondition(String condition, Integer pageNum, Integer pageSize) {
		Integer pageStartRow = pageNum * pageSize - pageSize + 1;
		Integer pageEndRow = pageStartRow + pageSize - 1;
		List<Map<String, Value>> findCustomerByCondition = mapper.findCustomerByCondition(condition, pageStartRow,
				pageEndRow);
		return findCustomerByCondition;
	}

	public void updateCustomer(CustomerVO customerVo) {
		mapper.updateCustomer(customerVo);

	}

	@Override
	public void delCustomer(Long customerId) {
		mapper.delCustomerById(customerId);

	}

	@Override
	public String ERPAllCustomerPull() {
		// 拉起销售客户
//		RequesterVO requesterVO = new RequesterVO();
//		requesterVO.setKey("liando");
//		requesterVO.setPk_corp("1031");
//		requesterVO.setBilltype(LiandoServiceConstant.DATA_TYPE_SELL_CUSTOMER);
//		String baseDataTest = WebService.getBaseData(requesterVO);
//		ResponseVO jsonToPojo = JsonUtils.jsonToPojo(baseDataTest, ResponseVO.class);
//		if (jsonToPojo.getIssuccess().equals("Y")) {
//			CustomerVO[] customerdata = jsonToPojo.getCustomerdata();
//			for (CustomerVO customerVO : customerdata) {
//				Customer findCustomerIsRepetitionByErpId = mapper
//						.findCustomerIsRepetitionByErpId(customerVO.getPk_customerid());
//				if (findCustomerIsRepetitionByErpId == null) {
//					mapper.addCustomer(customerVO);
//				} else {
//					mapper.updateCustomer(customerVO);
//				}
//
//			}
//		}
//		// 拉取租赁客户
//		RequesterVO requesterVO1 = new RequesterVO();
//		requesterVO1.setKey("liando");
//		requesterVO1.setPk_corp("1031");
//		requesterVO1.setBilltype(LiandoServiceConstant.DATA_TYPE_RENT_CUSTOMER);
//		String baseDataTest1 = WebService.getBaseData(requesterVO1);
//		ResponseVO jsonToPojo1 = JsonUtils.jsonToPojo(baseDataTest1, ResponseVO.class);
//		if (jsonToPojo1.getIssuccess().equals("Y")) {
//			CustomerVO[] customerdata = jsonToPojo1.getCustomerdata();
//			for (CustomerVO customerVO : customerdata) {
//				Customer findCustomerIsRepetitionByErpId = mapper
//						.findCustomerIsRepetitionByErpId(customerVO.getPk_customerid());
//				if (findCustomerIsRepetitionByErpId == null) {
//					mapper.addCustomer(customerVO);
//				} else {
//					mapper.updateCustomer(customerVO);
//				}
//
//			}
//		}
		return "更新完成";
	}

	@Override
	public User getLoger(String username, String password) {
		User user = userMapper.findByUsername(username);
		return user;
	}

	@Override
	public List<String> getHouseInfos(Long userId) {
		List<String> ids = userMapper.getManageId(userId);
		List<String> houseIds = new ArrayList<>();
		for (String id : ids) {
			houseIds.addAll(houseInfoDetailsMapper.getByManageId(id));
		}

		return houseIds;
	}

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public List<ManageVO> getMyProjects(Long id) {
        return manageMapper.getMyManage(id);
    }

	@Override
	public List<ManageVO> getAllProjects() {
		return manageMapper.getAll();
	}

    @Override
    public User getDetails(Long id) {
        return userMapper.getDetailsById(id);
    }

	@Override
	public List<Role> getMyRole(Long id) {
		return userMapper.getMyRole(id);
	}


}
