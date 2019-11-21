package com.numbers.Task_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by AZykin on 01.02.2017.
 */
public class SimpleNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please, input a number: ");
        String s = reader.readLine();

        while (!s.equals("")) {
            while (isDigit(s)) {
                System.out.println("Please, input NUMBER: ");
                s = reader.readLine();
            }
            long number = Long.parseLong(s);

            boolean isSimple;

            if (number < 2) {
                isSimple = false;
            } else {
                isSimple = true;
            }
            for (long i = 2; i <= number / i; i++) {
                if ((number % i) == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.println("Число простое");
            } else {
                System.out.println("Число нe простое");
            }
            s = reader.readLine();
        }
    }

    public static boolean isDigit(String s){
        try{
            Long.parseLong(s);
            return false;
        } catch (NumberFormatException e){
            return true;
        }

    }
}
