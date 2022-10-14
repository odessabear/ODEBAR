package com.odebar.JIO.metanit.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializableMain {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/person.dat"))) {
            Person p = (Person) ois.readObject();
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
