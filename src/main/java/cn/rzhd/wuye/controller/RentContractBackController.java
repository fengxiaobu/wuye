package cn.rzhd.wuye.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.rzhd.wuye.service.IRentContractService;
import cn.rzhd.wuye.vo.PactVO;

@Controller
@RequestMapping("/rentContractBack")
public class RentContractBackController {
	@Autowired
	IRentContractService rentContractService;

	@RequestMapping("/getRentContractList")
	public String rentContractList(Model model, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<PactVO> pactVOs = rentContractService.getBackAll();
		System.out.println(pactVOs.size());

		Page page = (Page) pactVOs;
		model.addAttribute("rentContractList", pactVOs);

		model.addAttribute("pages", page.getPages());
		return "contract/rent";
	}
}
