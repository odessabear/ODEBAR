package com.odebar.regex.task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String regex = "0[Xx][\\da-fA-F]+";
        String input = "dghgfj 0Xff okokughkui 0x12 thtp;ohk 0XAB ;okpo";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
