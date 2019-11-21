package com.patternStrategy;

public class ConsoleGui implements Gui {

    @Override
    public void print(Object[] field) {
        printPart(field, 0, 3);
        printPart(field, 3, 6);
        printPart(field, 6, 9);
        System.out.println("\n");
    }

    private void printPart(Object[] field, int a, int b) {
        for (int i = a; i < b; i++) {
            if (field[i] == null) {
                System.out.print(" | " + " " + " | ");
            } else if (i >= a && i < b) {
                System.out.print(" | " + field[i] + " | ");
            }
        }
        System.out.println();
    }
}
