package com.odebar.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>() {
            {
                this.offer("Jeans");
            }
        };
        queue.add("Dress");
        queue.offer("T-Shirt");

//        queue.removeIf(s -> s.endsWith("t"));
//        queue.forEach(System.out::println);


//        System.out.println();
//        queue.remove("Dress");
//        queue.forEach(System.out::println);
//        queue.clear();
//        queue.element();

        queue.stream().filter(s -> !s.endsWith("t")).forEach(System.out::println);
        System.out.println();
        queue.forEach(System.out::println);
    }
}
