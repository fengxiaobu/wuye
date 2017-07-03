package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.service.IKfFeePayDetailsService;
import cn.rzhd.wuye.utils.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/25.
 */
@Controller
@RequestMapping("/kfRecords")
public class KfFeeRecordsController {
    @Autowired
    IKfFeePayDetailsService service;

    @RequestMapping("/index")
    public ModelAndView index(){
        Long userId = UserContext.getUser().getUserId();
        List<Map<String, Object>> result = new ArrayList<>();
        result.addAll(service.getByProject(userId));
        ModelAndView mav = new ModelAndView();
        mav.addObject("kfRecords",result);
        mav.setViewName("payment/kaifa");
        return mav;
    }

    @RequestMapping("payFeeRecords")
    public ModelAndView payFeeRecords(){
        Long userId = UserContext.getUser().getUserId();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("payment/kaifajiaofei");
        return mav;
    }
}
