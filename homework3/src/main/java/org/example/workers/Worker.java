package org.example.workers;

import org.example.animals.Animal;
import org.example.animals.interfaces.Voice;
import org.example.food.Food;
import org.example.exceptions.WrongFoodException;

public class Worker {
    public void feed(Animal animal, Food food){
        try{
            animal.eat(food);
        } catch (WrongFoodException e){
            System.out.println("Ошика кормления " + e.getMessage());
        }
    }

    public void getVoice(Animal animal){
        if (animal instanceof org.example.animals.interfaces.Voice){
            String voice = ((org.example.animals.interfaces.Voice) animal).voice();
            System.out.println(animal.getName() + " говорит " + voice);
        }
    }
}
