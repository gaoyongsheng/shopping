package com.shopping.demo.utils;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @Author Gao
 * @Date 2020/11/22 15:54
 * @Version 1.0
 */
public class DateTimeUtils {
    
    public static String getSysCurDate(){
        return LocalDate.now() + " " + LocalTime.now();
    }

}
