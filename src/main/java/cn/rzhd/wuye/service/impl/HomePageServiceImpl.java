package cn.rzhd.wuye.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.mapper.HomePageMapper;
import cn.rzhd.wuye.service.IHomePageService;
/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.wuye.service.impl
@ClassName: HomePageServiceImpl
@Description: 描述：
@author: an-wei.xie@rzhd.cn
@date: 2017年6月5日 下午2:55:14
@version: V1.0
 */
@Service
public class HomePageServiceImpl implements IHomePageService {

    @Autowired
    private HomePageMapper mapper;
    
    public List<Map<String, Object>> findHouseByCutomer(Customer customer) {
	List<Map<String, Object>> findHomePageHouseByCustomer = mapper.findHomePageHouseByCustomer(customer);
	
	return findHomePageHouseByCustomer;
    }

    @Override
    public <T> T findFeeListByHouseId(String houseId) {
	
	return null;
    }

 
}
