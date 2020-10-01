package ru.x5.work4.homework2;

/*
6. Создать производный от Car класс  - Lorry (грузовик),
характеризуемый также грузоподъемностью кузов, реализовать методы start(), stop().
Метод start – выводит на экран «Грузовик поехал», метод stop -   «грузовик остановился».
5. Абстрактный метод printInfo(), который выводит полную информацию об автомобиле, и моторе.
*/

public class Lorry extends Car {

    private int lifting;

    Lorry(String carModel, String carClass, String weight, Engine engineType, int lifting) {
        super(carModel, carClass, weight, engineType);
        this.lifting = lifting;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Модель - " + getCarModel());
        System.out.println("Класс - " + getCarClass());
        System.out.println("Вес - " + getWeight());
        System.out.println("Двигатель - " + getEngineType());
        System.out.println("Грузоподъемность - " + lifting);
    }
}
