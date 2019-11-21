package com.numbers.Task_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by AZykin on 02.02.2017.
 */
public class MultiplicityOfNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, input number: ");

        String s = reader.readLine();
        while (!s.equals("")) {
            while (isDigit(s)) {
                System.out.println("Please, input NUMBER: ");
                s = reader.readLine();
            }
            long number = Long.parseLong(s);
            ArrayList<Long> list = new ArrayList<Long>();

            for (long i = 1; i < number; i++) {
                if (number % i == 0) {
                    list.add(i);
                }
            }
            System.out.println(list);
            s = reader.readLine();
        }
    }
    public static boolean isDigit(String s){
        try {
            Long.parseLong(s);
            return false;
        } catch (NumberFormatException e){
            return true;
        }
    }
}
