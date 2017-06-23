package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.service.IHouseInfoDetailsService;
import cn.rzhd.wuye.vo.HouseVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * @author ghr-2017/6/16
 */
@Controller
@RequestMapping("/dist/houseInfoDetailsBack")
public class HouseInfoDetailsBackController {
    @Autowired
    IHouseInfoDetailsService houseInfoDetailsService;

    @RequestMapping("/getHouseInfoDetailsList")
    public String houseInfoDetailsList(Model model, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<HouseVO> HouseVOs = houseInfoDetailsService.getBackAll();

        Page page = (Page) HouseVOs;
        model.addAttribute("houseInfoDetailsList", HouseVOs);

        model.addAttribute("pages", page.getPages());
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
                HouseVO houseVO = houseInfoDetailsService.selectById(pkHouse);
                map = new Hashtable<>();
                map.put("pkHouse", houseVO.getPk_house());
                map.put("vhName", houseVO.getVhname());
                map.put("enterApplyStats", houseVO.getVdef8() == null ? "0" : houseVO.getVdef8());
                map.put("decorationApplyState", houseVO.getVdef9() == null ? "0" : houseVO.getVdef9());
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
