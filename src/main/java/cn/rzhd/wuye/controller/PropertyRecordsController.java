package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.service.IPropertyFeePayDetailsService;
import cn.rzhd.wuye.utils.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hasee on 2017/6/22.
 */
@Controller
@RequestMapping("/propertyRecords")
public class PropertyRecordsController {
    @Autowired
    IPropertyFeePayDetailsService propertyFeePayDetailsService;

    @RequestMapping("/index")
    public String index(){
        String projectBelong = UserContext.getUser().getProjectBelong();
        if(projectBelong==null){
            return null;
        }
        String[] split = projectBelong.split(",");
        for (String s : split) {
            //propertyFeePayDetailsService.queryAll();
        }
        return "payment/wuye";
    }
}
