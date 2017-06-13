package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.service.ITypeRefinementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.wuye.controller
@ClassName: TypeRefinementController
@Description: 描述：类型细化
@author: an-wei.xie@rzhd.cn
@date: 2017年5月26日 下午3:52:51
@version: V1.0
 */
@RestController
@RequestMapping("/typeRefinement")
public class TypeRefinementController {
    
    @Autowired
    private ITypeRefinementService typeRefinementService;
    
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
