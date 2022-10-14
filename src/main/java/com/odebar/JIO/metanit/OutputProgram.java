package com.odebar.JIO.metanit;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputProgram {
    public static void main(String[] args) {
        String text = "Hello world!"; // строка для записи
        try (FileOutputStream fos = new FileOutputStream("data/notes.txt")) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
