package com.odebar.JIO.xml_serialization;

import java.io.Serializable;
import java.util.StringJoiner;

public class Student implements Serializable {
    static String faculty = "MMF";
    private String name;
    private int id;
    private transient String password;
    private static final long serialVersionUID = 2L;

    public Student() {
    }

    public Student(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'").add("id=" + id)
                .add("password='" + password + "'").toString();
    }
}
