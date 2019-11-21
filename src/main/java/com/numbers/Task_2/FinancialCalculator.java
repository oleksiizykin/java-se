package com.numbers.Task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by AZykin on 01.02.2017.
 */
public class FinancialCalculator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please, input amount, UAH: ");

        String sumOfDeposit = reader.readLine();
        while(isDigit(sumOfDeposit)){
            System.out.print("Please, input AMOUNT, UAH: ");
            sumOfDeposit = reader.readLine();
        }
        BigDecimal amount = new BigDecimal(sumOfDeposit);
        amount = amount.setScale(2, BigDecimal.ROUND_HALF_UP);


        System.out.print("Please, input percent p.a., %: ");

        String percentYear = reader.readLine();
        while(isDigit(percentYear)){
            System.out.print("Please, input NUMBER of percent: ");
            percentYear = reader.readLine();
        }
        BigDecimal percent = new BigDecimal(percentYear);
        percent = percent.setScale(4, BigDecimal.ROUND_HALF_UP);


        System.out.print("Please, input quantity of years for deposit: ");

        String quantityOfYears = reader.readLine();
        while(isInteger(quantityOfYears)){
            System.out.print("Please, input integer number of years: ");
            quantityOfYears = reader.readLine();
        }
        int years = Integer.parseInt(quantityOfYears);

        ArrayList<BigDecimal> listAmount = new ArrayList<BigDecimal>();
        ArrayList<BigDecimal> listCumulativePercents = new ArrayList<BigDecimal>();
        ArrayList<BigDecimal> listOfYearPercents = new ArrayList<BigDecimal>();

        BigDecimal amountCumulativeUAH = amount;
        BigDecimal cumulativePercents = new BigDecimal("0");
        BigDecimal yearPercents =  amount;
        BigDecimal additionalVariable =  amount;
        BigDecimal hundred = new BigDecimal("100");
        BigDecimal coefficient = percent.divide(hundred, 10, BigDecimal.ROUND_HALF_UP);

        for (int i = 0; i < years; i++){

            amountCumulativeUAH = amountCumulativeUAH.add(amountCumulativeUAH.multiply(coefficient));
            cumulativePercents = amountCumulativeUAH.subtract(amount);
            yearPercents = additionalVariable.multiply(coefficient);
            additionalVariable = additionalVariable.add(yearPercents);

            amountCumulativeUAH = amountCumulativeUAH.setScale(2, BigDecimal.ROUND_HALF_UP);
            cumulativePercents = cumulativePercents.setScale(2, BigDecimal.ROUND_HALF_UP);
            yearPercents = yearPercents.setScale(2, BigDecimal.ROUND_HALF_UP);

            listAmount.add((i),amountCumulativeUAH);
            listCumulativePercents.add((i),cumulativePercents);
            listOfYearPercents.add((i), yearPercents);
        }

        for (int i = 0; i < listAmount.size(); i++){
            System.out.print("Cumulative amount for " + (i+1) + " year is " + listAmount.get(i) + ". ");
            System.out.print("Percents in this year are " + listOfYearPercents.get(i) + ". ");
            System.out.println("Cumulative percents are " + listCumulativePercents.get(i));
        }

    }

    public static boolean isInteger(String s){
        try {
            Integer.parseInt(s);
            return false;
        } catch (NumberFormatException e){
            return true;
        }
    }
    public static boolean isDigit(String s){
        try {
            Double.parseDouble(s);
            return false;
        } catch (NumberFormatException e){
            return true;
        }
    }
}
