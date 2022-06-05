package com.odebar.JIO.dmdev;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriterRunner {
    public static void main(String[] args) throws IOException {
//        File file = Path.of("data", "writer.other").toFile();
////        try (FileWriter fileWriter = new FileWriter(file, true)) {
////            fileWriter.append("Hello World!");
////            fileWriter.append("Java");
////        }
//
//        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {
//            fileWriter.append("Hello World!");
//            fileWriter.newLine();
//            fileWriter.append("Java");
//        }

        Path path = Path.of("data", "writer2.other");
        Files.write(path, List.of("Hello World!", "Java"));
    }
}
