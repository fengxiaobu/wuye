package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.HouseInfo;
import cn.rzhd.wuye.service.IHouseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hasee on 2017/5/25.
 */
@Controller
public class HouseInfoController {

    @Autowired
    IHouseInfoService houseInfoService;

    @RequestMapping("/houseInfoList")
    @ResponseBody
    public HouseInfo houseInfoList(Long id) {
        return houseInfoService.getById(id);
    }



}
