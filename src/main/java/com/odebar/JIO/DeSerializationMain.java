package com.odebar.JIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationMain {
    public static void main(String[] args) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("data/out.dat"))) {
            Student student = (Student) input.readObject();
            System.out.println(student);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
