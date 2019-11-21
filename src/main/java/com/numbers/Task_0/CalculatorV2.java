package com.numbers.Task_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by AZykin on 31.01.2017.
 */
public class CalculatorV2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Please input first number: ");
        String firstValue = reader.readLine();
        while (isDigit(firstValue)) {
            System.out.print("Please input a NUMBER one: ");
            firstValue = reader.readLine();
        }
        double firstNumber = Double.parseDouble(firstValue);


        System.out.print("Please input action (+-*/): ");
        String inputAction = reader.readLine();
        while(!isAction(inputAction)){
            System.out.print("Please input action (+-*/): ");
            inputAction = reader.readLine();
        }
        char action = inputAction.charAt(0);


        System.out.print("Please input second number: ");
        String secondValue = reader.readLine();
        while (isDigit(secondValue)) {
            System.out.print("Please input a NUMBER two: ");
            secondValue = reader.readLine();
        }
        double secondNumber = Double.parseDouble(secondValue);


        if (action == '+') {
            double sum = firstNumber + secondNumber;
            System.out.print("Sum is " + sum);
        } else if (action == '-') {
            double difference = firstNumber - secondNumber;
            System.out.println("Difference is " + difference);
        } else if (action == '*') {
            double multiplication = firstNumber * secondNumber;
            System.out.println("Multiplication is " + multiplication);
        } else if (action == '/') {
            while(isZero(secondValue)) {
                System.out.print("Division by zero is unacceptable, please try again: ");
                secondValue = reader.readLine();
            }
            secondNumber = Double.parseDouble(secondValue);
            double division = firstNumber / secondNumber;
            System.out.println("Division is " + division);
        }
    }

        public static boolean isDigit(String s) {
            try{
                Double.parseDouble(s);
                return false;
            } catch (NumberFormatException e){
                return true;
            }
        }
        public static boolean isAction (String s){

            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                return true;
            }
            return  false;
        }
        public static boolean isZero (String s) {
            double value = Double.parseDouble(s);
            if (value == 0) {
                return true;
            }
            return false;
        }
}