package com.Observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubsciber = new Subscriber("First");
        Observer secondSubsciber = new Subscriber("Second");

        jobSite.addObserver(firstSubsciber);
        jobSite.addObserver(secondSubsciber);

        jobSite.addVacancy("Third Java Position");

        jobSite.removeVacancy("First Java Position");
    }
}
