package com.odebar.strings;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) {
        Locale locale = new Locale("kz", "KZ");
        ResourceBundle bundle = ResourceBundle.getBundle("res.message", locale);

        String str1 = bundle.getString("str1");
        String str2 = bundle.getString("str2");
        System.out.println(str1 + " " + str2);
    }
}
