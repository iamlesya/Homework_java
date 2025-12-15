package org.example.animals.concrete;

import org.example.animals.Herbivore;
import org.example.animals.interfaces.Run;
import org.example.animals.interfaces.Voice;

public class Horse extends Herbivore implements Run, Voice{
    public Horse(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println(getName() + " бежит");
    }

    @Override
    public String voice(){
        return "Игого";
    }
}
