package org.example.food;

public abstract class Food {
    private String name;
    private int nutritionalValue;

    public Food(String name, int nutritionalValue){
        this.name=name;
        this.nutritionalValue = nutritionalValue;
    }

    public String getName(){
        return name;
    }

    public int getNutritionalValue(){
        return nutritionalValue;
    }
}
