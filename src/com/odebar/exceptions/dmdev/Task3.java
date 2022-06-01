package com.odebar.exceptions.dmdev;

public class Task3 {
    public static void main(String[] args) {
        try {
            unsafe();
        } catch (CustomException e) {
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void unsafe() throws CustomException {
        throw new CustomException("custom exception");
    }
}
