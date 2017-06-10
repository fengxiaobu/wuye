package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.HouseInfo;
import cn.rzhd.wuye.bean.PropertyFee;
import cn.rzhd.wuye.service.IElectricPayDetailsService;
import cn.rzhd.wuye.service.IHouseInfoService;
import cn.rzhd.wuye.service.IPayFeeService;
import cn.rzhd.wuye.service.IPropertyFeeService;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.PayFeeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by hasee on 2017/6/10.
 */
@Service
public class PayFeeServiceImpl implements IPayFeeService {
    @Autowired
    IPropertyFeeService propertyFeeService;
    @Autowired
    IHouseInfoService houseInfoService;
    @Autowired
    IElectricPayDetailsService electricPayDetailsService;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Map<String, List> isArrears(PayFeeQuery query) {
        Map<String, List> map = new HashMap<>();
        String[] houseInfoIds = query.getHouseInfoIds();
        List<PropertyFee> before60 = new ArrayList<>();
        List<PropertyFee> before30 = new ArrayList<>();
        ArrearsQuery arrearsQuery = new ArrearsQuery();

        Date sixtyDay = new Date();
        sixtyDay.setTime(sixtyDay.getTime() - 5184000000L);

        Date thirtyDate = new Date();
        thirtyDate.setTime(thirtyDate.getTime() - 2592000000L);

        try {
            for (String houseInfoId : houseInfoIds) {
                query.setHouseInfoId(houseInfoId);
                arrearsQuery.setHouseInfoId(houseInfoId);
                List<PropertyFee> propertyFees = propertyFeeService.queryAllArrears(arrearsQuery);
                //时间超过60天的记录
                for (PropertyFee fee : propertyFees) {
                    if (sdf.parse(fee.getDshpay()).before(sixtyDay)) {
                        before60.add(fee);
                    }
                }
                //时间超过30天的记录
                for (PropertyFee fee : propertyFees) {
                    if (sdf.parse(fee.getDshpay()).before(thirtyDate)) {
                        before30.add(fee);
                    }
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        map.put("before30", before30);
        map.put("before60", before60);
        return map;
    }

    @Override
    public Map<String, String> payElectricFee(PayFeeQuery query) {
        Map<String, String> map = new HashMap<>();
        Map<String, Object> amountLeft = amountLeft(query);

        Date startDate = (Date) amountLeft.get("startDate");
        Date endDate = (Date) amountLeft.get("endDate");
        BigDecimal firstMoney = (BigDecimal) amountLeft.get("firstMoney");
        BigDecimal everyMoney = (BigDecimal) amountLeft.get("everyMoney");

        BigDecimal money;
        BigDecimal paid = electricPayDetailsService.getAstrictPaid(query.getHouseInfoId(), (Date) amountLeft.get("starDate"), (Date) amountLeft.get("endDate"));
        firstMoney = firstMoney.subtract(paid);
        everyMoney = everyMoney.subtract(paid);


        if ("yuan".equals(query.getElectricCountBy())) {
            money = new BigDecimal(query.getElectricAmount());
        } else if ("du".equals(query.getElectricCountBy())) {
            BigDecimal i = query.getElectricPrice()
                    .multiply(new BigDecimal(query.getMultiply()))
                    .multiply(new BigDecimal(query.getElectricAmount()));
            money = i;
        } else {
            map.put("msg", "请选择正确的计费方式");
            return map;
        }

        Date now = new Date();
        if (now.before(endDate) && now.after(startDate)) {
            if (money.compareTo(firstMoney) == -1 || money.compareTo(firstMoney) == 0) {
                map.put("status", "true");
                return map;
            } else if (money.compareTo(firstMoney) == 1) {
                map.put("status", "false");
                map.put("msg", "已超出限额,本月电费限额" + firstMoney + "元");
                return map;
            }
        } else if (now.after(endDate)) {
            if (money.compareTo(everyMoney) == -1 || money.compareTo(everyMoney) == 0) {
                map.put("status", "true");
                return map;
            } else if (money.compareTo(everyMoney) == 1) {
                map.put("status", "false");
                map.put("msg", "已超出限额,本月电费限额" + everyMoney + "元");
                return map;
            }
        }
        return null;
    }

    @Override
    public Map<String, Object> amountLeft(PayFeeQuery query) {
        Map<String, Object> map = new HashMap<>();
        HouseInfo houseInfo = houseInfoService.selectByQuery(query.getHouseInfoId());
        if ("Y".equals(houseInfo.getAstrictStatus())) {
            map.put("first", houseInfo.getFirstMoney());
            map.put("every", houseInfo.getEveryMoney());
            map.put("startDate", houseInfo.getStartDate());
            map.put("endDate", houseInfo.getEndDate());
            return map;
        } else {
            BigDecimal firstMoney = houseInfo.getProjectInfo().getFirstMoney();
            BigDecimal everyMoney = houseInfo.getProjectInfo().getEveryMoney();
            map.put("first", firstMoney);
            map.put("every", everyMoney);
            map.put("startDate", houseInfo.getProjectInfo().getStartDate());
            map.put("endDate", houseInfo.getProjectInfo().getEndDate());
            return map;
        }
    }

    @Override
    public BigDecimal payWaterFee(PayFeeQuery query) {
        BigDecimal result = new BigDecimal("-99999");
        if("yuan".equals(query.getWaterCountBy())){
            result = new BigDecimal(query.getWaterAmout());
        }else if("ton".equals(query.getWaterCountBy())){
            result = new BigDecimal(query.getWaterAmout()).multiply(query.getWaterPrice());
        }
        return result;
    }
}
