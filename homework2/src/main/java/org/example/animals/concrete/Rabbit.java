package org.example.animals.concrete;

import org.example.animals.Herbivore;
import org.example.animals.interfaces.Run;
import org.example.animals.interfaces.Voice;

public class Rabbit extends Herbivore implements Run, Voice{
    public Rabbit(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println(getName() + " бежит");
    }

    @Override
    public String voice(){
        return "Крик зайца";
    }
}
