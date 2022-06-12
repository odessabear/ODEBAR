package com.odebar.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {

    public static void main(String[] args) {
        String phoneNumber = "+375 (33) 898-33-13 fdflgldsvlkf ldfdlf +375 (44) 777-12-13" +
                "dd;lk +375 (29) 657-13-29 f'e;fl'lf +375 (25) 111-11-11";
        String regex = "(?:\\+375)\\s?\\((?<code>\\d{2})\\)\\s?\\d{3}-?\\d{2}-?\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group("code"));
        }
    }
}
