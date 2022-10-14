package com.odebar.JIO.dmdev.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String format = now.format(formatter);
        System.out.println(format);

        LocalDateTime now1 = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String format1 = now1.format(formatter1);
        System.out.println(format1);
    }
}
