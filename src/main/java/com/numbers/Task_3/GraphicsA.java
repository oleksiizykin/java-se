package com.numbers.Task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by AZykin on 02.02.2017.
 */
public class GraphicsA {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Input width: ");
        String inputWidth = reader.readLine();
        int width = Integer.parseInt(inputWidth);

        System.out.print("Input height: ");
        String inputHeight = reader.readLine();
        int height = Integer.parseInt(inputHeight);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || j == width - 1 || i == 0 || i == height - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
