package com.zoo.Animals;

public class Fish extends Animal{

    public Fish(int id, int age, double weight, String color) {
        super(id, age, weight, color);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating alga");
    }

    @Override
    public String makeNoise() {
        return "....";
    }
}
