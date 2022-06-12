package com.odebar.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternReplacementExample {

    public static void main(String[] args) {
        String phoneNumber = "+375 (33) 898-33-13 fdflgldsvlkf ldfdlf +375 (44) 777-12-13" +
                "dd;lk +375 (29) 657-13-29 f'e;fl'lf +375 (25) 111-11-11";
        String regex = "(?:\\+375)\\s?\\((?<code>\\d{2})\\)\\s?(\\d{3})-?(\\d{2})-?(\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        StringBuilder stringBuilder = new StringBuilder();

        while (matcher.find()) {
            String gr1 = matcher.group(2);
            String gr2 = matcher.group(3);
            String gr3 = matcher.group(4);
            matcher.appendReplacement(stringBuilder, "$2 - $3 - $4");
        }
        matcher.appendTail(stringBuilder);
        System.out.println(stringBuilder);
        System.out.println(phoneNumber.replaceAll(regex, "$2 - $3 - $4 | "));
    }
}
