package com.example.thread.SNT;

import java.util.Scanner;

public class main_prime {
    public static void main(String[] args) {
        LazyPrimeFactorization lpf = new LazyPrimeFactorization();
        OptimizedPrimeFactorization opf = new OptimizedPrimeFactorization();
        Thread runLpf = new Thread(lpf);
        Thread runOpf = new Thread(opf);

        runLpf.start();
        runOpf.start();
    }
}
