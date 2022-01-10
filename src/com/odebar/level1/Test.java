package com.odebar.level1;

public class Test {
    public static void main(String[] args) {
        int value1 = 50;
        int value2 = 10;
        int result = getMax(value1, value2);
        System.out.println(result);
    }

    public static int getMax(int firstValue, int secondValue) {
        return Math.max(firstValue, secondValue);
    }
}
