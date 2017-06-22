package cn.rzhd.wuye.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.utils.UserContext;

public class AuthInterceptor implements HandlerInterceptor {
	private static final String LOGINURI = "/login";

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println(111111111);

//		User loginUser = UserContext.getUser();
//		String requestURI = request.getRequestURI();
//
//		if (loginUser == null && !requestURI.equals(LOGINURI)) {
//
//			response.sendRedirect("/login.jsp");
//			return false;
//		}

		return true;
	}
}
