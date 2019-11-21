package com.patternStrategy;

public class Guide {
    private Position position = new Position();
    private Gui gui = new ConsoleGui();
    private Object[] field = new Object[9];

    public void print(){
        System.out.println("Commands: ");
        field[0] = "lefttop";
        field[1] = "top";
        field[2] = "righttop";
        field[3] = "left";
        field[4] = "center";
        field[5] = "right";
        field[6] = "leftbottom";
        field[7] = "bottom";
        field[8] = "rightbottom";
        gui.print(field);
    }

}
