package com.odebar.JIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutMain {
    public static void main(String[] args) {
        try (FileOutputStream output = new FileOutputStream("data/out.txt", true)) {
            output.write(48);
            byte[] values = {65, 67, 100};
            output.write(values);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
    }
}
