package com.zoo;

import com.zoo.Animals.Animal;
import com.zoo.Animals.Domestic;
import com.zoo.Interfaces.Observable;
import com.zoo.Interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements Observable {
    private CoolList<Animal> hungryList = new CoolList<>("HungryList");
    private CoolList<Animal> illList = new CoolList<>("IllList");
    private CoolList<Animal> haircutList = new CoolList<>("HaircutList");
    private CoolList<Domestic> combList = new CoolList<>("CombList");
    private List<Observer> observerHungryList = new ArrayList<>();
    private List<Observer> observerIllList = new ArrayList<>();
    private List<Observer> observerHaircutList = new ArrayList<>();
    private List<Observer> observerCombList = new ArrayList<>();

    public void addToHungryList(Animal animal) {
        hungryList.add(animal);
        notifyObserversHungryList();
    }

    public void addToIllList(Animal animal) {
        illList.add(animal);
        notifyObserversIllList();
    }

    public void addToHaircutList(Animal animal) {
        haircutList.add(animal);
        notifyObserversHaircutList();
    }

    public void addToCombList(Domestic animal) {
        combList.add(animal);
        notifyObserversCombList();
    }

    public void removeFromHungryList(Animal animal) {
        hungryList.remove(animal);
        notifyObserversHungryList();
    }

    public void removeFromIllList(Animal animal) {
        illList.remove(animal);
        notifyObserversIllList();
    }

    public void removeFromHaircutList(Animal animal) {
        haircutList.remove(animal);
        notifyObserversHaircutList();
    }

    @Override
    public void addObserverToHungryList(Observer observer) {
        observerHungryList.add(observer);
    }

    @Override
    public void addObserverToIllList(Observer observer) {
        observerIllList.add(observer);
    }

    @Override
    public void addObserverToHaircutList(Observer observer) {
        observerHaircutList.add(observer);
    }

    @Override
    public void addObserverToCombList(Observer observer) {
        observerCombList.add(observer);
    }

    @Override
    public void removeObserverFromHungryList(Observer observer) {
        observerHungryList.remove(observer);
    }

    @Override
    public void removeObserverFromIllList(Observer observer) {
        observerIllList.remove(observer);
    }

    @Override
    public void removeObserverFromHaircutList(Observer observer) {
        observerHaircutList.remove(observer);
    }

    @Override
    public void removeObserverToCombList(Observer observer) {
        observerCombList.remove(observer);
    }

    @Override
    public void notifyObserversHungryList() {
        for (Observer observers : observerHungryList) {
            observers.eventAnimal(hungryList);
        }
    }

    @Override
    public void notifyObserversIllList() {
        for (Observer observers : observerIllList) {
            observers.eventAnimal(illList);
        }
    }

    @Override
    public void notifyObserversHaircutList() {
        for (Observer observers : observerHaircutList) {
            observers.eventAnimal(haircutList);
        }
    }

    @Override
    public void notifyObserversCombList() {
        for (Observer observers : observerCombList) {
            observers.eventDomestic(combList);
        }
    }
}
