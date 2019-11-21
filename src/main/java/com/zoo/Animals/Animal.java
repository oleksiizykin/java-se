package com.zoo.Animals;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    private int id;
    private int age;
    private double weight;
    private String color;
    protected String message;
    protected boolean isHungry = false;
    protected boolean isIll = false;
    protected boolean isHaircut = false;

    public Animal(int id, int age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String makeNoise() {
        return "Hello, ";
    }

    public abstract void eat();

    public void setIsHungry(boolean hungry) {
        this.isHungry = hungry;
    }

    public void setIsIll(boolean ill) {
        this.isIll = ill;
    }

    public void setIsHaircut(boolean haircut) {
        this.isHaircut = haircut;
    }

    public boolean getIsHungry() {
        return isHungry;
    }

    public boolean getIsIll() {
        return isIll;
    }

    public boolean getIsHaircut() {
        return isHaircut;
    }

    public void hungry() {
        message = "I'm hungry";
        isHungry = true;
    }

    public void ill() {
        message = "I'm feeling badly, please help";
        isIll = true;
    }

    public void haircut() {
        message = "Time for haircut";
        isHaircut = true;
    }

    @Override
    public String toString() {
        String fullClassName = getClass().getName();
        String simpleClassName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
        return "{" +
                "id=" + id + ", " +
                simpleClassName + ", " + message +
                '}';
    }

    public String typeOfAnimal() {
        String fullClassName = getClass().getName();
        String simpleClassName = fullClassName.substring(fullClassName.lastIndexOf('.') + 1);
        return simpleClassName;
    }
}
