package com.odebar.JIO;

import java.io.*;

public class ReaderWriterMain {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data/info.txt");
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter("data/out.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line, 0, line.length());
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
