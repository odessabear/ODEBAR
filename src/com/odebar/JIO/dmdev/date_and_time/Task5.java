package com.odebar.JIO.dmdev.date_and_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Task5 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate previousDate = LocalDate.of(2018, 7, 7);

        Period period = Period.between(previousDate, now);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        long daysResult = ChronoUnit.DAYS.between(previousDate, now);
        System.out.println(daysResult);
    }
}
