package com.odebar.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlgorithmMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.rotate(list, 3);
        System.out.println(list);
        System.out.println("min: " + Collections.min(list));
        System.out.println("max: " + Collections.max(list));
        List<Integer> singletonList = Collections.singletonList(777);
        System.out.println(singletonList);
    }
}
