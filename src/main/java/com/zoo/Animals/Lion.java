package com.zoo.Animals;

public class Lion extends Wild {

    public Lion(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void eat() {
        System.out.println("I am eating lion food");
    }

}
