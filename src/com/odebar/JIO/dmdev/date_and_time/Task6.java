package com.odebar.JIO.dmdev.date_and_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate previousDate = LocalDate.of(2018, 7, 7);

        LocalDateTime localDateTimeNow = now.atStartOfDay();
        LocalDateTime localDateTimePrevious = previousDate.atStartOfDay();

        Duration duration = Duration.between(localDateTimePrevious, localDateTimeNow);
        System.out.println(duration.getSeconds());
    }
}
