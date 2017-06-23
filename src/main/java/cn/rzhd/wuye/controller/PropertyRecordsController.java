package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.PropertyFeePayDetails;
import cn.rzhd.wuye.service.IPropertyFeePayDetailsService;
import cn.rzhd.wuye.service.IUserService;
import cn.rzhd.wuye.utils.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasee on 2017/6/22.
 */
@Controller
@RequestMapping("/propertyRecords")
public class PropertyRecordsController {
    @Autowired
    IPropertyFeePayDetailsService propertyFeePayDetailsService;
    @Autowired
    IUserService userService;

    @RequestMapping("/index")
    public ModelAndView index(){
        Long userId = UserContext.getUser().getUserId();
        List<String> houseInfos = userService.getHouseInfos(userId);
        List<PropertyFeePayDetails> list = new ArrayList<>();
        for (String houseInfo : houseInfos) {
            list.add(propertyFeePayDetailsService.getByProject(houseInfo));
        }
        ModelAndView mav = new ModelAndView();
        mav.addObject("propertyRecords",list);
        mav.setViewName("payment/wuye");
        return mav;
    }
}