package com.numbers2;

import java.util.Arrays;

/**
 * Created by Azykin on 14.02.2017.
 */
public class Palindrome {
    public static void main(String[] args) {
        checkPalindrom(123456);
        checkPalindrom(123321);
        checkPalindrom(9239329);

    }
    public static void checkPalindrom(int n){

        char[] array1 = String.valueOf(n).toCharArray();
        char[] array2 = new char[array1.length/2];
        char[] array3 = new char[array1.length/2];
        int index;
        if (array1.length == 1){
            index = 1;
        } else {
            index = 0;
        }
        for(int i = 0; i < (array1.length-index)/2;i++){
            array2[i]= array1[i];
            array3[i] = array1[(array1.length-1) - i];
        }
        if (Arrays.equals(array2,array3)){
            System.out.println("This is palindrom");
        } else {
            System.out.println("This is not palindrom");
        }
    }
}
