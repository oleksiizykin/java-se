package com.zoo.Animals;

public class Hamster extends Domestic{

    public Hamster(int id, int age, double weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }

    @Override
    public void eat() {
        System.out.println("I am eating hamster food");
    }


}
