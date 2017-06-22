package cn.rzhd.wuye.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.rzhd.wuye.bean.MessageManage;
import cn.rzhd.wuye.service.IMessageManageService;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/dist/messageManageBack")
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
	 * 保存或者修改
	 */
	@RequestMapping(value = "/messageManageEdit", method = RequestMethod.GET)
	public String save(Model model, Long message_manage_id) throws Exception {
		if (message_manage_id != null) {

			MessageManage messageManage = messageManageService.getMessageManage(message_manage_id);
			List<String> Types = messageManageService.getAllType();
			
			model.addAttribute(messageManage);
			model.addAttribute("typeList", Types);
		}
		
		return "message/messageManageEdit";
	}
	
	
	
}
