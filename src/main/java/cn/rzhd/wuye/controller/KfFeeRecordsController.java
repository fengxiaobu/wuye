package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.service.IKfFeePayDetailsService;
import cn.rzhd.wuye.utils.JsonResult;
import cn.rzhd.wuye.utils.UserContext;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hasee on 2017/6/25.
 */
@Controller
@RequestMapping("/kfRecords")
public class KfFeeRecordsController {
    @Autowired
    IKfFeePayDetailsService service;

    @RequestMapping("/index")
    public String index(){
        return "payment/kaifa";
    }

    @RequestMapping("/payFeeRecords")
    public ModelAndView payFeeRecords(){
        Long userId = UserContext.getUser().getUserId();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("payment/kaifajiaofei");
        return mav;
    }

    @RequestMapping("/getIndexData")
    @ResponseBody
    public JsonResult getIndexData(PropertyRecordsQuery query){
        query.setUserId(UserContext.getUser().getUserId());
        JsonResult result = new JsonResult();
        result.getData().add(service.getByProject(query));
        query.setTotal(service.countByQuery(query));
        result.getData().add(query);
        return result;
    }
}
