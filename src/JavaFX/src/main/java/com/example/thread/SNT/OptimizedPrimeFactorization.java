package com.example.thread.SNT;

import java.util.Scanner;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 2){
            for (int i = 2; i <= n;i++){
                boolean isPrime = true;
                for (int j = 2; j < i; j++){
                    if (i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.println("số nguyên tố tìm theo cách tối ưu là " + i);
                }
            }
        }
    }
}
