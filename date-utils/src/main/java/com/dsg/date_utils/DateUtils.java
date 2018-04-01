package com.dsg.date_utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static String getTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("kk:mm");
        return sdf.format(date);
    }
}
