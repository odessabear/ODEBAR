package com.odebar.multithreading.jfe;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class ActionParallelMain {
    public static void main(String[] args) {
        long sec = System.currentTimeMillis();
        Callable<Integer> task = () -> IntStream.range(0, 1_000_000_000)
                .boxed()
                .parallel()
                .map(x -> x / 3)
                .peek(th -> System.out.println(Thread.currentThread().getName()))
                .reduce((x, y) -> x + (int) (3 * Math.sin(y)))
                .get();
        ForkJoinPool pool = new ForkJoinPool(8);// 8 processors
        try {
            int result = pool.submit(task).get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println((System.currentTimeMillis() - sec) / 1000.);
    }
}
