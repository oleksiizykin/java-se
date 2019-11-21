package com.numbers2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class WeightParsing {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input a NUMBER: ");
        String s = reader.readLine();
        while (isDigit(s)) {
            System.out.print("Please, input a NUMBER: ");
            s = reader.readLine();
        }

        System.out.print("Input a unit of measure (kg/gr): ");
        String unit = reader.readLine();
        while (isUnit(unit)) {
            System.out.print("Please, input KG or GR: ");
            unit = reader.readLine();
        }

        input(s, unit);
    }

    public static void input(String s, String unit) {

        BigDecimal n = new BigDecimal(s);
        BigDecimal coefficient = new BigDecimal(0.000001);
        BigDecimal coefRecalc = new BigDecimal(1000);
        if (unit.equals("gr")) {
            coefficient = coefficient;
        }
        if (unit.equals("kg")) {
            coefficient = new BigDecimal(0.001);
        }
        BigDecimal mtOrKg = n.multiply(coefficient);
        System.out.println(mtOrKg);

        mtOrKg = mtOrKg.setScale(9, BigDecimal.ROUND_HALF_UP);
        BigDecimal mtRounded = mtOrKg.setScale(0, BigDecimal.ROUND_DOWN);

        BigDecimal kg = (mtOrKg.subtract(mtRounded)).multiply(coefRecalc);
        BigDecimal kgRounded = kg.setScale(0, BigDecimal.ROUND_DOWN);
        System.out.println(kg);

        BigDecimal gr = (kg.subtract(kgRounded)).multiply(coefRecalc);
        BigDecimal grRounded = gr.setScale(0, BigDecimal.ROUND_DOWN);

        BigDecimal mg = (gr.subtract(grRounded)).multiply(coefRecalc);
        BigDecimal mgRounded = mg.setScale(0, BigDecimal.ROUND_HALF_UP);

        if (isNull(mtRounded)) {
            System.out.print(mtRounded + " tons ");
        }
        if (isNull(kgRounded)) {
            System.out.print(kgRounded + " kilograms ");
        }
        if (isNull(grRounded)) {
            System.out.print(grRounded + " grams ");
        }
        if (isNull(mgRounded)) {
            System.out.print(mgRounded + " milligrams");
        }
    }


    public static boolean isNull(BigDecimal n) {
        BigDecimal n1 = new BigDecimal(0);
        if (n.equals(n1)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isDigit(String s) {
        try {
            Double.parseDouble(s);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
    public static boolean isUnit(String s){
        if (s.equals("kg") || s.equals("gr")){
            return false;
        } else {
            return true;
        }
    }
}
