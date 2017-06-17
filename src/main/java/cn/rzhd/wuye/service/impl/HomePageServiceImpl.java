package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.MessageManage;
import cn.rzhd.wuye.mapper.HomePageMapper;
import cn.rzhd.wuye.service.IHomePageService;
import cn.rzhd.wuye.vo.PactVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * © 2017 RZHD.CN
 *
 * @Package: cn.rzhd.wuye.service.impl
 * @ClassName: HomePageServiceImpl
 * @Description: 描述：
 * @author: an-wei.xie@rzhd.cn
 * @date: 2017年6月5日 下午2:55:14
 * @version: V1.0
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
    public Map<String, Object> findFeeListByCustomerId(Customer customer) {
        List<PactVO> houseInfos = customer.getHouseInfos();
        List<Map<String, Object>> kfFeeList = new ArrayList<>();
        List<Map<String, Object>> propertyFeeList = new ArrayList<>();
        for (PactVO houseInfo : houseInfos) {
            String customerId = houseInfo.getPk_customerid();
            String houseInfoId = houseInfo.getPk_house();
            kfFeeList.addAll(mapper.findKfFeeListByCustomerId(customerId, houseInfoId));
            propertyFeeList.addAll(mapper.findPropertyFeeListByCustomerId(customerId, houseInfoId));

        }

        Double kfFeeSum = 0.0;
        for (Map<String, Object> map : kfFeeList) {
            kfFeeSum = Double.parseDouble(map.get("nyshouldmny").toString()) + kfFeeSum;
        }

        Double propertyFeeSum = 0.0;
        for (Map<String, Object> map : propertyFeeList) {
            propertyFeeSum = Double.parseDouble(map.get("nyshouldmny").toString()) + propertyFeeSum;
        }

        Map<String, Object> feeMap = new HashMap<>();
        feeMap.put("kfFeeList", kfFeeList);
        feeMap.put("kfFeeSum", kfFeeSum);
        feeMap.put("propertyFeeList", propertyFeeList);
        feeMap.put("propertyFeeSum", propertyFeeSum);

        return feeMap;
    }

    @Override
    public Integer findMessageNumByCustomer(String customerId) {
        Integer findMessageNumByCustomer = mapper.findMessageNumByCustomer(customerId);
        return findMessageNumByCustomer;
    }

    @Override
    public List<MessageManage> findMessageByCustomer(String customerId) {
        List<MessageManage> findMessageByCustomer = mapper.findMessageByCustomer(customerId);
        return findMessageByCustomer;
    }


}
