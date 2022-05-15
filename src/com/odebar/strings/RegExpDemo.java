package com.odebar.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegExpDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("java");
        pattern.split("dfjavalk");

        String[] res = pattern.split("dfjava12--java5432");
        System.out.println(Arrays.toString(res));

        System.out.println(Pattern.matches("y+z", "yyz"));
    }
}
