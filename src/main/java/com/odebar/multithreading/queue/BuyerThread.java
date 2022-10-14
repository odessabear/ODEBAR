package com.odebar.multithreading.queue;

import java.util.Queue;

public class BuyerThread implements Runnable {

    private final Queue<CashBox> cashBoxes;

    public BuyerThread(Queue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }


    @Override
    public void run() {
        try {
            synchronized (cashBoxes) {
                while (true) {
                    if (!cashBoxes.isEmpty()) {
                        CashBox cashBox = cashBoxes.remove();
                        System.out.println(Thread.currentThread().getName() + " being served at the " + cashBox);

                        cashBoxes.wait(5L);

                        System.out.println(Thread.currentThread().getName() + " is leaving the cashBox " + cashBox);
                        cashBoxes.add(cashBox);
                        cashBoxes.notifyAll();
                        break;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " is waiting for free cashBox!");
                        cashBoxes.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

