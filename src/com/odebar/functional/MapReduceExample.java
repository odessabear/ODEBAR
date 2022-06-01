package com.odebar.functional;

import java.util.stream.Stream;

public class MapReduceExample {
    public static void main(String[] args) {
        Stream.of(new Student(18, "Ivan"),
                        new Student(23, "Peter"),
                        new Student(34, "Vasiliy"),
                        new Student(45, "Svetlana"),
                        new Student(20, "Katerina"),
                        new Student(68, "Den"),
                        new Student(101, "Kira"))
                .parallel()
                .sequential()
                .map(Student::getAge)
                .reduce(Math::min)
                .ifPresent(System.out::println);
    }
}
