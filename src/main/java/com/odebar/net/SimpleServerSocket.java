package com.odebar.net;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServerSocket {
    public static void main(String[] args) {
        System.out.println("server starts");
        try (ServerSocket serverSocket = new ServerSocket(2048);
             Socket socket = serverSocket.accept();
             PrintWriter writer = new PrintWriter(
                     new OutputStreamWriter(socket.getOutputStream()))) {
            writer.println("java tutorial");// put string "java tutorial" into the buffer
            writer.flush();// send the contents of the buffer to the client
        } catch (IOException e) {
            System.err.println("IO error connection: " + e);
        }
        System.out.println("server is closed");
    }
}
