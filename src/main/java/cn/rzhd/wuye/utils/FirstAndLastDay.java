package cn.rzhd.wuye.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by hasee on 2017/6/1.
 * 此工具用于获得系统时间当月的第一天和最后一天
 */
public class FirstAndLastDay {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

    /**
     * 获得本月第一天的date
     *
     * @return 本月第一天
     */
    public static Date getFirstDay() {
        Calendar cal = Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        //设置月份
        cal.set(Calendar.MONTH, cal.get(Calendar.MONTH));
        //设置日历中月份的第1天
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date time = cal.getTime();
        return time;
    }

    /**
     * 获得本月最后一天的date
     *
     * @return 本月最后一天的date
     */
    public static Date getLastDay() {
        Calendar cal = Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        //设置月份
        cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) + 1);
        //设置日历中月份的最后一天
        cal.set(Calendar.DAY_OF_MONTH, 0);
        Date time = cal.getTime();
        return time;
    }

    /**
     * 获取当前传入月份的第一天
     *
     * @param startDate
     * @return
     */
    public static Date getFirst(String startDate) {
        try {
            Date date = sdf.parse(startDate);
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            instance.set(Calendar.DAY_OF_MONTH, 1);
            return instance.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return getFirstDay();
    }

    /**
     * 获取当前传入月份的次月第一天,用于数据库查询
     *
     * @param endDate
     * @return
     */
    public static Date getLast(String endDate) {
        try {
            Date date = sdf.parse(endDate);
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            instance.set(Calendar.MONTH, instance.get(Calendar.MONTH) + 1);
            instance.set(Calendar.DAY_OF_MONTH, 1);
            return instance.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return getLastDay();
    }

    /**
     * 获取当前年的第一天
     *
     * @return
     */
    public static Date getYearFirst() {

        Date date = new Date();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.set(Calendar.MONTH, 0);
        instance.set(Calendar.DAY_OF_MONTH, 1);
        return instance.getTime();
    }

    /**
     * 获取当前系统日期的第二天,用于数据库查询
     *
     * @return
     */
    public static Date getNow() {

        Date date = new Date();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.set(Calendar.DAY_OF_MONTH, instance.get(Calendar.DAY_OF_MONTH) + 1);
        return instance.getTime();


    }
}
