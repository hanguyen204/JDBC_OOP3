package com.example.thread;

public class EvenNumbersThread extends Thread{
    @Override
    public void run() {
        for (int i = 2;i <= 10; i += 2){
            System.out.println(i);
            try {
                sleep(1000);
            }catch (InterruptedException e){
                e.getStackTrace();
            }
        }
    }
}
class Main_EvenThread{
    public static void main(String[] args) {
        EvenNumbersThread evenThread = new EvenNumbersThread();
        evenThread.start();

    }
}