package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.PropertyFee;
import cn.rzhd.wuye.mapper.PropertyFeeMapper;
import cn.rzhd.wuye.service.IPropertyFeeService;
import cn.rzhd.wuye.utils.FirstAndLastDay;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.FeeDataQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/6.
 */
@Service
public class PropertyFeeServiceImpl implements IPropertyFeeService {

    @Autowired
    PropertyFeeMapper mapper;

    @Override
    public void addPropertyFee(FeeVO propertyFee) {
        mapper.insert(propertyFee);
    }

    @Override
    public void addRzFee(FeeVO propertyFee) {
        mapper.insertRzFee(propertyFee);
    }

    @Override
    public List<PropertyFee> queryAll(FeeDataQuery query) {
        return mapper.selectAll(query);
    }

    @Override
    public List<PropertyFee> queryAllArrears(ArrearsQuery query) {
        return mapper.selectAllArrears(query);
    }

    @Override
    public Map<String, Object> queryForPay(ArrearsQuery query) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Map<String, Object> map = new HashMap<>();
        //设置条件查询当月欠费
        query.setStartDate(sdf.format(FirstAndLastDay.getFirstDay()));
        query.setEndDate(sdf.format(FirstAndLastDay.getNow()));
        List<Map<String, Object>> current = mapper.selectForPay(query);
        //设置条件查询以往欠费
        query.setStartDate(null);
        query.setEndDate(sdf.format(FirstAndLastDay.getFirstDay()));
        List<Map<String, Object>> past = mapper.selectForPay(query);
        //计算总和
        BigDecimal currentSum = new BigDecimal(0);
        BigDecimal pastSum = new BigDecimal(0);
        for (Map<String, Object> currentMap : current) {
            currentSum = currentSum.add((BigDecimal) currentMap.get("shouldSum"));
        }
        for (Map<String, Object> pastMap : past) {
            pastSum = pastSum.add((BigDecimal) pastMap.get("sum"));
        }
        //放入Map
        map.put("current", current);
        map.put("currentSum", currentSum);
        map.put("past", past);
        map.put("pastSum", pastSum);
        return map;
    }

    /**
     * 入驻物业费用
     *
     * @param query
     * @return
     */
    @Override
    public List<PropertyFee> rzselectAll(FeeDataQuery query) {
        return mapper.rzselectAll(query);
    }

}
