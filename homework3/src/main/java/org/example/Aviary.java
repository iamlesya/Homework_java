package org.example;

import org.example.animals.Animal;
import org.example.animals.AviarySize;
import java.util.HashSet;
import java.util.Set;

public class Aviary<T extends Animal> {
    private Set<T> animals;
    private AviarySize size;

    public Aviary(AviarySize size){
        this.animals = new HashSet<>();
        this.size = size;
    }

    public boolean addAnimal(T animal){
        if (!isSizeSuitable(animal.getRequiredAvairySize())){
            System.out.println("Размер вольера " + size + " не подходит для " + animal.getName() + " (требуется: " + animal.getRequiredAvairySize() + ")");
        }

        return animals.add(animal);
    }

    public T findAnimal(String name){
        return animals.stream().filter(animal->animal.getName().equals(name))
                .findFirst().orElse(null);
    }

    private boolean isSizeSuitable(AviarySize requiredSize){
        int currentSizeOrdinal = size.ordinal();
        int requiredSizeOrdinal=requiredSize.ordinal();

        return currentSizeOrdinal>=requiredSizeOrdinal;
    }

    public void printAnimals(){
        System.out.println("Животные в вольере(" + size + "):");
        if (animals.isEmpty()){
            System.out.println();
        } else{
            animals.forEach(animal -> System.out.println(" - " + animal.getName() +
                    " (требуемый размер: " + animal.getRequiredAvairySize() + ")"));
        }
    }

    public AviarySize getSize(){
        return size;
    }

    public boolean isEmpty(){
        return animals.isEmpty();
    }

}
