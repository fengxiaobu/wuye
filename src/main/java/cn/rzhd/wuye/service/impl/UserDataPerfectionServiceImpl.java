package cn.rzhd.wuye.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.PerfectInformation;
import cn.rzhd.wuye.mapper.HomePageMapper;
import cn.rzhd.wuye.mapper.UserDataPerfectionMapper;
import cn.rzhd.wuye.service.IUserDataPerfectionService;
@Service
public class UserDataPerfectionServiceImpl implements IUserDataPerfectionService {

    @Autowired
    private HomePageMapper homeMapper;
    
    @Autowired
    private UserDataPerfectionMapper mapper;
    
    @Override
    public List<Map<String, Object>> findHouseListByCustomer(Customer customer) {
	List<Map<String, Object>> findHomePageHouseByCustomer = homeMapper.findHomePageHouseByCustomer(customer);
	return findHomePageHouseByCustomer;
    }

    @Override
    public void addUserDataPerfection(PerfectInformation perfectInformation) {
	mapper.addUserDataPerfection(perfectInformation);
	
    }

}
