package cn.rzhd.wuye.conf;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
/**
 * @ClassName GlobalExceptionHandler
 * @Description 统一异常处理类
 * @author qinjuncai
 * @Date 2017年6月30日 下午6:55:56
 * @version 1.0.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error_page";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        
        CustomException customException = null;
      //如果抛出的是系统自定义异常则直接转换
        if(e instanceof CustomException){
            customException = (CustomException)e;
        }else{
            //不是系统自定义的异常，则重新构造新的未知异常
            customException = new CustomException("发生未知异常，请与系统管理员联系！");
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message",customException.getMessage());
        modelAndView.setViewName(DEFAULT_ERROR_VIEW);
        return modelAndView;
    }

}