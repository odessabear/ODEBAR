package com.odebar.exceptions.dmdev;

import java.io.FileNotFoundException;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("main start");
        try {
            unsafe(10);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("main end");
    }

    public static void unsafe(int value) throws FileNotFoundException {
        System.out.println("unsafe start");
        if (value > 0) {
            throw new FileNotFoundException();
        }
        System.out.println("unsafe end");
    }
}
