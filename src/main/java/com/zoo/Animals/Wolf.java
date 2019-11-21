package com.zoo.Animals;

public class Wolf extends Wild {

    public Wolf(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void eat() {
        System.out.println("I am eating wolf wood");
    }

}
