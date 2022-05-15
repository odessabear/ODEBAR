package com.odebar.strings;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.GERMAN);
        String source = "1.234,567";
        NumberFormat numberFormatUS = NumberFormat.getInstance(Locale.US);
        NumberFormat numberFormatFR = NumberFormat.getInstance(Locale.FRANCE);
        try {
            double number = numberFormat.parse(source).doubleValue();
            System.out.println(number);
            String resultUS = numberFormatUS.format(number);
            System.out.println("US " + resultUS);
            String resultFR = numberFormatFR.format(number);
            System.out.println("FR " + resultFR);

            double numberUS = numberFormatUS.parse(source).doubleValue();
            System.out.println("Parse US " + numberUS);
            double numberFR = numberFormatFR.parse(source).doubleValue();
            System.out.println("Parse FR " + numberFR);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
