package cn.rzhd.wuye.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.rzhd.wuye.bean.User;

/**
 * @author 获取当前登陆用户
 *
 */
public class UserContext {
	public static final String LOGIN_USER = "loginUser";

	public static HttpServletRequest getRequest() {
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		return request;
	}

	public static HttpSession getSession() {
		return getRequest().getSession();
	}

	// 把用户放到Session中
	public static void setUser(User user) {
		getSession().setAttribute(LOGIN_USER, user);
	}

	// 从session中取出登录用户
	public static User getUser() {
		return (User) getSession().getAttribute(LOGIN_USER);
	}
}
