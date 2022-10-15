package com.odebar.net;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class UrlMain {
    public static void main(String[] args) {
        String urlName = "http://www.google.com";
        int timeout = 10_000_000;
        try {
            URL url = new URL(urlName);
            URLConnection connection = url.openConnection();
            connection.setConnectTimeout(timeout);//set timeout for connection
            connection.connect();
            System.out.println(urlName + "::content type:" + connection.getContentType());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
