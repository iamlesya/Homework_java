package org.example.animals;
import org.example.food.Food;

public class Animal {
    private String name;
    private int satiety;

    public Animal(String name){
        this.name = name;
        this.satiety = 5;
    }

    public String getName(){
        return name;
    }

    public int getSatiety(){
        return satiety;
    }

    protected void setSatiety(int satiety){
        this.satiety=Math.min(Math.max(satiety,0),10);
    }

    public void eat(Food food){

    }

    public boolean isHungry(){
        return satiety<3;
    }

    public void increaseSatiety(int value){
        setSatiety(satiety+value);
    }


    public void printSatiety(){
        System.out.println(name+" : сытость = " + satiety + "/10");
    }
}
