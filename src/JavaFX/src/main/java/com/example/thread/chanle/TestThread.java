package com.example.thread.chanle;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OldThread oldThread = new OldThread();
        EvenThread evenThread = new EvenThread();

        Thread thread1 = new Thread(oldThread);
        Thread thread2 = new Thread(evenThread);

        thread1.start();
        thread1.join();
        thread2.start();
    }
}
