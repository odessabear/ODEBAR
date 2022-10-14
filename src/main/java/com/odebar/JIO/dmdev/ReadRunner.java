package com.odebar.JIO.dmdev;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ReadRunner {
    public static void main(String[] args) throws IOException {
//        File file = Path.of("data", "test.txt").toFile();
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
//            String collect = bufferedReader.lines()
//                    .collect(Collectors.joining("\n"));
//            System.out.println(collect);
//        }

        Path path = Path.of("data", "test.txt");
        try (Stream<String> lines = Files.lines(path, Charset.defaultCharset())) {
            lines.forEach(System.out::println);
        }
    }
}
