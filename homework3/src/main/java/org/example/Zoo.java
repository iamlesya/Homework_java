package org.example;

import org.example.animals.Herbivore;
import org.example.animals.Predator;
import org.example.animals.concrete.*;
import org.example.food.*;
import org.example.animals.interfaces.Swim;
import org.example.workers.Worker;
import org.example.animals.AviarySize;

public class Zoo {
    public static void main(String[] args) {
        Duck duck = new Duck("Утка");
        Eagle eagle = new Eagle("Орел");
        Fish fish = new Fish("Рыба");
        Horse horse = new Horse("Лошадь");
        Lion lion = new Lion("Лев");
        Rabbit rabbit = new Rabbit("Заяц");

        Grass grass = new Grass();
        Meat meat = new Meat();

        Worker worker = new Worker();

        Aviary<Predator> predatorAviary = new Aviary<>(AviarySize.LARGE);
        Aviary<Herbivore> herbivoreAviary = new Aviary<>(AviarySize.LARGE);

        predatorAviary.addAnimal(lion);
        predatorAviary.addAnimal(eagle);
        predatorAviary.addAnimal(fish);

        herbivoreAviary.addAnimal(duck);
        herbivoreAviary.addAnimal(horse);
        herbivoreAviary.addAnimal(rabbit);

        predatorAviary.printAnimals();
        System.out.println();
        herbivoreAviary.printAnimals();

        System.out.println("Лев в вольере хищников? " + (predatorAviary.findAnimal("Лев") != null ? " да " : " нет "));
        System.out.println("Тигр в вольере хищников? " + (predatorAviary.findAnimal("Тигр") != null ? " да " : " нет "));

        Aviary<Herbivore> smallAviary = new Aviary<>(AviarySize.SMALL);
        System.out.println("Попробуем добавить лошать(LARGE) в вольер(SMALL)");
        smallAviary.addAnimal(horse);
        System.out.println("Попробуем добавить зайца(SMALL) в вольер(SMALL)");
        smallAviary.addAnimal(rabbit);

        System.out.println("КОРМЛЕНИЕ");
        worker.feed(duck, grass);
        worker.feed(duck, meat);
        System.out.println();

        worker.feed(lion, grass);
        worker.feed(lion, meat);
        System.out.println();

        worker.feed(fish, grass);
        worker.feed(fish, meat);
        System.out.println();

        System.out.println("ГОЛОСА");
        worker.getVoice(duck);
        worker.getVoice(eagle);
        worker.getVoice(horse);
        worker.getVoice(lion);
        worker.getVoice(rabbit);
        System.out.println();

        System.out.println("ПЛАВАЮЩИЕ ЖИВОТНЫЕ");
        Swim[] pond = new Swim[4];
        pond[0] = duck;
        pond[1] = fish;
        pond[2] = new Duck("DuckTwo");
        pond[3] = new Fish("FishTwo");

        System.out.print("Итого в пруду плавают: ");
        for (Swim swimmer : pond) {
            swimmer.swim();
        }

        System.out.println();

        System.out.println("ЛЕТАЮЩИЕ ЖИВОТНЫЕ");
        duck.fly();
        eagle.fly();
        System.out.println();

        System.out.println("БЕГАЮЩИЕ ЖИВОТНЫЕ");
        rabbit.run();
        horse.run();
        lion.run();
        System.out.println();

        System.out.println("ПРОВЕРКА СЫТОСТИ");
        duck.printSatiety();
        lion.printSatiety();
        fish.printSatiety();
    }
}


