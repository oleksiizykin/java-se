package com.numbers2;

public class DecToBinary {
    public static void main(String[] args) {
        String binary = fromDecToBinary(121);
        System.out.println(binary);
    }

    private static String fromDecToBinary(int dec) {
        Integer binaryInt;
        String binary = "";
        while (dec > 0) {
            binaryInt = dec % 2;
            dec = dec / 2;
            binary = binaryInt.toString() + binary;
        }
        return binary;
    }
}
