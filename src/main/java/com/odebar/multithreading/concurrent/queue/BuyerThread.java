package com.odebar.multithreading.concurrent.queue;

import java.util.concurrent.BlockingQueue;

public class BuyerThread implements Runnable {

    private final BlockingQueue<CashBox> cashBoxes;

    public BuyerThread(BlockingQueue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }


    @Override
    public void run() {
        try {
            CashBox cashBox = cashBoxes.take();
            System.out.println(Thread.currentThread().getName() + " being served at the " + cashBox);
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " is leaving the cashBox " + cashBox);
            cashBoxes.add(cashBox);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

