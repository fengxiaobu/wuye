package cn.rzhd.wuye.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTimeUtil {

	/**
	 * 将date转成string
	 * @param time
	 * @return
	 */
	public static String format(Date time){
		String timeStr = null ;
		if(time!=null){
			timeStr = new SimpleDateFormat("yyyy-MM-dd").format(time) ;
		}
		return timeStr ;
	}
	
	public static Date parse(String time) {
		Date date = null ;
		try {
			if(time!=null){
				date=  new SimpleDateFormat("yyyy-MM-dd").parse(time) ;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date ;
	}
	
}