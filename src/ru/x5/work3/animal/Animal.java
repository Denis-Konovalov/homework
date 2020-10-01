package ru.x5.work3.animal;

/*
+ Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
+ Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
+ Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
*/

public class Animal {
    private String food;
    private String location;

    Animal(String food, String location){
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Животное издает звуки");
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public void sleep() {
        System.out.println("Животное спит");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
