package com.example.thread;

public class CAR_Main {
    public static int DISTANCE = 100;
    public static int STEP = 2;

    public static void main(String[] args) {
        Car car1 = new Car("CarA");
        Car car2 = new Car("CarB");
        Car car3 = new Car("CarC");

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
