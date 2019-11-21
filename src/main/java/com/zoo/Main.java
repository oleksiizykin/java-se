package com.zoo;


import com.zoo.Animals.*;
import com.zoo.Persons.*;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat(1, 5, 3, "black", "Kitty", true);
        Crocodile crocodile = new Crocodile(2, 20, 150, "darkgreen", true);
        Dog dog = new Dog(3, 7, 40, "white", "Spike", true);
        Fish fish = new Fish(4, 1, 0.8, "grey");
        Giraffe giraffe = new Giraffe(5, 4, 300, "yellowbrown", false);
        GuideDog guideDog = new GuideDog(6, 3, 50, "black", "Spike2", true, true);
        Hamster hamster = new Hamster(7, 1, 0.5, "brown", "Bob", false);
        Lion lion = new Lion(8, 7, 200, "yellow", true);
        Wolf wolf = new Wolf(9, 5, 150, "grey", true);

//        System.out.println(cat.makeNoise());
//        System.out.println(crocodile.makeNoise());
//        System.out.println(dog.makeNoise());
//        System.out.println(fish.makeNoise());
//        System.out.println(giraffe.makeNoise());
//        System.out.println(guideDog.makeNoise());
//        System.out.println(hamster.makeNoise());
//        System.out.println(lion.makeNoise());
//        System.out.println(wolf.makeNoise());

        Zoo zoo = new Zoo();
        Person director = new Director("Jack");
        Person veterinary = new Veterinary("Bob");
        Person feeder;
        feeder = new Feeder("Peter");
        Person hairdresser = new Hairdresser("Jake");

        zoo.addObserverToHungryList(director);
        zoo.addObserverToIllList(director);
        zoo.addObserverToHaircutList(director);
        zoo.addObserverToCombList(director);

        zoo.addObserverToHungryList(veterinary);
        zoo.addObserverToIllList(veterinary);

        zoo.addObserverToHungryList(feeder);

        zoo.addObserverToHaircutList(hairdresser);
        zoo.addObserverToCombList(hairdresser);

        cat.hungry();
        lion.hungry();
        wolf.hungry();
        zoo.addToHungryList(lion);
        zoo.addToHungryList(cat);
        zoo.addToHungryList(wolf);


        giraffe.ill();
        crocodile.ill();
        zoo.addToIllList(giraffe);
        zoo.addToIllList(crocodile);

        cat.haircut();
        dog.haircut();
        zoo.addToHaircutList(cat);
        zoo.addToHaircutList(dog);

        cat.comb();
        guideDog.comb();
        zoo.addToCombList(cat);
        zoo.addToCombList(guideDog);

    }
}
