package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.utils.MD5Utils;
import cn.rzhd.wuye.utils.UserContext;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginBackController {



	@RequestMapping("/login")
	public String login(String username, String password, Model model) throws Exception {
		if (username != null && password != null) {
			password = MD5Utils.md5(password);//如果用户名和密码不为null,对密码进行加密
			Subject subject = SecurityUtils.getSubject();//获取当前主体
			AuthenticationToken token = new UsernamePasswordToken(username, password);//将登录输入的账号密码传入创建令牌
			try {
				subject.login(token);//调用主体的登录方法,传入令牌验证是否可以登录
                User user = (User) subject.getPrincipal();
                UserContext.setUser(user);//将验证通过的user放入session
                return "index";//跳转到主页
			} catch (UnknownAccountException e) {//用户名错误异常
				e.printStackTrace();
			} catch (IncorrectCredentialsException e) {//密码错误异常
				e.printStackTrace();
			} catch (Exception e){//其余异常
				e.printStackTrace();
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
