package com.odebar.JIO.metanit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipProgram {
    public static void main(String[] args) {
        String filename = "data/notes.txt";
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("data/output.zip"));
             FileInputStream fis = new FileInputStream(filename);) {
            ZipEntry entry1 = new ZipEntry("notes.txt");
            zout.putNextEntry(entry1);
            // ��������� ���������� ����� � ������ byte
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            // ��������� ���������� � ������
            zout.write(buffer);
            // ��������� ������� ������ ��� ����� ������
            zout.closeEntry();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
