package com.odebar.JIO;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderMain {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("data/info.txt")) {
            int symbol = reader.read();
            System.out.println(symbol);
            char[] buffer = new char[8];
            reader.skip(2);
            reader.read(buffer);
            System.out.println(Arrays.toString(buffer));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Path path = Paths.get("data\\res.txt");
        try (Stream<String> streamLines = Files.lines(path)) {
            String result = streamLines.collect(Collectors.joining());
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
