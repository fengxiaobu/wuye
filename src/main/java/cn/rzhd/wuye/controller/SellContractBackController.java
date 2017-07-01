package cn.rzhd.wuye.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.rzhd.wuye.service.ISellContractService;
import cn.rzhd.wuye.vo.PactVO;
import cn.rzhd.wuye.vo.SignVO;

@Controller
@RequestMapping("/sellContractBack")
public class SellContractBackController {
	@Autowired
	ISellContractService sellContractService;
	
    @RequestMapping("/getSellContractList")
    public String sellContractList(Model model, Integer pageNum, Integer pageSize) {
    	System.out.println(2222);
    	PageHelper.startPage(pageNum, pageSize);
		List<SignVO> signVOs = sellContractService.getBackAll();
		System.out.println(signVOs.size());
		Page page = (Page) signVOs;
		System.out.println(signVOs.size());

		model.addAttribute("sellContractList", signVOs);

        return "contract/sell";
    }
    
}
