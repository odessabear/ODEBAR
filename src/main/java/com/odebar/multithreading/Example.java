package com.odebar.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Example {

    private List<Integer> list;

    public Example(List<Integer> list) {
        //    this.list = List.copyOf(list);
        this.list = list;
    }

    public synchronized List<Integer> getList() {
        //    return list;
        return new ArrayList<>(list);
    }
}
