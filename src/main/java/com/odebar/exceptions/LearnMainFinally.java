package com.odebar.exceptions;

public class LearnMainFinally {
    public static void main(String[] args) {
        String[] numbers = {"42", "0", "Y-", "33"};
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            try {
                sum += 100 / Integer.parseInt(numbers[i]);
            } catch (ArithmeticException e) {
                System.err.println(e);
            } finally {
                System.out.println("counter = " + ++counter);
            }
        }
        System.out.println(sum);
    }
}
