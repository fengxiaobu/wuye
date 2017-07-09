package cn.rzhd.wuye.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.SystemException;
import javax.validation.constraints.Null;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;

import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.utils.MD5Utils;
import cn.rzhd.wuye.utils.UserContext;

@Controller
public class LoginBackController {
	private Producer captchaProducer = null;

	@Autowired
	public void setCaptchaProducer(Producer captchaProducer) {
		this.captchaProducer = captchaProducer;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "text/html; charset=utf-8")
	public String login(HttpServletRequest request, String username, String password, Model model, String validatecode)
			throws Exception {
		// 用户输入的验证码的值
		String kaptchaExpected = (String) request.getSession()
				.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		// 校验验证码是否正确
//		if (validatecode == null || !validatecode.equals(kaptchaExpected)) {
//			request.setAttribute("errorMsg", "验证码错误！");
//		}

		if (username != null && password != null) {
			password = MD5Utils.md5(password);// 如果用户名和密码不为null,对密码进行加密
			Subject subject = SecurityUtils.getSubject();// 获取当前主体
			AuthenticationToken token = new UsernamePasswordToken(username, password);// 将登录输入的账号密码传入创建令牌
			try {
				subject.login(token);// 调用主体的登录方法,传入令牌验证是否可以登录
				User user = (User) subject.getPrincipal();
				UserContext.setUser(user);// 将验证通过的user放入session
				return "index";// 跳转到主页
			} catch (UnknownAccountException e) {// 用户名错误异常
				e.printStackTrace();
			} catch (IncorrectCredentialsException e) {// 密码错误异常
				e.printStackTrace();
			} catch (Exception e) {// 其余异常
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

	// 生成验证码
	@RequestMapping("/kaptcha.jpg")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// Set to expire far in the past.
		response.setDateHeader("Expires", 0);
		// Set standard HTTP/1.1 no-cache headers.
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		// Set IE extended HTTP/1.1 no-cache headers (use addHeader).
		response.addHeader("Cache-Control", "post-check=0, pre-check=0");
		// Set standard HTTP/1.0 no-cache header.
		response.setHeader("Pragma", "no-cache");

		// return a jpeg
		response.setContentType("image/jpeg");

		// create the text for the image
		String capText = captchaProducer.createText();

		// store the text in the session
		request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);

		// create the image with the text
		BufferedImage bi = captchaProducer.createImage(capText);

		ServletOutputStream out = response.getOutputStream();

		// write the data out
		ImageIO.write(bi, "jpg", out);
		try {
			out.flush();
		} finally {
			out.close();
		}
		return null;
	}
}
