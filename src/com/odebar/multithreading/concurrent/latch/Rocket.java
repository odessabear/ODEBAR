package com.odebar.multithreading.concurrent.latch;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable {

    private final CountDownLatch countDownLatch;

    public Rocket(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Rocket is preparing to start....");
        try {
            countDownLatch.await();
            System.out.println("Start");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
