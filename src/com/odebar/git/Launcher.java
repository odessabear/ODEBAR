package com.odebar.git;

public class Launcher {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(add(a, b));
        System.out.println(sub(a, b));
        System.out.println(multiply(a, b));
        System.out.println(pow(a, b));
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
