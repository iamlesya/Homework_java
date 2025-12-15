package org.example.animals;
import org.example.food.Food;
import org.example.food.Meat;

public abstract class Predator extends Animal{
    public Predator(String name){
            super(name);
    }

    @Override
    public void eat(Food food){
         if (food instanceof Meat){
             System.out.println(getName() + " ест " + food.getName());
             increaseSatiety(food.getNutritionalValue());
         } else {
             System.out.println(getName() + " не ест " + food.getName() + ". Это хищное животное");
         }
    }
}

