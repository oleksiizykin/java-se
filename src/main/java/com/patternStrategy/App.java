package com.patternStrategy;

public class App {
    public static void main(String[] args) {
        Guide guide = new Guide();
        guide.print();
        LogicOfGame game = new LogicOfGame();
        game.startGame();
    }
}
