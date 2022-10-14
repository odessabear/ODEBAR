package com.odebar.JIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputDemo {
    public static void main(String[] args) {
        FileInputStream input = null;
        try {
            input = new FileInputStream("data/info.txt");
            int code = input.read();
            System.out.println(code + " char = " + (char) code);
            byte[] array = new byte[16];
            int num = input.read(array);
            System.out.println("num = " + num);
            System.out.println(Arrays.toString(array));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
