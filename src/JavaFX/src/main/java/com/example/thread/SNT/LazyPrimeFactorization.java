package com.example.thread.SNT;

import java.util.Scanner;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 2) {
            for (int i = 2; i <= n; i++) {
                if (i == 2 ){
                    System.out.println("số nguyên tố theo cách không tối ưu" + i);
                }
                if (i % 2 != 0 && i % i == 0){
                    System.out.println("số nguyên tố theo cách không tối ưu" + i);
                }
            }
        }else {
            System.out.println("Nhập số lớn hơn 2 hoặc bằng 2");
        }
    }
}
