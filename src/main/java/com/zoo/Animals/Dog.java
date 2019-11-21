package com.zoo.Animals;

public class Dog extends Domestic{

    public Dog(int id, int age, double weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }

    @Override
    public String makeNoise() {
        return super.makeNoise() + ", Woof";
    }

    @Override
    public void eat() {
        System.out.println("I am eating dog food");
    }

}
