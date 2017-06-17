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
    public List<Map<String, Object>> findFeeListByCustomerId(Customer customer) {
        List<PactVO> houseInfos = customer.getHouseInfos();
        List<Map<String, Object>> result = new ArrayList<>();

        Map<String, Object> map;
        for (PactVO houseInfo : houseInfos) {
            map = new HashMap<>();
            String customerId = houseInfo.getPk_customerid();
            String houseInfoId = houseInfo.getPk_house();

            List<Map<String, Object>> kf = mapper.findKfFeeListByCustomerId(customerId, houseInfoId);
            List<Map<String, Object>> property = mapper.findPropertyFeeListByCustomerId(customerId, houseInfoId);

            Double kfFeeSum = 0.0;
            for (Map<String, Object> kfmap : kf) {
                kfFeeSum = Double.parseDouble(kfmap.get("nyshouldmny").toString()) + kfFeeSum;
            }

            Double propertyFeeSum = 0.0;
            for (Map<String, Object> propertymap : property) {
                propertyFeeSum = Double.parseDouble(propertymap.get("nyshouldmny").toString()) + propertyFeeSum;
            }
            map.put("house", houseInfo);
            map.put("kfFee", kf);
            map.put("propertyFee", property);
            map.put("kfFeeSum", kfFeeSum);
            map.put("propertyFeeSum", propertyFeeSum);
            result.add(map);
        }

        return result;
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
