package ru.x5.work3.animal;

/*
+ Dog, Cat, Horse переопределяют методы makeNoise, eat.
+ Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
*/

public class Dog extends Animal {
    String name;

    @Override
    public void makeNoise(){
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat(){
        System.out.println("Собака ест");
    }
}
