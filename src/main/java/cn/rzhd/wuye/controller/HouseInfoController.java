package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.HouseInfo;
import cn.rzhd.wuye.service.IHouseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhongchaojie on 2017/5/25.
 * 房产信息Controller
 */
@Controller
@RequestMapping("/houseInfo")
public class HouseInfoController {

    @Autowired
    IHouseInfoService houseInfoService;

    /**
     *
     * @return 元素为Map的List,返回结合远程数据及本地数据的所有记录
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<HouseInfo> houseInfoList() {
        List<HouseInfo> list = houseInfoService.getAll();
        return list;
    }

    /**
     *
     * @return 返回跳转路径,用于跳转到HouseInfo页面
     */
    @RequestMapping("/index")
    public String houseInfo(){
        return "houseinfo/houseList";
    }
}
