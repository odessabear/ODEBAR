package com.odebar.JIO.metanit;

import java.io.*;

public class DataInputOutputStream {
    public static void main(String[] args) {
        Person tom = new Person("Tom", 34, 1.68, false);
        // ������ � ����
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data/data.bin"))) {
            // ���������� ��������
            dos.writeUTF(tom.name);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
            System.out.println("File has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        // �������� ���������� �� �����
        try (DataInputStream dos = new DataInputStream(new FileInputStream("data/data.bin"))) {
            // ���������� ��������
            String name = dos.readUTF();
            int age = dos.readInt();
            double height = dos.readDouble();
            boolean married = dos.readBoolean();
            System.out.printf("Name: %s  Age: %d  Height: %f  Married: %b",
                    name, age, height, married);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
