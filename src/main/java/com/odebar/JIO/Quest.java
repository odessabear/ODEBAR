package com.odebar.JIO;

import java.io.IOException;
import java.util.Scanner;

public class Quest {
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(System.in);
        int x1;
        x1 = sc1.nextInt();
        sc1.close();
        int x2;
        x2 = System.in.read();
        System.out.println(x1 + " " + (char) x2);
    }
}
