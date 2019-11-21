package com.zoo.Animals;

public class GuideDog extends Dog{
    private boolean isTrained;

    public GuideDog(int id, int age, double weight, String color, String name, boolean isVactinated, boolean isTrained) {
        super(id, age, weight, color, name, isVactinated);
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }
    public void takeHome(){
    }

    @Override
    public String makeNoise() {
        return super.makeNoise() + ", I can take you home";
    }

}
