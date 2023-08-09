package com.example.thread.chanle;

public class EvenThread extends Thread{
    @Override
    public void run(){
        for (int i = 0 ; i <= 10; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
            try {
                sleep(15);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
