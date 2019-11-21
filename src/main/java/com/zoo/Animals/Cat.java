package com.zoo.Animals;

public class Cat extends Domestic {

    public Cat(int id, int age, double weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }

    @Override
    public void eat() {
        System.out.println("I am eating cat food");
    }

    @Override
    public String makeNoise() {
        return super.makeNoise() + ", Meow";
    }


}
