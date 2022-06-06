package com.odebar.JIO.dmdev.date_and_time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task8 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime dateTime = now.with(temporal -> temporal.plus(42L, ChronoUnit.DAYS));
        System.out.println(dateTime);
    }
}
