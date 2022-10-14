package com.odebar.multithreading.jfe;

public class BaseThreadMain {
    public static void main(String[] args) {
        WalkThread walk = new WalkThread(); // new thread object
        Thread talk = new Thread(new TalkThread()); // new thread object
        talk.start(); // start of thread
        walk.start(); // start of thread
// TalkThread t = new TalkThread(); just an object, not a thread
// t.run(); or talk.run();
// method will execute, but thread will not start!
    }
}
