package ru.x5.work3.animal;

/*
+ Dog, Cat, Horse переопределяют методы makeNoise, eat.
+ Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
*/

public class Horse extends Animal {
    double speed;

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржот");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }
}
