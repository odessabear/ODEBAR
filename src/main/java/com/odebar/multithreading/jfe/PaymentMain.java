package com.odebar.multithreading.jfe;

import java.util.concurrent.TimeUnit;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment = new Payment();
        new Thread(payment::doPayment).start();
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        payment.init();
    }
}
