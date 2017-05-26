package cn.rzhd.wuye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.rzhd.wuye.bean.TypeDifferentiate;
import cn.rzhd.wuye.service.IDataDictionaryService;
import cn.rzhd.wuye.utils.JsonUtils;

/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.wuye.controller
@ClassName: DataDictionaryController
@Description: 描述：数据字典类型
@author: an-wei.xie@rzhd.cn
@date: 2017年5月26日 上午10:06:19
@version: V1.0
 */
@RestController
@RequestMapping("/type")
public class DataDictionaryTypeController {

    @Autowired
    private IDataDictionaryService dataDictionary;
    /**
     * 添加类型
     * @param typeDifferentiate 类型对象
     * @return	json
     */
    @RequestMapping(value="/addTypeDifferentiate",method=RequestMethod.POST)
    public String addTypeDifferentiate(TypeDifferentiate typeDifferentiate){
	if (typeDifferentiate == null ) {
	    return JsonUtils.objectToJson("添加信息无效");
	}
	try {
	    dataDictionary.addType(typeDifferentiate);
	    return JsonUtils.objectToJson("添加类型成功");
	} catch (Exception e) {
	    e.printStackTrace();
	    return JsonUtils.objectToJson("异常");
	}
	
    }
    
}
