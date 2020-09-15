package ru.x5.work3.animal;

/*
+ Dog, Cat, Horse переопределяют методы makeNoise, eat.
+ Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
*/

public class Cat extends Animal {
    String colour;

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяучит");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }

}
