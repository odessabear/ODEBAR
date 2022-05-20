package com.odebar.exceptions;

public class StaticExceptionMain {
    final static int value;

    static {
        value = Integer.parseInt("Y-");
    }

    public static void main(String[] args) {
        int a = value;
    }

}
