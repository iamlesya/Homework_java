package org.example;
import model.Kotik;

public class Application {
    public static void main(String[] args){
        System.out.println("программа, моделирующая поведение котика");
        Kotik kotik1 = new Kotik(5, "Барсик", 4, "мяу");
        Kotik kotik2 = new Kotik();
        kotik2.setKotik(3, "Мурзик", 3, "мяу");

        System.out.println("Один день из жизни кота " + kotik1.getName()+": ");
        kotik1.liveAnotherDay();
        System.out.println("Имя этого котика " + kotik1.getName());
        System.out.println("Вес этого котика " + kotik1.getWeight() + " кг");

        System.out.println("Сравнение манеры разговоров котиков:");
        boolean sameMeow = kotik1.getMeow().equals(kotik2.getMeow());
        System.out.println("Котики мяукают одинаково? " + (sameMeow ? "Да" : "Нет"));

        System.out.println("Всего у нас котиков:" + Kotik.getCount());
    }
}
