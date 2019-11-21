package com.patternStrategy;

public class LogicOfGame {
    private Object[] field = new Object[9];
    private Gui gui;
    private Turnable behaviour1;
    private Turnable behaviour2;
    private boolean turnNext = false;

    public void setBehaviour1(Turnable behaviour1) {
        this.behaviour1 = behaviour1;
    }

    public void setBehaviour2(Turnable behaviour2) {
        this.behaviour2 = behaviour2;
    }

    public void print() {
        gui.print(field);
    }

    public void setGui(Gui gui) {
        this.gui = gui;
    }

    private void makeTurn() {
        Object[] table = field;
        while (checkEndGame()) {
            print();
            if (turnNext == true) {
                behaviour1.setTurn(field);
                turnNext = behaviour1.nextTurn(turnNext);
            } else {
                behaviour2.setTurn(field);
                turnNext = behaviour2.nextTurn(turnNext);
            }
        }
    }

    private boolean checkReplays(Object[] table) {
        boolean check = false;
        for (int i = 0; i < table.length; i++) {
            if (field[i] == null && table[i] != null) {
                check = true;
            } else {
                check = false;
            }
        }
        return check;
    }

    private boolean checkEndGame() {
        if (checkWin(behaviour1.getTURN()) || checkWin(behaviour2.getTURN())) {
            print();
            if (checkWin(behaviour1.getTURN())) {
                behaviour1.isWin();
            } else {
                behaviour2.isWin();
            }
            return false;
        } else {
            return true;
        }
    }

    private boolean checkWin(String position) {
        boolean topRow = field[0] == position && field[1] == position && field[2] == position;
        boolean centerRow = field[0] == position && field[1] == position && field[2] == position;
        boolean bottomRow = field[3] == position && field[5] == position && field[5] == position;
        boolean leftDiagonal = field[0] == position && field[4] == position && field[8] == position;
        boolean rightDiagonal = field[2] == position && field[4] == position && field[6] == position;
        boolean leftColumn = field[0] == position && field[3] == position && field[6] == position;
        boolean centerColumn = field[1] == position && field[4] == position && field[7] == position;
        boolean rightColumn = field[2] == position && field[6] == position && field[8] == position;

        boolean win = topRow || centerRow || bottomRow || leftDiagonal || rightDiagonal || leftColumn || centerColumn || rightColumn;
        return win;
    }

    public void startGame() {
        LogicOfGame game = new LogicOfGame();
        Gui newGui = new ConsoleGui();
        game.setGui(newGui);
        Turnable gamer1 = new PersonGamer();
        Turnable gamer2 = new MachineGamer();
        game.setBehaviour2(gamer1);
        game.setBehaviour1(gamer2);
        game.makeTurn();
    }
}
