package com.odebar.multithreading.concurrent.semaphore;

import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.stream.Stream;

public class CashBoxRunner {
    public static void main(String[] args) throws InterruptedException {
        //    BlockingQueue<CashBox> cashBoxes = new ArrayBlockingQueue<>(2, true,List.of(new CashBox(), new CashBox()));
        Semaphore cashBoxes = new Semaphore(2);
        List<Thread> threads = Stream.of(
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes),
                        new BuyerThread(cashBoxes)
                )
                .map(Thread::new)
                .peek(Thread::start).toList();

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
