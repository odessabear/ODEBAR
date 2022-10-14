package com.odebar.exceptions;

public class LearnMainUnchecked {
    public static void main(String[] args) {
        String[] numbers = {"42", "0", "Y-", "33"};
        int result;
        int value = 0;
        int sum = 0;
        for (String number : numbers) {
            try {
                result = Integer.parseInt(number);
                sum += 100 / result;
            } catch (NumberFormatException | ArithmeticException e) {
                System.err.println(e);
            }
        }
        System.out.println(sum);
    }
}
