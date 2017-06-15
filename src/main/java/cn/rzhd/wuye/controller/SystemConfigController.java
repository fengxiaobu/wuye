package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.Ammeter;
import cn.rzhd.wuye.service.IAmmeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by hasee on 2017/6/14.
 */
@Controller
@RequestMapping("/system")
public class SystemConfigController {

    @Autowired
    IAmmeterService ammeterService;


    @RequestMapping("/ammeterList")
    @ResponseBody
    public List<Ammeter> ammeterList(){
        return ammeterService.getAllAmmeters();
    }

    @RequestMapping("/ammeterIndex")
    public String ammeterIndex(){
        return "system/ammeter/ammeterList";
    }
}
