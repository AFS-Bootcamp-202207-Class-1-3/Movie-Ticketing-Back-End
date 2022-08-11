package com.cool.movie.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class TimestampUtil {

    private static final String FORMATTER_PATTERN = "yyMMdd-HHmmssSSS";
    private static final int BIG_NUM = 10000000;

    public static String generateOrderNumber () {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMATTER_PATTERN);
        LocalDateTime localDateTime = Instant.ofEpochMilli(System.currentTimeMillis()).atZone(ZoneOffset.ofHours(8)).toLocalDateTime();
        return formatter.format(localDateTime) + (int)((Math.random() * 9 + 1) * BIG_NUM);
    }
}
