package com.odebar.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityMain {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.offer("J");
        queue.offer("A");
        queue.offer("V");
        queue.offer("A");
        queue.offer("2");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
