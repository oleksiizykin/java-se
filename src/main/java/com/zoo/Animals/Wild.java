package com.zoo.Animals;

public abstract class Wild extends Animal {
    boolean isPredator;

    public Wild(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    @Override
    public String makeNoise() {
        String s = "";
        if (isPredator == true) {
            s = super.makeNoise() + "I am a wild animal" + " and I am angry";
        } else {
            s = super.makeNoise() + "I am a wild animal";
        }
        return s;
    }
}

