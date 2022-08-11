package com.cool.movie.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static String dateFormat(Date date, String format) {
        if (date == null) {
            return "";
        }
        return new SimpleDateFormat(format).format(date);
    }


    public static String dateFormat(Date date) {
        if (date == null) {
            return "";
        }
        return dateFormat(date, "YYYY/MM/dd hh:mm");
    }

    public static String dateFormatForTimeStamp(Timestamp timestamp) {
        if (timestamp == null) {
            return "";
        }
        return dateFormat(timestamp, "YYYY-MM-dd hh:mm:SS");
    }

}
