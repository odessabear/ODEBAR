package com.odebar.JIO.metanit;

import java.io.*;

public class BufRWProgram {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("data/notes5.txt"))) {
            // чтение построчно
            String text;
            while (!(text = br.readLine()).equalsIgnoreCase("ESC")) {

                bw.write(text + "\n");
                bw.flush();
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
