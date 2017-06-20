package cn.rzhd.wuye.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.PerfectInformation;
import cn.rzhd.wuye.mapper.CustomerCentreMapper;
import cn.rzhd.wuye.service.ICustomerCentreService;

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
	public void updateLogo(Customer customer) {
		mapper.updateLogo(customer);
	}

	@Override
	public void updatePhone(Customer customer) {
		mapper.updatePhone(customer);

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
}
