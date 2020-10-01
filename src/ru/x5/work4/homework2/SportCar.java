package ru.x5.work4.homework2;

/*
7.  Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью start(), stop().
Метод start – выводит на экран «SportCar поехал», метод stop -  «SportCar остановился».
*/

public class SportCar extends Car {
    private String maxSpeed;

    SportCar(String carModel, String carClass, String weight, Engine engineType, String maxSpeed) {
        super(carModel, carClass, weight, engineType);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Модель - " + getCarModel());
        System.out.println("Класс - " + getCarClass());
        System.out.println("Вес - " + getWeight());
        System.out.println("Двигатель - " + getEngineType());
        System.out.println("Максимальная скорость - " + maxSpeed);
    }
}
