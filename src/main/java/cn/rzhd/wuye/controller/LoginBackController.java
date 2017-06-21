package cn.rzhd.wuye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.service.IUserService;
import cn.rzhd.wuye.utils.MD5Utils;
import cn.rzhd.wuye.utils.UserContext;

@Controller
public class LoginBackController {
	@Autowired
	IUserService userService;

	@RequestMapping("/login")
	public String login(String username, String password, Model model) throws Exception {
		if (username != null && password != null) {
			password = MD5Utils.md5(password);
			User user = userService.getLoger(username, password);
			if (user != null) {
				UserContext.setUser(user);
				// 通过model当前用户传到界面
				
				user = UserContext.getUser();
				System.out.println(user);
				model.addAttribute("user", UserContext.getUser());
				return "index";
			}
		}
		return "login";
	}

	// 注销
	@RequestMapping("/loginOut")
	public String loginOut() {
		UserContext.getSession().removeAttribute(UserContext.LOGIN_USER);
		return "redirect:/login.jsp";
	}
}
