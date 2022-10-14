package com.odebar.JIO.metanit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipReadProgram {
    public static void main(String[] args) {
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream("data/output.zip"))) {
            ZipEntry entry;
            String name;
            long size;
            while ((entry = zin.getNextEntry()) != null) {

                name = entry.getName(); // ������� �������� �����
                size = entry.getSize();  // ������� ��� ������ � ������
                System.out.printf("File name: %s \t File size: %d \n", name, size);

                // ����������
                FileOutputStream fout = new FileOutputStream("data/new" + name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
