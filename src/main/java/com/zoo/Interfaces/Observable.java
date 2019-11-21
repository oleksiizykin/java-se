package com.zoo.Interfaces;

public interface Observable {
    void addObserverToHungryList(Observer observer);
    void addObserverToIllList(Observer observer);
    void addObserverToHaircutList(Observer observer);
    void addObserverToCombList(Observer observer);
    void removeObserverFromHungryList(Observer observer);
    void removeObserverFromIllList(Observer observer);
    void removeObserverFromHaircutList(Observer observer);
    void removeObserverToCombList(Observer observer);
    void notifyObserversHungryList();
    void notifyObserversIllList();
    void notifyObserversHaircutList();
    void notifyObserversCombList();
}
