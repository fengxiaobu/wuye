package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.service.IUtilitiesService;
import cn.rzhd.wuye.utils.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/25.
 */
@Controller
@RequestMapping("/utilitiesRecords")
public class UtilitiesRecordsController {
    @Autowired
    IUtilitiesService service;

    @RequestMapping("/electricIndex")
    public ModelAndView electricIndex(){
        Long userId = UserContext.getUser().getUserId();
        ModelAndView mav = new ModelAndView();
        List<Map<String,Object>> result = service.getElectricByProject(userId);
        mav.addObject("electricRecords",result);
        mav.setViewName("payment/electric");
        return mav;
    }

    @RequestMapping("/waterIndex")
    public ModelAndView waterIndex(){
        Long userId = UserContext.getUser().getUserId();
        ModelAndView mav = new ModelAndView();
        List<Map<String,Object>> result = service.getWaterByProject(userId);
        mav.addObject("waterRecords",result);
        mav.setViewName("payment/water");
        return mav;
    }
}
