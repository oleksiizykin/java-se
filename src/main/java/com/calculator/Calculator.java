package com.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by AZykin on 27.01.2017.
 */
public class Calculator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please input first number:");

        double first = Integer.parseInt(reader.readLine());

        System.out.println("Please input second number:");

        double second = Integer.parseInt(reader.readLine());

        double sum = first + second;
        double difference = first - second;
        double multiplication = first*second;
        double division = first/second;

        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + difference);
        System.out.println("Multiplication is " + multiplication);
        System.out.println("Division is " + division);
    }
}
