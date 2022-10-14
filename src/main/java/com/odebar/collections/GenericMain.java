package com.odebar.collections;

import com.odebar.entity.Person;
import com.odebar.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Student());
        list.add(new Student());
        list.add(new Person());
        Person person = list.get(2);

//        List list = new ArrayList();
//        list.add(new Student());
//        list.add(new Student());
//        list.add("abc");
//        list.add(new Person());
//
//        Person person = (Person) list.get(2);
    }
}
