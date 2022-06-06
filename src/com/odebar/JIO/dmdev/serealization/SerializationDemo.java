package com.odebar.JIO.dmdev.serealization;

import java.io.*;
import java.nio.file.Path;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("data", "person.out");
        writeObject(path);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object object = objectInputStream.readObject();
            System.out.println(object);
        }
    }

    private static void writeObject(Path path) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Person sergio = new Person(26, "Sergio");
            objectOutputStream.writeObject(sergio);
        }
    }
}
