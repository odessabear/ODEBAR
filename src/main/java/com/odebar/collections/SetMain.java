package com.odebar.collections;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("ten");
        System.out.println(set);
        set.add("ten");
        System.out.println(set);
        set.add(new String("ten"));
        System.out.println(set);

        Set<String> set1 = new HashSet<>() {
            {
                this.add("one");
                this.add("two");
                this.add("five");
            }
        };
        System.out.println(set1);
    }
}
