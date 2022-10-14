package com.odebar.collections;

import java.util.EnumSet;

import static com.odebar.collections.Country.*;

public class CountrySetMain {
    public static void main(String[] args) {
        EnumSet<Country> asiaCountries = EnumSet.of(ARMENIA, INDIA, KAZAKHSTAN);
        String countryName = "Poland";
        Country current = Country.valueOf(countryName.toUpperCase());
        if (asiaCountries.contains(current)) {
            System.out.println("Asia Action");
        }
        asiaCountries.forEach(country -> country.grow(1));

    }
}
