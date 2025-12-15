package org.example.animals.concrete;

import org.example.animals.Herbivore;
import org.example.animals.interfaces.Fly;
import org.example.animals.interfaces.Swim;
import org.example.animals.interfaces.Voice;

public class Duck extends Herbivore implements Fly, Swim, Voice{
    public Duck(String name){
        super(name);
    }

    @Override
    public void fly(){
        System.out.println(getName() + " летит");
    }

    @Override
    public void swim(){
        System.out.println(getName() + " плывет");
    }

    @Override
    public String voice(){
        return "Кря";
    }
}
