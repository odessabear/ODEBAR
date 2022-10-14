package com.odebar.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapEntryMain {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Пряник", 5);
        hashMap.put("Кефир", 1);
        hashMap.put("Хлеб", 1);
        hashMap.putIfAbsent("Хлеб", 2); // replacement will not happen
        hashMap.putIfAbsent("Молоко", 5);
        hashMap.computeIfAbsent("Сырок", v -> 3); // adding a pair
        hashMap.computeIfPresent("Сырок", (k, v) -> 4); // replacement a value
        hashMap.computeIfAbsent("Сырок", v -> 144);// replacement will not happen
        System.out.println(hashMap);
        hashMap.put("Пряник", 4); // replacement or addition in the absence of a key
        System.out.println(hashMap + "after replacing the element");
        System.out.println(hashMap.get("Хлеб") + " - found by key 'Хлеб'");
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        System.out.println(entrySet);
        entrySet.stream()
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
        Set<Integer> values = new HashSet<Integer>(hashMap.values());
        System.out.println(values);
    }
}
