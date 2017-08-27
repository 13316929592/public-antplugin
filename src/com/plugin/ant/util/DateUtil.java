package com.plugin.ant.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * 日期工具类
 *
 * @since jdk1.6
 * @version 2015年10月20日 duqi
 */
public class DateUtil {
    
    /**
     * 获取当前时间
     *
     * @return 当前时间
     */
    public static String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
    
    /**
     * 日期字符串
     * @param dateString 日期字符串
     *
     * @return 日期
     * @throws ParseException 解析异常
     */
    public static Date parse(String dateString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(dateString);
    }
    
    /**
     * 日期字符串
     * @param date 日期
     *
     * @return 日期字符串
     */
    public static String format(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
    
    /**
     * 日期字符串
     * @param date 日期
     * @param format 格式
     *
     * @return 日期字符串
     */
    public static String format(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
}
