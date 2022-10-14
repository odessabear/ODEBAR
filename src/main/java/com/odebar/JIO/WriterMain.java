package com.odebar.JIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterMain {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data/info.txt");
             FileWriter writer = new FileWriter("data/out2.txt")) {
            int symbol = reader.read();
            System.out.println(symbol);
            writer.write(symbol);
            char[] buffer = new char[8];
            int charNum = reader.read(buffer);
            while (charNum != -1) {
                writer.write(buffer, 0, charNum);
                charNum = reader.read(buffer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
