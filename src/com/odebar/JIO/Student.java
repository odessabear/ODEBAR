package com.odebar.JIO;

import java.io.Serializable;

public class Student implements Serializable {
    static String faculty = "MMF";
    private String name;
    private int id;
    private transient String password;
    private static final long serialVersionUID = 1L;

    public Student(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public String toString() {
        return "\nfaculty " + faculty + "\nname " + name + "\nID " + id + "\npassword " + password;
    }
}
