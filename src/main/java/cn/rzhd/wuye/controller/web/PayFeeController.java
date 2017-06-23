package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.*;
import cn.rzhd.wuye.service.*;
import cn.rzhd.wuye.vo.HouseVO;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.PayFeeQuery;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
    private IPayFeeService payFeeService;
    @Autowired
    private IHouseInfoDetailsService houseInfoDetailsService;
    @Autowired
    private IAmmeterService ammeterService;
    @Autowired
    private IUtilitiesService utilitiesService;

    /**
     * 用于展示物业欠费记录
     * @param query
     * @return
     */
    @RequestMapping("/propertyFee")
    public Map<String,Object> propertyFee(@RequestBody ArrearsQuery query){
        Map<String, Object> map = propertyService.queryForPay(query);
        return map;
    }

    /**
     * 开发欠费记录
     * @param query
     * @return
     */
    @RequestMapping("/kfFee")
    public Map<String,Object> kfFee(@RequestBody ArrearsQuery query){
        Map<String, Object> map = kfService.queryForPay(query);
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
     * @param houseInfo
     * @return
     */
    @RequestMapping("/getAmmeters")
    public Map<String,Object> getAmmeters(@RequestBody HouseInfo houseInfo){
        Map<String,Object> map = new HashMap<>();
        List<Ammeter> ammeters = ammeterService.getAmmeters(houseInfo.getHouseInfoId());
        HouseVO house = houseInfoDetailsService.selectById(houseInfo.getHouseInfoId());
        if (house!=null){
            BigDecimal waterPrice = house.getProjectInfo().getWaterPrice();
            BigDecimal electricityPrice = house.getProjectInfo().getElectricityPrice();
            map.put("waterPrice",waterPrice);
            map.put("electricityPrice",electricityPrice);
            map.put("ammeters",ammeters);
        }else{
            map.put("msg","房产不存在!");
        }
        return map;
    }

    /**
     * 查询是否欠费
     * @param query
     * @return
     */
    @RequestMapping("/isArrears")
    public Map<String,Object> isArrears(PayFeeQuery query){
        return payFeeService.isArrears(query);
    }

    /**
     * 查询上次缴费记录
     * @param query
     * @return
     */
    @RequestMapping("/payFeeRecords")
    public Map<String,Object> payFeeRecords(UtilitiesQuery query){
        return utilitiesService.getLastRecords(query);
    }
}
