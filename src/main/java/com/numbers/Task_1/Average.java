package com.numbers.Task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by AZykin on 31.01.2017.
 */
public class Average {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Double> list = new ArrayList<Double>();

        System.out.println("Please input numbers: ");

        while (true) {
            String s = reader.readLine();
            if (s.equals("")) {
                break;
            } else {
                while(isDigit(s)){
                    System.out.print("Please input NUMBERS: ");
                    s = reader.readLine();
                }
                double value = Double.parseDouble(s);
                list.add(value);
            }
        }

        double average = 0;
        if (list.size() > 0){
            double sum = 0;

            for (int i = 0; i < list.size(); i++){

                sum += list.get(i);
            }
            average = sum / list.size();
        }
        System.out.println(average);
    }

    public static boolean isDigit(String s){
        try{
            Double.parseDouble(s);
            return false;
        } catch (NumberFormatException e){
            return true;
        }
    }

}
