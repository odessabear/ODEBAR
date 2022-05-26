package com.odebar.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(777);
        vector.add("java");
        vector.add("ukrainian");
        vector.add(1, null);
        vector.addAll(vector);
        System.out.println(vector);
        vector.removeIf(e -> e == null);
        vector.replaceAll(String::toUpperCase);
        System.out.println(vector);
        long counter = vector.stream().count();
        System.out.println(counter);
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
