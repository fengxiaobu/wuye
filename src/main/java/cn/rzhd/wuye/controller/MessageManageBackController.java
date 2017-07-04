package cn.rzhd.wuye.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.rzhd.wuye.bean.MessageManage;
import cn.rzhd.wuye.service.IMessageManageService;
import cn.rzhd.wuye.utils.JsonResult;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/messageManageBack")
public class MessageManageBackController {
	@Autowired
	IMessageManageService messageManageService;

	@RequestMapping("/getMessageManageList")
	public String messageManageList(Model model, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<MessageManage> messageManages = messageManageService.getAllMessage();

		Page page = (Page) messageManages;
		model.addAttribute("messageManageList", messageManages);

		model.addAttribute("pages", page.getPages());
		return "message/messageManageList";
	}

	/**
	 * 编辑页面
	 */
	@RequestMapping(value = "/messageManageEdit", method = RequestMethod.GET)
	public String edit(Model model, Long message_manage_id) throws Exception {
		if (message_manage_id != null) {

			MessageManage messageManage = messageManageService.getMessageManage(message_manage_id);
			
			model.addAttribute(messageManage);
		}
		
		return "message/messageManageEdit";
	}
	
	
	/**
	 * 保存或者修改
	 */
	@RequestMapping("/messageManageSave")
	public String save(Model model,MessageManage messageManage) throws Exception {
		if (messageManage.getMessage_manage_id() == null) {
			messageManage.setCreate_time(new Date());
			
			messageManageService.save(messageManage);
		}else {
			messageManage.setCreate_time(new Date());
			messageManageService.edit(messageManage);	
		}
		return "forward:/messageManageBack/getMessageManageList?pageNum=1&pageSize=10";
	}
	
    @RequestMapping("/delete")
    @ResponseBody
    public JsonResult delete(Long id){
        try {
        	messageManageService.deleteMsg(id);
            return new JsonResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(e.getMessage());
        }
    }
	
}
