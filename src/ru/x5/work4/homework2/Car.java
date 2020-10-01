package ru.x5.work4.homework2;

/*
1. Создать абстрактный класс класс Car, и класс Engine
3. Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, мотор типа Engine. Абстрактные методы start(), stop(), и реализованные методы turnRight(), turnLeft()
4. Методы turnRight() и  turnLeft() выводят на экран: "Поворот направо" или "Поворот налево". 
*/

public abstract class Car {
    private static String carModel;
    private static String carClass;
    private static String weight;
    private static Engine engineType;

    Car(String carModel, String carClass, String weight, Engine engineType){
        Car.carModel = carModel;
        Car.carClass = carClass;
        Car.weight = weight;
        Car.engineType = engineType;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public static String getCarModel() {
        return carModel;
    }

    public static String getCarClass() {
        return carClass;
    }

    public static String getWeight() {
        return weight;
    }

    public static String getEngineType() {
        return "Производитель: "+engineType.getManufacturer()+"; Мощьность: "+engineType.getPower();
    }
}
