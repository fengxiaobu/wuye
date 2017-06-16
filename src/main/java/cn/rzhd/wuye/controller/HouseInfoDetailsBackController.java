package cn.rzhd.wuye.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.rzhd.wuye.service.IHouseInfoDetailsService;
import cn.rzhd.wuye.vo.HouseVO;
import cn.rzhd.wuye.vo.SignVO;

/**
 * @author ghr-2017/6/16
 *
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
}
