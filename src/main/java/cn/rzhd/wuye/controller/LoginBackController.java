package cn.rzhd.wuye.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.SystemException;

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
	@Autowired
    private Producer captchaProducer;


	@RequestMapping(value = "/login", method = RequestMethod.POST , produces = "text/html; charset=utf-8")
	public String login(String username, String password, Model model,String mcode) throws Exception {
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
	
	
	   @RequestMapping("getKaptchaImage")
	    public ModelAndView getKaptchaImage(HttpServletRequest request, HttpServletResponse response) throws Exception {
	        HttpSession session = request.getSession();
	        String code = (String)session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
	        System.out.println("******************验证码是: " + code + "******************");
	         
	        response.setDateHeader("Expires", 0);
	        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
	        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
	        response.setHeader("Pragma", "no-cache");
	        response.setContentType("image/jpeg");
	        String capText = captchaProducer.createText();
	        session.setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
	         
	        BufferedImage bi = captchaProducer.createImage(capText);
	        ServletOutputStream out = response.getOutputStream();
	        ImageIO.write(bi, "jpg", out);
	        try {
	            out.flush();
	        } finally {
	            out.close();
	        }
	        return null;
	    }	 
}
