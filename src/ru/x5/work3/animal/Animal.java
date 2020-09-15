package ru.x5.work3.animal;

/*
+ Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
+ Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
+ Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
*/

public class Animal {
    String food;
    String location;

    public void makeNoise() {
        System.out.println("Животное издает звуки");
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public void sleep() {
        System.out.println("Животное спит");
    }

}
