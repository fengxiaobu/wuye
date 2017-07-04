package cn.rzhd.wuye.conf;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import cn.rzhd.wuye.utils.StringToDateConverter;



/**
 * @ClassName StringToDateConfigBeans
 * @Description 字符串转日期的功能
 * @author qinjuncai
 * @Date 2017年7月5日 上午1:08:51
 * @version 1.0.0
 */
@Configuration
public class StringToDateConfigBeans {
	
	 	@Autowired
	    private RequestMappingHandlerAdapter handlerAdapter;

	    /**
	     * 增加字符串转日期的功能
	     */
	    @PostConstruct
	    public void initEditableValidation() {
	        ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer) handlerAdapter
	            .getWebBindingInitializer();
	        if (initializer.getConversionService() != null) {
	            GenericConversionService genericConversionService = (GenericConversionService) initializer
	                .getConversionService();
	            genericConversionService.addConverter(new StringToDateConverter());
	        }

	    }
}
