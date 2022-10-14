package com.odebar.multithreading.jfe;

import java.util.concurrent.TimeUnit;

public class JoinMain {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("start 1");
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end 1");
        }).start();
        JoinThread thread = new JoinThread();
        thread.start();
        try {
            thread.join(); // or join(100)
// or //TimeUnit.MILLISECONDS.timedJoin(thread0, 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end of " + Thread.currentThread().getName());
    }
}
