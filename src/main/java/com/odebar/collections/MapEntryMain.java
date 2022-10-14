package com.odebar.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapEntryMain {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("������", 5);
        hashMap.put("�����", 1);
        hashMap.put("����", 1);
        hashMap.putIfAbsent("����", 2); // replacement will not happen
        hashMap.putIfAbsent("������", 5);
        hashMap.computeIfAbsent("�����", v -> 3); // adding a pair
        hashMap.computeIfPresent("�����", (k, v) -> 4); // replacement a value
        hashMap.computeIfAbsent("�����", v -> 144);// replacement will not happen
        System.out.println(hashMap);
        hashMap.put("������", 4); // replacement or addition in the absence of a key
        System.out.println(hashMap + "after replacing the element");
        System.out.println(hashMap.get("����") + " - found by key '����'");
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        System.out.println(entrySet);
        entrySet.stream()
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
        Set<Integer> values = new HashSet<Integer>(hashMap.values());
        System.out.println(values);
    }
}
