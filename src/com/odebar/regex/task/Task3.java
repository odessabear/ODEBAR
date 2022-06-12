package com.odebar.regex.task;

public class Task3 {

    public static void main(String[] args) {
        String regex = "(<p .+?>)(.+?</p>)";
        String input = "<p>ef gthh </p> <b> erer </b> hjtyjyj tyhtyhyth <p id=\"p1\"> rewrereref</p>" +
                "troypto <p>eere rggt <p id=\"p2\">21324 df</p> ergreg";
        System.out.println(input.replaceAll(regex, "<p>$2"));
    }
}
