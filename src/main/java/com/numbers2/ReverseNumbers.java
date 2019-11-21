package com.numbers2;

/**
 * Created by Azykin on 14.02.2017.
 */
public class ReverseNumbers {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(reverse(n));
    }

    public static int reverse(int n) {

        char[] array = String.valueOf(n).toCharArray();
        char[] array2 = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[(array.length - 1) - i] = array[i];
        }
        n = Integer.parseInt(String.valueOf(array2));
        return n;
    }
}
