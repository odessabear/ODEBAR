package com.odebar.multithreading.concurrent.pool;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(4);
        //   threadPool.schedule(() -> System.out.println("OK!"),3L,TimeUnit.SECONDS);
        threadPool.scheduleAtFixedRate(() -> System.out.println("OK!"), 2L, 4L, TimeUnit.SECONDS);

        //threadPool.shutdown();
        //threadPool.awaitTermination(1L, TimeUnit.SECONDS);
    }

    private static void test() throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        Future<Integer> future = threadPool.submit(() -> {
            Thread.sleep(2000L);
            System.out.println("It's callable");
            return 1;
        });

        System.out.println("Result: " + future.get());
        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
        System.out.println("main end");
    }
}
