package com.odebar.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class GreyStone {
    public void accept(String data) throws IOException {
        FileWriter writer = new FileWriter("data");
    }
}
