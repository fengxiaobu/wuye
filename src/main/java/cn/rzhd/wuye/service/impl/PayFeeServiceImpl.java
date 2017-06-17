package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.PropertyFee;
import cn.rzhd.wuye.service.IElectricPayDetailsService;
import cn.rzhd.wuye.service.IHouseInfoDetailsService;
import cn.rzhd.wuye.service.IPayFeeService;
import cn.rzhd.wuye.service.IPropertyFeeService;
import cn.rzhd.wuye.vo.HouseVO;
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
    IHouseInfoDetailsService houseInfoDetailsService;
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
        //获取当前日期并提前两个月
        Date sixtyDay = new Date();
        sixtyDay.setTime(sixtyDay.getTime() - 5184000000L);
        //获取当前日期并提前一个月
        Date thirtyDate = new Date();
        thirtyDate.setTime(thirtyDate.getTime() - 2592000000L);
        arrearsQuery.setStartDate(null);
        arrearsQuery.setEndDate(null);
        try {
            for (String houseInfoId : houseInfoIds) {
                query.setHouseInfoId(houseInfoId);
                arrearsQuery.setHouseInfoId(houseInfoId);
                arrearsQuery.setCustomerId(query.getCustomerId());
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
    public Map<String, Object> payElectricFee(PayFeeQuery query) {
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> amountLeft = amountLeft(query);
        //先计算缴费的金额
        BigDecimal money;
        if ("yuan".equals(query.getElectricCountBy())) {
            money = new BigDecimal(query.getElectricAmount());
        } else if ("du".equals(query.getElectricCountBy())) {
            money = query.getElectricPrice()
                    .multiply(new BigDecimal(query.getMultiply()))
                    .multiply(new BigDecimal(query.getElectricAmount()));
        } else {
            map.put("msg", "请选择正确的计费方式");
            return map;
        }
        //判断是否要进行限制缴费判断
        if (!amountLeft.containsKey("msg") && "Y".equals(amountLeft.get("isAstrict"))) {
            Map<String, List> arrears = isArrears(query);
            Date startDate = (Date) amountLeft.get("startDate");
            Date endDate = (Date) amountLeft.get("endDate");
            BigDecimal firstMoney = (BigDecimal) amountLeft.get("first");
            BigDecimal everyMoney = (BigDecimal) amountLeft.get("every");
            //获取已缴金额,为限制缴费时间段中已交费用的总和
            BigDecimal paid = electricPayDetailsService.getAstrictPaid(query.getHouseInfoId(), (Date) amountLeft.get("starDate"), (Date) amountLeft.get("endDate"));

            //核心逻辑
            //获取当前系统时间
            Date now = new Date();
            //获取欠费满一个月不满两个月的缴费记录
            List before30 = arrears.get("before30");
            //判断当前时间是否在限制期内
            //如果在时间期限内,并且有欠费满一个月不满两个月的缴费记录
            if ((!now.after(endDate) && !now.before(startDate)) && !before30.isEmpty()) {
                //如果有首次限缴金额,则使用首次限缴金额计算
                //限缴金额为后台系统设置值-已付金额
                if (firstMoney != null) {
                    firstMoney = firstMoney.subtract((paid == null) ? new BigDecimal(0) : paid);
                    //如果缴费金额小于等于限制金额
                    if (money.compareTo(firstMoney) == -1 || money.compareTo(firstMoney) == 0) {
                        //通过,并返回电费金额
                        map.put("status", true);
                        map.put("electricFee", money);
                        return map;
                        //否则不通过,并返回本月限购金额
                    } else if (money.compareTo(firstMoney) == 1) {
                        map.put("status", false);
                        map.put("msg", "已超出限额,本月电费限额" + firstMoney + "元");
                        return map;
                    }
                } else {
                    //如果没有设置首次限额,则认为没有设置限制,直接通过
                    map.put("electricFee", money);
                    map.put("status", "true");
                }
                //如果超过两个月,以下逻辑和上面相似
            } else if (now.after(endDate)) {
                if (everyMoney != null) {
                    everyMoney = everyMoney.subtract((paid == null) ? new BigDecimal(0) : paid);
                    if (money.compareTo(everyMoney) == -1 || money.compareTo(everyMoney) == 0) {
                        map.put("status", true);
                        map.put("electricFee", money);
                        return map;
                    } else if (money.compareTo(everyMoney) == 1) {
                        map.put("status", false);
                        map.put("msg", "已超出限额,本月电费限额" + everyMoney + "元");
                        return map;
                    }
                } else {
                    map.put("electricFee", money);
                    map.put("stauts", true);
                }
            }
        }
        amountLeft.put("status", true);
        amountLeft.put("electricFee", money);
        return amountLeft;
    }

    @Override
    public Map<String, Object> amountLeft(PayFeeQuery query) {
        Map<String, Object> map = new HashMap<>();
        HouseVO houseInfo = houseInfoDetailsService.selectById(query.getHouseInfoId());
        if (houseInfo != null) {
            //如果该房产有单独限制,则采用该房产的限制条件
            if ("Y".equals(houseInfo.getAstrictStatus())) {
                map.put("first", houseInfo.getFirstMoney());
                map.put("every", houseInfo.getEveryMoney());
                map.put("startDate", houseInfo.getStartDate());
                map.put("endDate", houseInfo.getEndDate());
                map.put("isAstrict", houseInfo.getAstrictStatus());
                return map;
                //否则采用项目限制
            } else {
                BigDecimal firstMoney = houseInfo.getProjectInfo().getFirstMoney();
                BigDecimal everyMoney = houseInfo.getProjectInfo().getEveryMoney();
                map.put("first", firstMoney);
                map.put("every", everyMoney);
                map.put("startDate", houseInfo.getProjectInfo().getStartDate());
                map.put("endDate", houseInfo.getProjectInfo().getEndDate());
                map.put("isAstrict", houseInfo.getProjectInfo().getAstrictStatus());
                return map;
            }
        }
        map.put("msg", "查无此房产!");
        return map;
    }

    @Override
    public BigDecimal payWaterFee(PayFeeQuery query) {
        BigDecimal result = new BigDecimal("-99999");
        if ("yuan".equals(query.getWaterCountBy())) {
            result = new BigDecimal(query.getWaterAmout());
        } else if ("ton".equals(query.getWaterCountBy())) {
            result = new BigDecimal(query.getWaterAmout()).multiply(query.getWaterPrice());
        }
        return result;
    }
}
