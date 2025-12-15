package org.example.animals;
import org.example.food.Food;
import org.example.exceptions.WrongFoodException;

public abstract class Animal {
    private String name;
    private boolean isSatiated = false;
    private AviarySize requiredAvairySize;

    public Animal(String name, AviarySize requiredAvairySize){
        this.name = name;
        this.requiredAvairySize=requiredAvairySize;
    }

    public String getName(){
        return name;
    }

    public boolean isSatiated(){
        return isSatiated;
    }

    protected void setSatiated(boolean satiated){
        isSatiated=satiated;
    }

    public AviarySize getRequiredAvairySize(){
        return requiredAvairySize;
    }
    public abstract void eat(Food food) throws WrongFoodException;

    public void printSatiety(){
        System.out.println(name+" сытость: " + (isSatiated?"сытый":"голодный"));
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return name.equals(animal.name);
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
