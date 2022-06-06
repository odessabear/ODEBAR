package com.odebar.JIO.dmdev.date_and_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DataTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        System.out.println(now.toInstant().toEpochMilli());

        ZonedDateTime plus = now.plus(1L, ChronoUnit.DAYS);
        System.out.println(plus);

        ZonedDateTime zonedDateTime = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(zonedDateTime);

        LocalDateTime localDateTime = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(localDateTime);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
