package com.odebar.net;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketTimeoutException;

public class UDPRecipientMain {
    final static int WAIT_TIMEOUT = 60_000;

    public static void main(String[] args) {
        File file = new File("C:/tmp/Dvorak_SlavonicDance2.mp3");
        System.out.println("receiving data ...");
        acceptFile(file, 8033, 1024);
        System.out.println("data reception completed");
    }

    private static void acceptFile(File file, int port, int pacSize) {
        byte data[] = new byte[pacSize];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            DatagramSocket datagramSocket = new DatagramSocket(port);
            datagramSocket.setSoTimeout(WAIT_TIMEOUT);/* setting the timeout: if within
60 seconds no packets were received, data reception ends */
            while (true) {
                datagramSocket.receive(packet);
                outputStream.write(data);
                outputStream.flush();
                /* # 10 # передача данных по протоколу UDP # UDPSenderMain.java */
            }
        } catch (SocketTimeoutException e) {
            System.err.println("Timed out, data reception is finished:" + e);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
