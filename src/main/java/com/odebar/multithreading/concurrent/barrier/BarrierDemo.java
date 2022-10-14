package com.odebar.multithreading.concurrent.barrier;

import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BarrierDemo {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(RocketDetail.values().length, () -> System.out.println("Start!!!"));

        ExecutorService threadPool = Executors.newCachedThreadPool();

        Arrays.stream(RocketDetail.values())
                .map(rocketDetail -> new RocketDetailRunnable(rocketDetail, cyclicBarrier))
                .forEach(threadPool::submit);

        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.MINUTES);
    }
}
