package com.demo2.tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//自定义日期格式化工具类
public class DateFormatUtils {
    public static String getFormatDate(Date date){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        return  df.format(date);
    }
}


