package org.example.animals;
import org.example.food.Food;
import org.example.food.Grass;

public abstract class Herbivore extends Animal{
    public Herbivore(String name){
            super(name);
    }

    @Override
    public void eat(Food food){
         if (food instanceof Grass){
             System.out.println(getName() + " ест " + food.getName());
             increaseSatiety(food.getNutritionalValue());
         } else {
             System.out.println(getName() + " не ест " + food.getName() + ". Это травоядное животное");
         }
    }
}

