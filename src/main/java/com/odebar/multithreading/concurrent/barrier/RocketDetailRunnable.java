package com.odebar.multithreading.concurrent.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class RocketDetailRunnable implements Runnable {

    private final RocketDetail rocketDetail;
    private final CyclicBarrier cyclicBarrier;

    public RocketDetailRunnable(RocketDetail rocketDetail, CyclicBarrier countDownLatch) {
        this.rocketDetail = rocketDetail;
        this.cyclicBarrier = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Waiting for detail: " + rocketDetail);
        try {
            Thread.sleep(1000L);
            System.out.println("Detail: " + rocketDetail + " is ready and waiting!");
            cyclicBarrier.await();
            System.out.println("Detail: " + rocketDetail + " is used");
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
