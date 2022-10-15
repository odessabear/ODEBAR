package com.odebar.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.*;

public class UDPSenderMain {
    public static void main(String[] args) {
        String fileName = "C:/tmp/Dvorak_SlavonicDance.mp3";
        try (FileInputStream inputStream = new FileInputStream(new File(fileName))) {
            byte[] data = new byte[1024];
            DatagramSocket datagramSocket = new DatagramSocket();
            InetAddress address = InetAddress.getLocalHost();
            DatagramPacket packet;
            System.out.println("sending file...");
            while (inputStream.read(data) != -1) {
                packet = new DatagramPacket(data, data.length, address, 8033);
                datagramSocket.send(packet);// data sending
            }
            System.out.println("file sent successfully.");
        } catch (UnknownHostException e) {
            e.printStackTrace(); // invalid recipient address
        } catch (SocketException e) { // errors during data transfer
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
