package com.patternStrategy;

public interface Turnable {
    Object setTurn(Object[] field);
    boolean nextTurn(boolean switcher);
    boolean isWin();
    String getTURN();
}
