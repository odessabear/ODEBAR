package com.odebar.strings;

import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale locale = Locale.FRANCE;
        Locale locale1 = Locale.getDefault();
        System.out.println(locale1);
        Locale locale2 = new Locale("ua");
        Locale locale3 = new Locale("ua", "UA");

        Locale.setDefault(locale3);

    }
}
