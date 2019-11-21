package com.zoo.Interfaces;

import com.zoo.Animals.Domestic;
import com.zoo.Animals.Animal;
import com.zoo.CoolList;

public interface Observer {
    void eventAnimal(CoolList<Animal> animals);
    void eventDomestic(CoolList<Domestic> animals);
}
