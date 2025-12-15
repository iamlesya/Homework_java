package org.example.animals.concrete;

import org.example.animals.AviarySize;
import org.example.animals.Predator;
import org.example.animals.interfaces.Swim;

public class Fish extends Predator implements Swim{
    public Fish(String name){
        super(name, AviarySize.VERY_SMALL);
    }

    @Override
    public void swim(){
        System.out.println(getName() + " плывет");
    }
}
