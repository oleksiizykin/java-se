package com.Lesson_3.Task_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciNumbersC {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input number in Fibonacci sequency: ");

        int n = Integer.parseInt(reader.readLine());

        long a = 1;
        long b = 1;
        long amount = 0;

        if (n == 1) {
            amount = 1;
        } else if (n == 2) {
            amount = 1;
        } else {
            for (long i = 0; i < n - 2; i++) {
                amount = a + b;
                a = b;
                b = amount;
            }
        }
        System.out.println(amount);
    }
}
