package com.zoo.Persons;

import com.zoo.Animals.Domestic;
import com.zoo.Animals.Animal;
import com.zoo.CoolList;
import com.zoo.Interfaces.Observer;

public abstract class Person implements Observer {
    String name;
    String fullClassName = getClass().getName();
    String simpleClassName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void eventAnimal(CoolList<Animal> animals) {
        System.out.println(simpleClassName + "\n" + "Dear " + name + " in " + animals.getName() + " some changes: " + animals +
                "\n======================================================");
    }

    @Override
    public void eventDomestic(CoolList<Domestic> animals) {
        System.out.println(simpleClassName + "\n" + "Dear " + name + " in " + animals.getName() + " some changes: " + animals +
                "\n======================================================");
    }
}
