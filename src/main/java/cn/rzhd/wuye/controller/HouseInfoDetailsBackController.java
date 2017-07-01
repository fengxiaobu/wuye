package cn.rzhd.wuye.controller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.rzhd.wuye.bean.HouseInfoDetails;
import cn.rzhd.wuye.service.IHouseInfoDetailsService;
import cn.rzhd.wuye.vo.HouseVO;

/**
 * @author ghr-2017/6/16
 */
@Controller
@RequestMapping("/houseInfoDetailsBack")
public class HouseInfoDetailsBackController {
    @Autowired
    IHouseInfoDetailsService houseInfoDetailsService;

    @RequestMapping("/getHouseInfoDetailsList")
    public String houseInfoDetailsList(Model model, Integer pageNum, Integer pageSize) {
    	PageHelper.startPage(pageNum, pageSize);
        List<HouseVO> houseVOs = houseInfoDetailsService.getBackAll();
       
        Page page = (Page) houseVOs;
        
        model.addAttribute("houseInfoDetailsList", houseVOs);

        return "contract/houseInfoDetails";
    }
    
    @RequestMapping("/getHouseInfoDetails")
    @ResponseBody
    public Map<String, Object> getHouseInfoDetails(String pkHouses) {
        Map<String, Object> result = new Hashtable<>();
        List<Object> list = new ArrayList<>();
        Map<String, Object> map = null;
        String[] split = pkHouses.split("_");
        if (split != null && split.length > 0) {
            for (String pkHouse : split) {
                HouseInfoDetails house = houseInfoDetailsService.selectByPkHouse(pkHouse);
                map = new Hashtable<>();
                map.put("pkHouse", house.getPkHouse());
                map.put("vhName", house.getVhname());
                map.put("enterApplyStats", house.getEnterapplyState() == null ? "0" : house.getEnterapplyState());
                map.put("decorationApplyState", house.getDecorationapplystate() == null ? "0" : house.getDecorationapplystate());
                list.add(map);
            }
            result.put("state", 1);
            result.put("data", list);
            return result;
        }
        result.put("state", 0);
        result.put("msg", "ID不能为空!");
        return result;
    }
}
