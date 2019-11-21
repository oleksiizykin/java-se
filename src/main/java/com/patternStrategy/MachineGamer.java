package com.patternStrategy;

import java.util.ArrayList;
import java.util.Random;

public class MachineGamer implements Turnable {
    private final String TURN = "0";

    @Override
    public Object setTurn(Object[] field) {
        field[randomTurn(field)] = TURN;
        return field;
    }

    public String getTURN() {
        return TURN;
    }

    @Override
    public boolean nextTurn(boolean switcher) {
        if(switcher == true){
            return false;
        } else {
            return true;
        }
    }

    private int randomTurn(Object[] field) {
        ArrayList<Integer> freeCells = new ArrayList();
        for (int i = 0; i < field.length; i++) {
            if (field[i] == null) {
                freeCells.add(i);
            }
        }
        int newPlace = new Random().nextInt(freeCells.size());
        return freeCells.get(newPlace);
    }

    @Override
    public boolean isWin() {
        System.out.println("Machine win!");
        return false;
    }
}
