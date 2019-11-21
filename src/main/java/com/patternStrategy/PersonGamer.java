package com.patternStrategy;

import java.util.Scanner;

public class PersonGamer implements Turnable {
    private final String TURN = "X";
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Object setTurn(Object[] field) {
        System.out.println("Your turn: ");
        String turn = scanner.next();
        Position position = new Position();
        while (position.position(turn)) {
            System.out.println("Wrong name of position!");
            turn = scanner.next();
        }
        if (field[position.convertPosition(turn)] == null) {
            field[position.convertPosition(turn)] = TURN;
        } else {
            while (field[position.convertPosition(turn)] != null) {
                System.out.println("Cell is occupied");
                turn = scanner.next();
            }
            field[position.convertPosition(turn)] = TURN;
        }
        return field;
    }

    public String getTURN() {
        return TURN;
    }

    @Override
    public boolean nextTurn(boolean switcher) {
        if (switcher == true) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean isWin() {
        System.out.println("You win, congrats!");
        return false;
    }
}
