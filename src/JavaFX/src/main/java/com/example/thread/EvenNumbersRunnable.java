package com.example.thread;

public class EvenNumbersRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 2;i <= 10; i += 2){
            System.out.println(i);
        }
    }
}
class Main_EvenRunnable{
    public static void main(String[] args) throws InterruptedException {
        EvenNumbersThread evenNumbersThread = new EvenNumbersThread();
        Thread thread = new Thread(evenNumbersThread);
        thread.sleep(2000);
        thread.start();
    }
}
