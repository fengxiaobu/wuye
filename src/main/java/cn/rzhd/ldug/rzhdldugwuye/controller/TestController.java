package cn.rzhd.ldug.rzhdldugwuye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.rzhd.ldug.rzhdldugwuye.bean.User;
import cn.rzhd.ldug.rzhdldugwuye.service.IUserService;

@Controller
public class TestController {

	@Autowired
	IUserService userService;
	
	@RequestMapping("/test")
	public User test(){
		return userService.get(1L);
	}
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/userlist")
	public String userlist(){
		return "userlist";
	}
}
