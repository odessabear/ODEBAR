package com.odebar.exceptions.dmdev;

public class Task5 {

    public static void main(String[] args) {
        try {
            catchCustomException();
        } catch (CustomException exception) {
            System.out.println("caught in main");
            exception.printStackTrace();
        }
    }

    public static void catchCustomException() {
        try {
            unsafe();
        } catch (RuntimeException exception) {
            System.out.println("caught in catchCustomException()");
            throw new CustomException(exception);
        }
    }

    public static void unsafe() {
        throw new RuntimeException("Task5");
    }
}
