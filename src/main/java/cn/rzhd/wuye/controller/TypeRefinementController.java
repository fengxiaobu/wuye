package cn.rzhd.wuye.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.rzhd.wuye.bean.TypeRefinement;
import cn.rzhd.wuye.service.ITypeDifferentiateService;
import cn.rzhd.wuye.service.ITypeRefinementService;
import cn.rzhd.wuye.utils.JsonResult;

/**
 * 数据字典
 *
 */
@Controller
@RequestMapping("/typeRefinement")
public class TypeRefinementController {

	@Autowired
	ITypeRefinementService typeRefinementService;
	@Autowired
	ITypeDifferentiateService typeDifferentiateService;
	
	/**
	 * 列表
	 *
	 */
	@RequestMapping("/getTypeData")
	public String getTypeData(Model model, Integer pageNum, Integer pageSize, Long typeDifferentiateId) {
		PageHelper.startPage(pageNum, pageSize);
		List<TypeRefinement> typeRefinements = typeRefinementService.getDataList(typeDifferentiateId);

		String name = typeDifferentiateService.getDataName(typeDifferentiateId).getTypeDifferentiateName();
		Page page = (Page) typeRefinements;

		model.addAttribute("typeRefinements", typeRefinements);
		model.addAttribute("name", name);
		model.addAttribute("typeDifferentiateId", typeDifferentiateId);
		

		model.addAttribute("pages", page.getPages());
		return "type/data";
	}

	/**
	 * 回显数据
	 *
	 */
	@RequestMapping("/getTypeDataEdit")
	public String getTypeDataEdit(Model model, Long typeRefinementId,Long typeDifferentiateId) {
		if (typeRefinementId!=null) {
			TypeRefinement typeRefinement = typeRefinementService.getOneData(typeRefinementId);
			model.addAttribute("typeRefinement", typeRefinement);
			
			return "type/dataEdit";
		}else {
			
			model.addAttribute("typeDifferentiateId", typeDifferentiateId);
			return "type/dataAdd";
		}
	}

	/**
	 * 增加修改
	 *
	 */
	@RequestMapping("/addOrUpdate")
	public String saveOrUpdateTypeDataEdit(Model model, TypeRefinement typeRefinement) {
		System.out.println(111);
		if (typeRefinement.getTypeRefinementId() == null) {
			typeRefinement.setUpdateTime(new Date());
			typeRefinementService.save(typeRefinement);
		} else {
			typeRefinement.setUpdateTime(new Date());
			typeRefinementService.update(typeRefinement);
		}
		
		String result = "forward:/typeRefinement/getTypeData?&typeDifferentiateId="+typeRefinement.getTypeDifferentiateId()+"&pageNum=1&pageSize=10";
		System.out.println(result);
		return result;
	}

	
	/**
	 * 删除
	 *
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public JsonResult delete(Long id) {
		try {
			typeRefinementService.delete(id);
			return new JsonResult();
		} catch (Exception e) {
			e.printStackTrace();
			return new JsonResult(e.getMessage());
		}
	}

}
