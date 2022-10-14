package com.odebar.exceptions;

public class StoneService {
    public void buildHouse(Stone stone) {
        try {
            stone.accept("some info");
        } catch (ResourceException e) {
            e.printStackTrace();
        }
    }
}
