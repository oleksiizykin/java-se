package com.Lesson_3.Task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by AZykin on 06.02.2017.
 */
public class CoordinatesInRectangle {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please, input coordinates of the upper left corner of rectangle (X,Y): ");
        String x1y1 = reader.readLine();
        while (isDigit(x1y1) || isTwoCoordinates(x1y1)){
                System.out.print("Please try again input coordinates of the upper left corner in format (X,Y): ");
                x1y1 = reader.readLine();
            }

        System.out.print("Please, input coordinates of the bottom right corner of rectangle (X,Y): ");
        String x2y2 = reader.readLine();
        while (isDigit(x2y2) || isTwoCoordinates(x2y2)){
            System.out.print("Please try again input coordinates of the bottom right corner in format (X,Y): ");
            x2y2 = reader.readLine();
        }

        System.out.print("Please, input coordinates of a point (X,Y): ");
        String x3y3 = reader.readLine();
        while (isDigit(x3y3) || isTwoCoordinates(x3y3)){
            System.out.print("Please try again input coordinates of a point (X,Y): ");
            x3y3 = reader.readLine();
        }

        coordinates(x1y1,x2y2,x3y3);

    }

    public static void coordinates (String x1y1, String x2y2, String x3y3) {

        String[] arrayX1Y1 = x1y1.split(",");
        String[] arrayX2Y2 = x2y2.split(",");
        String[] arrayX3Y3 = x3y3.split(",");

        double x1 = Double.parseDouble(arrayX1Y1[0]);
        double y1 = Double.parseDouble(arrayX1Y1[1]);
        double x2 = Double.parseDouble(arrayX2Y2[0]);
        double y2 = Double.parseDouble(arrayX2Y2[1]);
        double x3 = Double.parseDouble(arrayX3Y3[0]);
        double y3 = Double.parseDouble(arrayX3Y3[1]);

        if ((x1 >= x3 && x2 <= x3) && (y1 >= y3 && y2 <= y3) ){
            System.out.println("The point belongs to the rectangle");
        } else {
            System.out.println("The point does not belong to the rectangle");
        }

    }

    public static boolean isDigit(String s) {

        try {
            String[] list = s.split(",");
            Double.parseDouble(list[0]);
            Double.parseDouble(list[1]);
            return false;

        } catch (NumberFormatException e) {
            return true;
        }
    }
    public static boolean isTwoCoordinates(String s){
        String[] list = s.split(",");
        if (list.length < 2 || list.length > 2){
            return true;
        } else {
            return false;
        }
    }
}
