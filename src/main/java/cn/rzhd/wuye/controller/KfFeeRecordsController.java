package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.service.IKfFeePayDetailsService;
import cn.rzhd.wuye.service.IPayFeeRecordsService;
import cn.rzhd.wuye.utils.JsonResult;
import cn.rzhd.wuye.utils.UserContext;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hasee on 2017/6/25.
 */
@Controller
@RequestMapping("/kfRecords")
public class KfFeeRecordsController {
    @Autowired
    private IKfFeePayDetailsService service;
    @Autowired
    private IPayFeeRecordsService payFeeRecordsService;

    @RequestMapping("/index")
    public String index(){
        return "payment/kaifa";
    }

    @RequestMapping("/payFeeRecords")
    public String payFeeRecords(){
        return "payment/kaifajiaofei";
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


    @RequestMapping("/getPayFeeRecords")
    @ResponseBody
    public JsonResult getPayFeeRecords(PropertyRecordsQuery query){
        query.setUserId(UserContext.getUser().getUserId());
        JsonResult result = new JsonResult();
        query.setFeeType("开发");
        result.getData().add(payFeeRecordsService.getByProject(query));
        query.setTotal(payFeeRecordsService.countByQuery(query));
        result.getData().add(query);
        return result;
    }
}
