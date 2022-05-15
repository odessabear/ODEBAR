package com.odebar.strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder();

//        System.out.println(builder.length());
//        System.out.println(builder.capacity());
//        builder.append("hello");
//        System.out.println(builder.length());
//        System.out.println(builder.capacity());
//        builder.insert(0, " internationalization");
//        System.out.println(builder.length());
//        System.out.println(builder.capacity());
//        System.out.println(builder.reverse());

        builder.append("java");
        builder1.append(builder);
        System.out.println(builder + " " + builder1);
        System.out.println(builder.equals(builder1) + " " + (builder.hashCode() == builder1.hashCode()));
        System.out.println(builder.toString().contentEquals(builder1));
    }


}
