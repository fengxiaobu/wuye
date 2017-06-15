package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.Ammeter;
import cn.rzhd.wuye.bean.ElectricFeePayDetails;
import cn.rzhd.wuye.bean.WaterRatePayDetails;
import cn.rzhd.wuye.service.*;
import cn.rzhd.wuye.vo.HouseVO;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.PayFeeQuery;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/9.
 */
@RestController
@RequestMapping("/dist/payFee")
public class PayFeeController {
    @Autowired
    private IPropertyFeeService propertyService;
    @Autowired
    private IKfFeeService kfService;
    @Autowired
    private IElectricPayDetailsService electricPayDetailsService;
    @Autowired
    private IPayFeeService payFeeService;
    @Autowired
    private IHouseInfoDetailsService houseInfoDetailsService;
    @Autowired
    private IWaterPayDetailsService waterPayDetailsService;
    @Autowired
    private IAmmeterService ammeterService;

    /**
     * 用于展示物业欠费记录
     * @param query
     * @return
     */
    @RequestMapping("/propertyFee")
    public Map<String,List> propertyFee(ArrearsQuery query){
        Map<String, List> map = propertyService.queryForPay(query);
        return map;
    }

    /**
     * 开发欠费记录
     * @param query
     * @return
     */
    @RequestMapping("/kfFee")
    public Map<String,List> kfFee(ArrearsQuery query){
        Map<String, List> map = kfService.queryForPay(query);
        return map;
    }

    /**
     * 处理缴纳水电费
     * @return
     */
    @RequestMapping("/utilitiesPurchase")
    public Map<String,Object> utilitiesPurchase(PayFeeQuery query){
        Map<String, Object> map = payFeeService.payElectricFee(query);
        BigDecimal waterFee = payFeeService.payWaterFee(query);
        map.put("waterFee",waterFee);
        return map;
    }

    /**
     * AJAX获取不同房产所拥有的电表信息及水电单价
     * @param houseInfoId
     * @return
     */
    @RequestMapping("/getAmmeters")
    public Map<String,Object> getAmmeters(String houseInfoId){
        Map<String,Object> map = new HashMap<>();
        List<Ammeter> ammeters = ammeterService.getAmmeters(houseInfoId);
        HouseVO houseInfo = houseInfoDetailsService.selectById(houseInfoId);
        if (houseInfo!=null){
            BigDecimal waterPrice = houseInfo.getProjectInfo().getWaterPrice();
            BigDecimal electricityPrice = houseInfo.getProjectInfo().getElectricityPrice();
            map.put("waterPrice",waterPrice);
            map.put("electricityPrice",electricityPrice);
            map.put("ammeters",ammeters);
        }
        map.put("msg","房产不存在!");
        return map;
    }

    /**
     * 查询是否欠费
     * @param query
     * @return
     */
    @RequestMapping("/isArrears")
    public Map<String,List> isArrears(PayFeeQuery query){
        return payFeeService.isArrears(query);
    }

    /**
     * 查询上次缴费记录
     * @param query
     * @return
     */
    @RequestMapping("/payFeeRecords")
    public Map<String,Object> payFeeRecords(UtilitiesQuery query){
        ElectricFeePayDetails electricRecord = electricPayDetailsService.getLastRecords(query);
        WaterRatePayDetails waterRecord = waterPayDetailsService.getLastRecords(query);
        Map<String,Object> map = new HashMap<>();
        map.put("electric",electricRecord);
        map.put("water",waterRecord);
        return map;
    }
}
