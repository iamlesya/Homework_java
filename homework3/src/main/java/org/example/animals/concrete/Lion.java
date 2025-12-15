package org.example.animals.concrete;

import org.example.animals.AviarySize;
import org.example.animals.Predator;
import org.example.animals.interfaces.Run;
import org.example.animals.interfaces.Voice;

public class Lion extends Predator implements Run, Voice{
    public Lion(String name){
        super(name, AviarySize.LARGE);
    }

    @Override
    public void run(){
        System.out.println(getName() + " бежит");
    }

    @Override
    public String voice(){
        return "рррр";
    }
}
