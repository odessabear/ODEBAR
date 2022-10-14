package com.odebar.JIO.metanit.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableMain {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/person.dat"))) {
            Person p = new Person("Sam", 33, 178, true);
            oos.writeObject(p);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
