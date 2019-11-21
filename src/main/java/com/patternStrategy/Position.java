package com.patternStrategy;

public class Position {
    private String lt = "lefttop";
    private String t = "top";
    private String rt = "righttop";
    private String l = "left";
    private String c = "center";
    private String r = "right";
    private String lb = "leftbottom";
    private String b = "bottom";
    private String rb = "rightbottom";

    public boolean position(String position) {
        if (position.equals(lt) || position.equals(t) || position.equals(rt) ||
                position.equals(l) || position.equals(c) || position.equals(r) ||
                position.equals(lb) || position.equals(b) || position.equals(rb)) {
            return false;
        } else {
            return true;
        }
    }

    public int convertPosition(String position){
        int arrayPosition = 0;
        if (position.equals("lefttop")) {
            arrayPosition = 0;
        } else if (position.equals("top")) {
            arrayPosition = 1;
        } else if (position.equals("righttop")) {
            arrayPosition = 2;
        } else if (position.equals("left")) {
            arrayPosition = 3;
        } else if (position.equals("center")) {
            arrayPosition = 4;
        } else if (position.equals("right")) {
            arrayPosition = 5;
        } else if (position.equals("leftbottom")) {
            arrayPosition = 6;
        } else if (position.equals("bottom")) {
            arrayPosition = 7;
        } else if (position.equals("rightbottom")) {
            arrayPosition = 8;
        }
        return arrayPosition;
    }
}
