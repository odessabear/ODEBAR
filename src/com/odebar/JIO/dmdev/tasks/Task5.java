package com.odebar.JIO.dmdev.tasks;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Task5 {
    public static void main(String[] args) {
        Path path = Path.of("src", "com", "odebar", "JIO", "dmdev", "tasks", "Task4.java");
        Path resultPath = Path.of("data", "Task4.java");

        try (Stream<String> lines = Files.lines(path, Charset.defaultCharset());
             BufferedWriter bufferedWriter = Files.newBufferedWriter(resultPath, APPEND, CREATE)) {
            lines.map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(line -> {
                        try {
                            bufferedWriter.write(line.toString());
                            bufferedWriter.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
