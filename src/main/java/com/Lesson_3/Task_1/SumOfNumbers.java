package com.Lesson_3.Task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by AZykin on 06.02.2017.
 */
public class SumOfNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(sum(reader.readLine()));
    }

    public static int sum (String sum) throws IOException {

        char[] chArray = sum.toCharArray();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (char i : chArray) {
            int n = Integer.parseInt(Character.toString(i));
            list.add(n);
        }
        int total = 0;
        for (double i : list){
            total += i;
        }
        return total;
    }
}
