package com.Observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {
    List<String> vacancies = new ArrayList<>();

    List<Observer> subsribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subsribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subsribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subsribers) {
            observer.handleEvent(this.vacancies);
        }
    }
}
