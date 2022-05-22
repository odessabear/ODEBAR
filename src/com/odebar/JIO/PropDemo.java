package com.odebar.JIO;

import java.util.Properties;

public class PropDemo {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.list(System.out);
    }
}
