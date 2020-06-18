package com.qb.ad.common.util;


import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * 时间格式化工具
 */
public class DateUtils {

    public static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_YYYYMMDD = "yyyyMMdd";

    public static Date strToDate(String dateTimeStr,String formatStr){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(formatStr);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    public static String dateToStr(Date date,String formatStr){
        if(date == null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(formatStr);
    }

    public static Date strToDate(String dateTimeStr){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(STANDARD_FORMAT);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTime.toDate();
    }

    public static String dateToStr(Date date){
        if(date == null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(STANDARD_FORMAT);
    }

    public static String getCurrentDateStr() {
        return LocalDate.now().toString(FORMAT_YYYYMMDD);
    }
    public static String getCurrentDateStr(String formatter) {
        return LocalDate.now().toString(formatter);
    }

    public static void main(String[] args) {
        System.out.println(DateUtils.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
        System.out.println(DateUtils.getCurrentDateStr());
        System.out.println(DateUtils.strToDate("2010-01-01 11:11:11","yyyy-MM-dd HH:mm:ss"));
    }


}
