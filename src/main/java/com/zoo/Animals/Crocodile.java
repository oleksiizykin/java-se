package com.zoo.Animals;

public class Crocodile extends Wild {
    public Crocodile(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void eat() {
        System.out.println("I am eating crocodile food");
    }
}
