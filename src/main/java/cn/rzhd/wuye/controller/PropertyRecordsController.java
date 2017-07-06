package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.service.IPropertyFeePayDetailsService;
import cn.rzhd.wuye.utils.JsonResult;
import cn.rzhd.wuye.utils.UserContext;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hasee on 2017/6/22.
 */
@Controller
@RequestMapping("/propertyRecords")
public class PropertyRecordsController {
    @Autowired
    private IPropertyFeePayDetailsService propertyFeePayDetailsService;

    @RequestMapping("/index")
    public String index(){
        return "payment/wuye";
    }

    @RequestMapping("/payFeeRecords")
    public ModelAndView payFeeRecords(){
        Long userId = UserContext.getUser().getUserId();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("payment/wuyejiaofei");
        return mav;
    }

    @RequestMapping("/getIndexData")
    @ResponseBody
    public JsonResult getIndexData(PropertyRecordsQuery query){
        JsonResult result = new JsonResult();
        query.setUserId(UserContext.getUser().getUserId());
        result.getData().add(propertyFeePayDetailsService.getByProject(query));
        query.setTotal(propertyFeePayDetailsService.countByQuery(query));
        result.getData().add(query);
        return result;
    }
}
