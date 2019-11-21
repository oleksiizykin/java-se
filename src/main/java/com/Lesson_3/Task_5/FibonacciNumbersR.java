package com.Lesson_3.Task_5;

/**
 * Created by AZykin
 */
public class FibonacciNumbersR {
    public static void main(String[] args) {
    long n = 10;
        System.out.println(fibonacci(n));
    }
    public static long fibonacci(long n){
        if((n == 1) || (n == 2)){
            return 1;
        } else {
         return   fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
