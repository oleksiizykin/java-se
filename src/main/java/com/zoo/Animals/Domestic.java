package com.zoo.Animals;

public abstract class Domestic extends Animal {
    private String name;
    private boolean isVactinated;

    public Domestic(int id, int age, double weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVactinated = isVactinated;
    }

    public String getName() {
        return name;
    }

    public boolean isVactinated() {
        return isVactinated;
    }

    public void setVactinated(boolean vactinated) {
        isVactinated = vactinated;
    }

    @Override
    public String makeNoise() {
        return super.makeNoise() + "my name is " + getName();
    }

    public void comb(){
        message = "Time for comb";
    }

}
