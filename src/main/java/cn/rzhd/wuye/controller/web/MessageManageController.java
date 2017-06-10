package cn.rzhd.wuye.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.rzhd.wuye.bean.MessageManage;
import cn.rzhd.wuye.service.IMessageManageService;
import cn.rzhd.wuye.utils.JsonUtils;

/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.wuye.controller.web
@ClassName: MessageManageController
@Description: 描述：通知管理
@author: an-wei.xie@rzhd.cn
@date: 2017年6月9日 上午11:38:48
@version: V1.0
 */
@RestController
@RequestMapping("/messageManage")
public class MessageManageController {
    
    @Autowired
    private IMessageManageService messageManageService;

    /**
     * 入驻通知
     * @return
     */
    @RequestMapping(value="/findEnterMessage",method=RequestMethod.POST)
    public String findEnterMessage(){
	MessageManage findEnterMessage = messageManageService.findEnterMessage();
	return JsonUtils.objectToJson(findEnterMessage);
    }
}
