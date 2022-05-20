package com.odebar.exceptions;

public class ConstructorMain {
    public static void main(String[] args) {
        try {
            ConcreteResource resource = new ConcreteResource();
        } catch (ResourceException e) {
            e.printStackTrace();
        }

        try {
            SameResource sameResource = new SameResource();
        } catch (ResourceException e) {
            e.printStackTrace();
        }
    }
}
