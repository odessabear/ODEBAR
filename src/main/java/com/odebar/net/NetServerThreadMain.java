package com.odebar.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServerThreadMain {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8071);
            System.out.println(serverSocket.getInetAddress() + " server started");
            while (true) {
                Socket socket = serverSocket.accept();// waiting for a new client
                System.out.println(socket.getInetAddress().getHostName() + " connected");
// create a separate stream for data exchange with the connected client
                ServerThread thread = new ServerThread(socket);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ServerThread extends Thread {
    private PrintStream printStream; // send
    private BufferedReader reader; // receive
    private InetAddress address; // client address

    public ServerThread(Socket socket) {
        try {
            printStream = new PrintStream(socket.getOutputStream());
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        address = socket.getInetAddress();
    }

    public void run() {
        int counter = 0;
        String message;
        try {
            while ((message = reader.readLine()) != null) {
                if ("PING".equals(message)) {
                    printStream.println("PONG #" + ++counter);
                }
                /* # 8 # получение и передача сообщения клиентом в потоке # NetClient.java */
                System.out.println("PING-PONG #" + counter + " from " + address.getHostName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    private void disconnect() {
        if (printStream != null) {
            printStream.close();
        }
        try {
            if (reader != null) {
                reader.close();
            }
            System.out.println(address.getHostName() + ": disconnected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
