package com.odebar.functional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<Student> optionalStudent = Stream.of(new Student(18, "Ivan"),
                        new Student(23, "Peter"),
                        new Student(34, "Vasiliy"),
                        new Student(45, "Svetlana"),
                        new Student(20, "Katerina"),
                        new Student(68, "Den"),
                        new Student(101, "Kira"))
                .sequential()
                .reduce(((student, student2) -> student.getAge() > student2.getAge() ? student : student2));

        optionalStudent.map(Student::getAge)
                .flatMap(age -> Optional.of(age * 2))
                .ifPresent(System.out::println);
    }
}
