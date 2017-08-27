package com.plugin.ant.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * ���ڹ�����
 *
 * @since jdk1.6
 * @version 2015��10��20�� duqi
 */
public class DateUtil {
    
    /**
     * ��ȡ��ǰʱ��
     *
     * @return ��ǰʱ��
     */
    public static String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
    
    /**
     * �����ַ���
     * @param dateString �����ַ���
     *
     * @return ����
     * @throws ParseException �����쳣
     */
    public static Date parse(String dateString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(dateString);
    }
    
    /**
     * �����ַ���
     * @param date ����
     *
     * @return �����ַ���
     */
    public static String format(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
    
    /**
     * �����ַ���
     * @param date ����
     * @param format ��ʽ
     *
     * @return �����ַ���
     */
    public static String format(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
}