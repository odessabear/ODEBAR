package com.odebar.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {
        String phoneNumber = "+375(29)8981213";
        String regex = "\\+375\\s?\\(\\d{2}\\)\\s?\\d{3}-?\\d{2}-?\\d{2}";
        // version 1
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        System.out.println(matcher.matches());
        //version 2
        System.out.println(Pattern.matches(regex, phoneNumber));
        // version 3
        System.out.println(phoneNumber.matches(regex));
    }
}
