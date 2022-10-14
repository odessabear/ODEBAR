package com.odebar.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class LegacyMain {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("Jeans", 40);
        table.put("T-Shirt", 35);
        table.put("Gloves", 42);
        table.compute("Shoes", (k, v) -> 77);
        table.computeIfPresent("Shoes", (k, v) -> v + k.length());
        table.computeIfAbsent("Shoes", v -> 11);
        Enumeration<String> keys = table.keys();
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }
        Enumeration<Integer> values = table.elements();
        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }
        //System.out.println(table);
    }
}
