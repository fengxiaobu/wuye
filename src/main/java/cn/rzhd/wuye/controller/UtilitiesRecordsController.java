package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.service.IUtilitiesService;
import cn.rzhd.wuye.utils.JsonResult;
import cn.rzhd.wuye.utils.UserContext;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by hasee on 2017/6/25.
 */
@Controller
@RequestMapping("/utilitiesRecords")
public class UtilitiesRecordsController {
    @Autowired
    private IUtilitiesService service;

    @RequestMapping("/electricIndex")
    public String electricIndex() {
        return "payment/electric";
    }

    @RequestMapping("/getElectricIndexData")
    @ResponseBody
    public JsonResult getElectricIndexData(PropertyRecordsQuery query) {
        query.setUserId(UserContext.getUser().getUserId());
        JsonResult result = new JsonResult();
        result.getData().add(service.getElectricByProject(query));
        query.setTotal(service.countElectricByQuery(query));
        result.getData().add(query);
        return result;
    }

    @RequestMapping("/waterIndex")
    public String waterIndex() {
        return "payment/water";
    }

    @RequestMapping("/getWaterIndexData")
    @ResponseBody
    public JsonResult getWaterIndexData(PropertyRecordsQuery query) {
        query.setUserId(UserContext.getUser().getUserId());
        JsonResult result = new JsonResult();
        result.getData().add(service.getWaterByProject(query));
        query.setTotal(service.countWaterByQuery(query));
        result.getData().add(query);
        return result;
    }

    @RequestMapping("/electricDetails")
    public ModelAndView electricDetails(Long id) {
        ModelAndView mav = new ModelAndView();
        Map<String, Object> result = service.getElectricByPrimaryKey(id);
        mav.addObject("result", result);
        mav.setViewName("payment/electricDetails");
        return mav;
    }

    @RequestMapping("/waterDetails")
    public ModelAndView waterDetails(Long id) {
        ModelAndView mav = new ModelAndView();
        Map<String, Object> result = service.getWaterByPrimaryKey(id);
        mav.addObject("result", result);
        mav.setViewName("payment/waterDetails");
        return mav;
    }
}
