package com.odebar.collections;

import com.odebar.entity.Person;

import java.util.ArrayList;


public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(701, "Bob"));
        list.add(new Person(509, "Jack"));
        list.add(new Person(817, "Robin"));
        list.add(new Person(109, "Peter"));
        System.out.println(list);
        //Collections.sort(list, new PersonNameComparator());
        //list.sort(new PersonNameComparator());
        list.sort(new Person.NameComparator());
        System.out.println(list);
    }
}
