package com.odebar.JIO.metanit;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterProgram {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("data/notes3.txt", false)) {
            // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
