package com.odebar.collections;

import java.util.EnumMap;

public class EnumMapMain {
    public static void main(String[] args) {
        EnumMap<Country, Integer> map = new EnumMap<Country, Integer>(Country.class);
        map.put(Country.POLAND, 8);
        map.put(Country.UKRAINE, 1);
        map.put(Country.BELARUS, 0);

    }
}
