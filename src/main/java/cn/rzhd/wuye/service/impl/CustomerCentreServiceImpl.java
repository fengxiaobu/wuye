package cn.rzhd.wuye.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.PerfectInformation;
import cn.rzhd.wuye.mapper.CustomerCentreMapper;
import cn.rzhd.wuye.service.ICustomerCentreService;
import cn.rzhd.wuye.utils.MD5Utils;

@Service
public class CustomerCentreServiceImpl implements ICustomerCentreService {

	@Autowired
	private CustomerCentreMapper mapper;

	public Map<String, Object> findCustomerInfo(Customer customer) {
		Map<String, Object> map = new HashMap<>();
		Customer findCustomer = mapper.findCustomer(customer);
		map.put("customer", findCustomer);
		List<Map<String, Object>> houseList = mapper.findHouse(customer);
		map.put("houseList", houseList);

		return map;
	}

	@Override
	public void updateLogo(String LOGO, String vccode) {
		mapper.updateLogo(LOGO, vccode);
	}

	@Override
	public void updatePhone(String bindingPhone, String vccode) {
		mapper.updatePhone(bindingPhone, vccode);

	}

	@Override
	public void updatePerfectInformation(PerfectInformation perfectInformation) {
		mapper.updatePerfectInformation(perfectInformation);

	}

	@Override
	public PerfectInformation getPerfectInformation(String customerId) {
		PerfectInformation perfectInformation = mapper.findInfoById(customerId);
		return perfectInformation;
	}

	@Override
	public void updatePassword(String password, String vccode) {
		password = MD5Utils.md5(password);
		mapper.updatePassword(password,vccode);

	}
}
