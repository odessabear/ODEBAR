package com.odebar.multithreading.concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class BuyerThread implements Runnable {

    private final Semaphore cashBoxes;

    public BuyerThread(Semaphore cashBoxes) {
        this.cashBoxes = cashBoxes;
    }


    @Override
    public void run() {
        try {
            cashBoxes.acquire();
            System.out.println(Thread.currentThread().getName() + " being served at the some cashBox");
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " is leaving the some cashBox");

            cashBoxes.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

