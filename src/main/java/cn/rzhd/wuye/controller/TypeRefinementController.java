package cn.rzhd.wuye.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.rzhd.wuye.bean.TypeRefinement;
import cn.rzhd.wuye.service.ITypeDifferentiateService;
import cn.rzhd.wuye.service.ITypeRefinementService;

@Controller
@RequestMapping("/typeRefinement")
public class TypeRefinementController {
    
    @Autowired
    ITypeRefinementService typeRefinementService;
    @Autowired
    ITypeDifferentiateService typeDifferentiateService;
    
    @RequestMapping("/getTypeData")
    public String getTypeData(Model model, Integer pageNum, Integer pageSize, Integer typeDifferentiateId) {
    	PageHelper.startPage(pageNum, pageSize);
    	List<TypeRefinement> typeRefinements = typeRefinementService.getDataList(typeDifferentiateId);
    	for (TypeRefinement typeRefinement : typeRefinements) {
			System.out.println(typeRefinement);
		}
    	
    	String name = typeDifferentiateService.getDataName(typeDifferentiateId).getTypeDifferentiateName();
    	Page page = (Page) typeRefinements;
    	
        model.addAttribute("typeRefinements", typeRefinements);
        model.addAttribute("name",name);

        model.addAttribute("pages", page.getPages());
        return "type/data";
    }
    
    @RequestMapping("/getTypeDataEdit")
    public String getTypeDataEdit(Model model, Integer typeRefinementId) {
    	
    	TypeRefinement typeRefinement = typeRefinementService.getOneData(typeRefinementId);
    	model.addAttribute("typeRefinement", typeRefinement);
    	
        return "type/dataEdit";
    }
    
    /**
     * 
     * @param typeRefinement
     * @return
     */
   /* @RequestMapping(value="/addTypeRefinement",method=RequestMethod.POST)
    public String addTypeRefinement(TypeRefinementVo typeRefinementVo){
	if (typeRefinementVo == null) {
	    return JsonUtils.objectToJson("数据无效");
	}
	try {
	    typeRefinementService.addTypeRefinement(typeRefinementVo);
	    return JsonUtils.objectToJson("成功");
	} catch (Exception e) {
	    e.printStackTrace();
	    return JsonUtils.objectToJson("异常");
	}
	
    }*/
}
