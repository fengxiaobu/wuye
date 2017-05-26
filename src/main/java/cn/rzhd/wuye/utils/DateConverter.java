package cn.rzhd.wuye.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * springmvc自定义参数类型转换（String转Date）
 * @Title: DateConverter.java
 * @Package com.irzhd.weiye.util
 * @Description:
 * @author   qinjuncai   
 * @date     2016年8月2日 下午3:39:19 
 * @version  V1.0
 */
public class DateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String source) {
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			//String转Data
			return format.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
