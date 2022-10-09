package com.odebar.JIO;

import java.util.Locale;
import java.util.Scanner;

public class ScannerDelimiterMain {
    public static void main(String[] args) {
        double sum = 0.0;
        String numbersStr = "1,3;2,0; 8,5; 4,8;9,0; 1; 10;";
        Scanner scan = new Scanner(numbersStr)
                .useLocale(Locale.US) // change to Locale.US
                .useDelimiter(";\\s*");
        while (scan.hasNext()) {
            if (scan.hasNextDouble()) {
                sum += scan.nextDouble();
            } else {
                System.out.println(scan.next());
            }
        }
        System.out.printf("Sum = " + sum);
        scan.close();
    }
}
