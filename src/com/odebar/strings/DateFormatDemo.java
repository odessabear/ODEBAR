package com.odebar.strings;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM, new Locale("ua", "UA"));
        String dateStr = dateFormat.format(new Date());
        System.out.println(dateStr);

        try {
            Date date = dateFormat.parse("2022 May 15, Sun 18:13:23");
            System.out.println(date);
            DateFormat dateFormatCA = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.CANADA);
            System.out.println(dateFormatCA.format(date));
            DateFormat dateFormatFR = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.FRANCE);
            System.out.println(dateFormatFR.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
