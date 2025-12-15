package org.example.animals.concrete;
import org.example.animals.AviarySize;
import org.example.animals.Predator;
import org.example.animals.interfaces.Fly;
import org.example.animals.interfaces.Voice;

public class Eagle extends Predator implements Fly, Voice{
    public Eagle(String name){
        super(name, AviarySize.MEDIUM);
    }

    @Override
    public void fly(){
        System.out.println(getName() + " летит");
    }

    @Override
    public String voice(){
        return "Крик орла";
    }
}
