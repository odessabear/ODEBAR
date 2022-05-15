package com.odebar.strings;

import java.util.Arrays;

public class StringTest {
    static String string1 = "hello";

    public static void main(String[] args) {
        String string2 = new String("hello");
        System.out.println(string1 == string2);
        string2 = string2.intern();
        System.out.println(string1 == string2);

        String str1 = "      46        45656      ";
        System.out.println(str1.strip());
        System.out.println(str1.replaceAll("\\s+", ""));

        String xss = "<script>alert()</script>";
        System.out.println(xss.replaceAll("</?script>", ""));

        String str2 = "453409   fd;glmf/.,gdf6789__--===45-430";
        String[] strings = str2.split("\\D+");
        System.out.println(Arrays.toString(strings));

        String str3 = String.format("java %.2s he%nllo %5.2f", "SE000", 55.97565234242);
        System.out.println(str3);


    }
}
