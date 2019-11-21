package com.numbers.Task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by AZykin on 02.02.2017.
 */
public class GraphicsB {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Input width: ");
        String s = reader.readLine();
        int size = Integer.parseInt(s);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || j == i || j == 0 || i == size - 1 || j == size - 1 || j == size - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
