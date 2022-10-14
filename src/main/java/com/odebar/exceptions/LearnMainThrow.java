package com.odebar.exceptions;

public class LearnMainThrow {
    public static void main(String[] args) {
        int a = 010;
        if (a <= 0) {
            throw new IllegalArgumentException("wrong value");
        }
        double res = Math.pow(a, 2);
        System.out.println(res);
        System.out.println(meth(5));
    }

    public static int meth(int x) {
        int y = 010; //1
        try {
            y += x; //2
            if (x <= 5)
                throw new Exception(); //3
            y++;
        } //4
        catch (Exception e) {
            y--;
        } //5
        return y;
    }
}
