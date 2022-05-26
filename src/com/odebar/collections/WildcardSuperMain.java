package com.odebar.collections;

import com.odebar.entity.Person;
import com.odebar.entity.PersonNameComparator;
import com.odebar.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class WildcardSuperMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student());
        students.sort(((o1, o2) -> o1.getName().compareTo(o1.getName())));

//        action(students);
//        List<Person> persons = new ArrayList<>();
//        action(persons);
    }

    static void action(List<? super Student> list) {
        list.remove(0);
        list.add(new Student());
        //    list.add(new Person());
    }
}
