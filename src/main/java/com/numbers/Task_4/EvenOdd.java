package com.numbers.Task_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by AZykin on 01.02.2017.
 */
public class EvenOdd {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, input a number: ");
        String s = reader.readLine();
        while (!s.equals("")) {

            while (isDigit(s)) {
                System.out.println("Please, input NUMBER: ");
                s = reader.readLine();
            }

            int number = Integer.parseInt(s);
            if (number % 2 == 0) {
                System.out.println("number is Even");
            } else {
                System.out.println("number is Odd");
            }
            s = reader.readLine();
        }
    }

    public static boolean isDigit(String s){
        try{
            Integer.parseInt(s);
            return false;
        } catch (NumberFormatException e){
            return true;
        }

    }
}
