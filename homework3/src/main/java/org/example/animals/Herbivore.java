package org.example.animals;

import org.example.food.Food;
import org.example.food.Grass;
import org.example.exceptions.WrongFoodException;

public abstract class Herbivore extends Animal{
    public Herbivore(String name, AviarySize requiredAviarySize){
        super(name, requiredAviarySize);
    }

    @Override
    public void eat(Food food) throws WrongFoodException{
         if (!(food instanceof Grass)){
             throw new WrongFoodException(getName() + " не ест " + food.getName());
         }
         System.out.println(getName() + " ест " + food.getName());
         setSatiated(true);
    }
}

