package com.odebar.strings;

import java.math.BigInteger;
import java.util.Base64;

public class PasswordHashingDemo {
    public static void main(String[] args) {
        String unencrypted = "very_Strong_pass7";
        byte[] bytes;

        Base64.Encoder encoder = Base64.getEncoder();
        bytes = encoder.encode(unencrypted.getBytes());
//        try {
//            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
//            messageDigest.update(unencrypted.getBytes(StandardCharsets.UTF_8));
//            bytes = messageDigest.digest();
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }
        BigInteger bigInteger = new BigInteger(1, bytes);
        String encrypted = bigInteger.toString(16);
        //       System.out.println(Arrays.toString(bytes));
        System.out.println(encrypted);
    }
}
