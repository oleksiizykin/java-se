package com.zoo.Persons;

import com.zoo.Animals.Animal;

public class Feeder extends Person {

    public Feeder(String name) {
        super(name);
    }
    public void feed(Animal animal){
        animal.setIsHungry(false);
    }
}
