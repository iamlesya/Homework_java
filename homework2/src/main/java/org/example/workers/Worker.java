package org.example.workers;

import org.example.animals.Animal;
import org.example.animals.interfaces.Voice;
import org.example.food.Food;

public class Worker {
    public void feed(Animal animal, Food food){
        System.out.println("Работник кормит "+animal.getName());
        animal.eat(food);
        animal.printSatiety();
    }

    public void getVoice(Voice voicedAnimal){
        System.out.println("Животное говорит: "+voicedAnimal.voice());
    }
}
